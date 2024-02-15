package application.customer.catalog;

import javax.swing.ImageIcon;

/**
 *
 * @author shahi
 */
public class Catalogue extends javax.swing.JPanel {

    /**
     * Creates new form Catalogue
     * @param img
     * @param name
     * @param price
     * @param status
     * @param time
     */
    public Catalogue(ImageIcon img, String name, String price, String status, String time) {
        initComponents();
        
        productImage.setImage(img);
        productName.setText(name);
        productPrice.setText(price);
        shippingStatus.setText(status);
        deliveryTime.setText(time);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productName = new javax.swing.JTextPane();
        shippingStatus = new javax.swing.JLabel();
        rating = new javax.swing.JLabel();
        deliveryTime = new javax.swing.JLabel();
        productImage = new application.customer.design.PictureHolder();
        addToFavourite = new application.customer.design.PictureHolder();
        addToCart = new application.customer.design.PictureHolder();
        ratingImage = new application.customer.design.PictureHolder();
        productPrice = new javax.swing.JLabel();

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        productName.setEditable(false);
        productName.setBorder(null);
        productName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        productName.setText("Redmi Note 12s");
        productName.setAutoscrolls(false);
        productName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        productName.setFocusable(false);
        productName.setOpaque(false);
        jScrollPane1.setViewportView(productName);

        shippingStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        shippingStatus.setText("Free Shipping");

        rating.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rating.setText("4.5");

        deliveryTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deliveryTime.setText("2 Days Delivery");

        productImage.setBackground(new java.awt.Color(255, 255, 255));
        productImage.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/woman.png"))); // NOI18N
        productImage.setOpaque(true);

        addToFavourite.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/catalog/Group 9 (6).png"))); // NOI18N
        addToFavourite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addToFavouriteMouseEntered(evt);
            }
        });
        productImage.add(addToFavourite);
        addToFavourite.setBounds(180, 10, 40, 40);

        addToCart.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/catalog/Group 10 (1).png"))); // NOI18N
        productImage.add(addToCart);
        addToCart.setBounds(180, 60, 40, 40);

        ratingImage.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/catalog/Vector (7).png"))); // NOI18N

        productPrice.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        productPrice.setText("$ 120.34");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(shippingStatus)
                                .addGap(34, 34, 34)
                                .addComponent(deliveryTime))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(ratingImage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rating, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productImage, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productImage, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ratingImage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rating, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(productPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deliveryTime)
                    .addComponent(shippingStatus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addToFavouriteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addToFavouriteMouseEntered
        
    }//GEN-LAST:event_addToFavouriteMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private application.customer.design.PictureHolder addToCart;
    private application.customer.design.PictureHolder addToFavourite;
    private javax.swing.JLabel deliveryTime;
    private javax.swing.JScrollPane jScrollPane1;
    private application.customer.design.PictureHolder productImage;
    private javax.swing.JTextPane productName;
    private javax.swing.JLabel productPrice;
    private javax.swing.JLabel rating;
    private application.customer.design.PictureHolder ratingImage;
    private javax.swing.JLabel shippingStatus;
    // End of variables declaration//GEN-END:variables
}
