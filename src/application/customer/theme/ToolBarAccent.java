package application.customer.theme;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.icons.FlatAbstractIcon;
import com.formdev.flatlaf.util.ColorFunctions;
import com.formdev.flatlaf.util.LoggingFacade;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.util.Collections;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author shahi
 */
public class ToolBarAccent extends JPanel {
    
    private final JPopupMenu popup = new JPopupMenu();
    
    private final String[] accentColorKeys = {
        "App.accent.default", "App.accent.blue", "App.accent.purple", "App.accent.red",
        "App.accent.orange", "App.accent.yellow", "App.accent.green",};
    private final String[] accentColorNames = {
        "Default", "Blue", "Purple", "Red", "Orange", "Yellow", "Green",};

    public ToolBarAccent() {
        init();
    }

    private void init() {
        setLayout(new BorderLayout());
        toolbar = new JToolBar();
        add(toolbar);
        putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Menu.background");
        toolbar.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Menu.background");

        popup.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Menu.background;"
                + "borderColor:$Menu.background;");
        ButtonGroup group = new ButtonGroup();
        for (int i = 0; i < accentColorNames.length; i++) {
            String key = accentColorKeys[i];
            JToggleButton tbutton = new JToggleButton(new AccentColorIcon(key));
            tbutton.setSelected(UIManager.getColor("Component.accentColor").equals(UIManager.getColor(key)));
            tbutton.addActionListener((ActionEvent e) -> {
                colorAccentChanged(key);
            });
            group.add(tbutton);
            toolbar.add(tbutton);
        }
    }

    private void colorAccentChanged(String colorKey) {
        if (popup.isVisible()) {
            popup.setVisible(false);
        }
        Color color = UIManager.getColor(colorKey);
        Class<? extends LookAndFeel> lafClass = UIManager.getLookAndFeel().getClass();
        try {
            FlatLaf.setGlobalExtraDefaults(Collections.singletonMap("@accentColor", toHexCode(color)));
            FlatLaf.setup(lafClass.newInstance());
            FlatLaf.updateUI();
        } catch (InstantiationException | IllegalAccessException ex) {
            LoggingFacade.INSTANCE.logSevere(null, ex);
        }
    }

    private String toHexCode(Color color) {
        return String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
    }

    private JToolBar toolbar;

    private class AccentColorIcon extends FlatAbstractIcon {

        private final String colorKey;

        public AccentColorIcon(String colorKey) {
            super(16, 16, null);
            this.colorKey = colorKey;
        }

        @Override
        protected void paintIcon(Component c, Graphics2D g) {
            Color accColor = UIManager.getColor(colorKey);
            if (accColor == null) {
                accColor = Color.lightGray;
            } else if (!c.isEnabled()) {
                accColor = FlatLaf.isLafDark()
                        ? ColorFunctions.shade(accColor, 0.5f)
                        : ColorFunctions.tint(accColor, 0.6f);
            }
            g.setColor(accColor);
            g.fillRoundRect(1, 1, width - 2, height - 2, 5, 5);
        }
    }
}
