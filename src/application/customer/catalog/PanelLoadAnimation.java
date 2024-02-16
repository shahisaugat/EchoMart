package application.customer.catalog;

import javax.swing.ImageIcon;

/**
 *
 * @author shahi
 */
public class PanelLoadAnimation extends javax.swing.JPanel {

    public PanelLoadAnimation(ImageIcon loadImage) {
        initComponents();
        
        loadGIF.setIcon(loadImage);
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
