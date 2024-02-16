package application.customer.catalog;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

/**
 *
 * @author shahi
 */
public class PanelLoadAnimation extends javax.swing.JPanel {
    
    private final ImageIcon loadImage;

    public PanelLoadAnimation(ImageIcon loadImage) {
        
        this.loadImage = loadImage;
        
        initComponents();
        
        loadGIF.setIcon(loadImage);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (loadImage != null) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.drawImage(loadImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            g2.dispose();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadGIF = new javax.swing.JLabel();

        setBackground(new java.awt.Color(239, 239, 239));
        setOpaque(false);

        loadGIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/catalog/blackLoader.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loadGIF)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loadGIF)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel loadGIF;
    // End of variables declaration//GEN-END:variables
}
