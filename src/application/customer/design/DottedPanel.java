package application.customer.design;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import javax.swing.JPanel;

/**
 *
 * @author shahi
 */
public class DottedPanel extends JPanel {
    
    public DottedPanel() {
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        
        int gap = 5;
        int arcWidth = 20;
        int arcHeight = 20;
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Stroke stroke = new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 0, new float[]{5}, 0);
        g2d.setStroke(stroke);

        int x = gap;
        int y = gap;
        int width = getWidth() - 2 * gap;
        int height = getHeight() - 2 * gap;

        g2d.setColor(Color.decode("#FF5C00"));
        g2d.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
    }
}
