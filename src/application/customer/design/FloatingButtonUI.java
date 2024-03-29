package application.customer.design;

import application.customer.catalog.ShadowRenderer;
import application.customer.forms.Dashboard;
import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLayer;
import javax.swing.SwingUtilities;
import javax.swing.plaf.LayerUI;

public class FloatingButtonUI extends LayerUI<Dashboard> {

    private Shape shape;
    private boolean mousePressed;
    private boolean mouseHovered;
    private final Image image;
    private BufferedImage imageShadow;

    public FloatingButtonUI() {
        image = new ImageIcon(getClass().getResource("/application/customer/image/Edit (2).png/")).getImage();
    }

    @Override
    public void installUI(JComponent jc) {
        super.installUI(jc);
        if (jc instanceof JLayer) {
            ((JLayer) jc).setLayerEventMask(AWTEvent.MOUSE_EVENT_MASK | AWTEvent.MOUSE_MOTION_EVENT_MASK);
        }
    }

    @Override
    public void uninstallUI(JComponent jc) {
        super.uninstallUI(jc);
        if (jc instanceof JLayer) {
            ((JLayer) jc).setLayerEventMask(0);
        }
    }

    @Override
    public void paint(Graphics grphcs, JComponent jc) {
        super.paint(grphcs, jc);
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int size = 48;
        int x = jc.getWidth() - size - 26;
        int y = jc.getHeight() - size - 26;
        shape = new Ellipse2D.Double(x, y, size, size);
        if (mousePressed) {
            g2.setColor(new Color(210, 72, 0));
        } else if (mouseHovered) {
            g2.setColor(new Color(240, 82, 0));
        } else {
            g2.setColor(new Color(255, 92, 0));
        }
        if (imageShadow == null) {
            createImageShadow(size);
        }
        g2.drawImage(imageShadow, x - 5, y - 5, null);
        g2.fill(shape);
        int iconSize = 24;
        int iconX = (size - iconSize) / 2;
        int iconY = (size - iconSize) / 2;
        g2.drawImage(image, x + iconX + 2, y + iconY, null);
        g2.dispose();
    }

    @Override
    protected void processMouseEvent(MouseEvent me, JLayer<? extends Dashboard> jlayer) {
        if (mouseHovered) {
            me.consume();
        }
        if (SwingUtilities.isLeftMouseButton(me)) {
            if (me.getID() == MouseEvent.MOUSE_PRESSED) {
                if (mouseHovered) {
                    mousePressed = true;
                    jlayer.repaint(shape.getBounds());
                }
            } else if (me.getID() == MouseEvent.MOUSE_RELEASED) {
                mousePressed = false;
                jlayer.repaint(shape.getBounds());
                if (mouseHovered) {
                    Dashboard main = jlayer.getView();
                    main.actionButton();
                }
            }
        }
    }

    @Override
    protected void processMouseMotionEvent(MouseEvent me, JLayer<? extends Dashboard> jlayer) {
        if (shape == null) {
            return;
        }
        Point point = SwingUtilities.convertPoint(me.getComponent(), me.getPoint(), jlayer.getView());
        boolean hover = shape.contains(point);
        if (mouseHovered != hover) {
            mouseHovered = hover;
            jlayer.repaint(shape.getBounds());
            if (hover) {
                jlayer.setCursor(new Cursor(Cursor.HAND_CURSOR));
            } else {
                jlayer.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        }
        if (mousePressed) {
            me.consume();
        }
    }

    private void createImageShadow(int size) {
        int shadowSize = 6;
        int width = size + shadowSize * 2;
        int height = size + shadowSize * 2;
        imageShadow = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = imageShadow.createGraphics();
        g2.drawImage(new ShadowRenderer(shadowSize, 0.3f, Color.BLACK).createShadow(createShape(size)), 0, 0, null);
        g2.dispose();
    }

    private BufferedImage createShape(int size) {
        BufferedImage img = new BufferedImage(size, size, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.fill(new Ellipse2D.Double(0, 0, size, size));
        g2.dispose();
        return img;
    }
}