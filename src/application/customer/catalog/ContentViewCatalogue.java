package application.customer.catalog;

import application.customer.design.ScrollableDesc;
import application.customer.forms.Dashboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author shahi
 */
public class ContentViewCatalogue extends javax.swing.JPanel {
    
//    private final ScrollableDesc desc;
//    private final JDialog descDialog;
    private int fetchedHeaderFav;
    
    public ContentViewCatalogue(ImageIcon img, String name, String price, String status, String cond) {
        initComponents();
        
        productImage.setImage(img);
        productName.setText(name);
        productPrice.setText(price);
        shippingStatus.setText(status);
        productCondition.setText(cond);
        
//        desc = new ScrollableDesc();
        
//        descDialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Profile Setup", true);
//        descDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
//        descDialog.getContentPane().add(desc);
//        descDialog.pack();
        
        jButton2.addActionListener(new ButtonClickListener());
    }
    
    private class ButtonClickListener implements ActionListener {
        private boolean isIcon1 = true; 

        @Override
        public void actionPerformed(ActionEvent e) {
           JButton source = (JButton) e.getSource();

            if (isIcon1) {
               source.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/catalog/Group 20 (2).png")));
               fetchedHeaderFav = Dashboard.getHeaderFav();
               fetchedHeaderFav++;
            } else {
               source.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/catalog/Group 20 (1).png")));
               fetchedHeaderFav = Dashboard.getHeaderFav();
               fetchedHeaderFav--;
            }
            
            Dashboard.setHeaderFav(fetchedHeaderFav);
            
            isIcon1 = !isIcon1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new application.customer.design.PanelRound();
        productImage = new application.customer.design.PictureHolder();
        jButton2 = new javax.swing.JButton();
        productName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        productPrice = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productCondition = new javax.swing.JLabel();
        shippingStatus = new javax.swing.JLabel();

        panelRound1.setBackground(new java.awt.Color(244, 244, 244));
        panelRound1.setRoundBottomLeft(8);
        panelRound1.setRoundBottomRight(8);
        panelRound1.setRoundTopLeft(8);
        panelRound1.setRoundTopRight(8);

        productImage.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/catalog/image4.png"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/catalog/Group 20 (1).png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);

        productImage.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout productImageLayout = new javax.swing.GroupLayout(productImage);
        productImage.setLayout(productImageLayout);
        productImageLayout.setHorizontalGroup(
            productImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productImageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        productImageLayout.setVerticalGroup(
            productImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        productName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        productName.setText("Naviforce Watch");

        jButton1.setBackground(new java.awt.Color(255, 92, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View Details");
        jButton1.setBorder(null);
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        productPrice.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        productPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        productPrice.setText("NRs. 1200");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/design/Vector (4).png"))); // NOI18N
        jLabel3.setText("4.5");

        productCondition.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        productCondition.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        productCondition.setText("Like New");

        shippingStatus.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        shippingStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        shippingStatus.setText("Free Delivery");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(productCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shippingStatus)))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(productImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(productImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productPrice)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productCondition)
                    .addComponent(shippingStatus))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
//        showDescDialog();
    }//GEN-LAST:event_jButton1MouseClicked
    
//    private void showDescDialog() {
//        
//        int centerX = (int) (this.getTopLevelAncestor().getLocationOnScreen().getX() + this.getTopLevelAncestor().getSize().getWidth() / 2 - descDialog.getWidth() / 2);
//        int centerY = (int) (this.getTopLevelAncestor().getLocationOnScreen().getY() + this.getTopLevelAncestor().getSize().getHeight() / 2 - descDialog.getHeight() / 2);
//
//        descDialog.setLocation(centerX, centerY);
//        descDialog.setVisible(true);
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private application.customer.design.PanelRound panelRound1;
    private javax.swing.JLabel productCondition;
    private application.customer.design.PictureHolder productImage;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productPrice;
    private javax.swing.JLabel shippingStatus;
    // End of variables declaration//GEN-END:variables
}
