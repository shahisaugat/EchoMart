package application.customer.catalog;

import application.customer.design.ProductDescription;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author shahi
 */
public class Catalogue extends javax.swing.JPanel {
    
    private final ProductDescription desc;
    private final JDialog descDialog;
    
    public Catalogue(ImageIcon img, String name, String price, String status, String time) {
        initComponents();
        
        productImage.setImage(img);
        productName.setText(name);
        productPrice.setText(price);
        shippingStatus.setText(status);
        rating.setText(time);
        
        desc = new ProductDescription();
        
        descDialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Profile Setup", true);
        descDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        descDialog.getContentPane().add(desc);
        descDialog.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new application.customer.catalog.PanelShadow();
        productImage = new application.customer.design.PictureHolder();
        productPrice = new javax.swing.JLabel();
        productName = new javax.swing.JLabel();
        rating = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        shippingStatus = new javax.swing.JLabel();

        productImage.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/design/Mask group (13).png"))); // NOI18N

        javax.swing.GroupLayout productImageLayout = new javax.swing.GroupLayout(productImage);
        productImage.setLayout(productImageLayout);
        productImageLayout.setHorizontalGroup(
            productImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        productImageLayout.setVerticalGroup(
            productImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        panelShadow1.add(productImage);
        productImage.setBounds(20, 20, 150, 90);

        productPrice.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        productPrice.setText("$ 1200");
        panelShadow1.add(productPrice);
        productPrice.setBounds(20, 144, 90, 21);

        productName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        productName.setText("Naviforce Watch");
        panelShadow1.add(productName);
        productName.setBounds(20, 120, 140, 21);

        rating.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rating.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/design/Vector (4).png"))); // NOI18N
        rating.setText("4.5");
        panelShadow1.add(rating);
        rating.setBounds(130, 170, 40, 18);

        jButton1.setBackground(new java.awt.Color(255, 92, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View Details");
        jButton1.setBorderPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelShadow1.add(jButton1);
        jButton1.setBounds(20, 202, 150, 27);

        shippingStatus.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        shippingStatus.setText("Free Delivery");
        panelShadow1.add(shippingStatus);
        shippingStatus.setBounds(20, 171, 100, 18);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showDescDialog();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void showDescDialog() {
        
        int centerX = (int) (this.getTopLevelAncestor().getLocationOnScreen().getX() + this.getTopLevelAncestor().getSize().getWidth() / 2 - descDialog.getWidth() / 2);
        int centerY = (int) (this.getTopLevelAncestor().getLocationOnScreen().getY() + this.getTopLevelAncestor().getSize().getHeight() / 2 - descDialog.getHeight() / 2);

        descDialog.setLocation(centerX, centerY);
        descDialog.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private application.customer.catalog.PanelShadow panelShadow1;
    private application.customer.design.PictureHolder productImage;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productPrice;
    private javax.swing.JLabel rating;
    private javax.swing.JLabel shippingStatus;
    // End of variables declaration//GEN-END:variables
}
