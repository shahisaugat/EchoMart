package application.customer.catalog;

import application.customer.design.HoverOver;
import java.awt.Dimension;
import javax.swing.ImageIcon;

/**
 *
 * @author shahi
 */
public class Catalogue extends javax.swing.JPanel {
    
    private final HoverOver hoverOver;

    public Catalogue(ImageIcon img, String name, String price, String status, String time) {
        initComponents();
        
        hoverOver = new HoverOver();
        hoverOver.setSize(new Dimension(150, 90));
        hoverOver.setVisible(false);
        add(hoverOver);
        
        productImage.setImage(img);
        productName.setText(name);
        productPrice.setText(price);
        shippingStatus.setText(status);
        rating.setText(time);
        
        int hoverX = productImage.getX();
        int hoverY = productImage.getY();
        hoverOver.setBounds(hoverX, hoverY, hoverOver.getWidth(), hoverOver.getHeight());
        
        setComponentZOrder(hoverOver, 0);
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
        productImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productImageMouseExited(evt);
            }
        });
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
        jButton1.setText("Add to cart");
        jButton1.setBorderPainted(false);
        jButton1.setFocusable(false);
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
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void productImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productImageMouseEntered
        hoverActive();
    }//GEN-LAST:event_productImageMouseEntered

    private void productImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productImageMouseExited
        hoverInactive();
    }//GEN-LAST:event_productImageMouseExited

    void hoverActive() {
        hoverOver.setVisible(true);
    }
    
    void hoverInactive() {
        hoverOver.setVisible(false);
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
