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
        
        revalidate();
        repaint();
        
        productImage.setImage(img);
        productName.setText(name);
        productPrice.setText(price);
        shippingStatus.setText(status);
        deliveryTime.setText(time);
        
        productName.setBorder(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shippingStatus = new javax.swing.JLabel();
        rating = new javax.swing.JLabel();
        deliveryTime = new javax.swing.JLabel();
        productImage = new application.customer.design.PictureHolder();
        addToFavourite = new application.customer.design.PictureHolder();
        addToCart = new application.customer.design.PictureHolder();
        ratingImage = new application.customer.design.PictureHolder();
        productPrice = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        productName = new javax.swing.JTextPane();

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

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setFocusable(false);

        productName.setEditable(false);
        productName.setBorder(null);
        productName.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        productName.setText("Redmi Note 12s");
        productName.setFocusable(false);
        jScrollPane2.setViewportView(productName);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ratingImage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rating, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(shippingStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deliveryTime)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productImage, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productImage, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ratingImage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rating))
                .addGap(11, 11, 11)
                .addComponent(productPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shippingStatus)
                    .addComponent(deliveryTime))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addToFavouriteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addToFavouriteMouseEntered
        
    }//GEN-LAST:event_addToFavouriteMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private application.customer.design.PictureHolder addToCart;
    private application.customer.design.PictureHolder addToFavourite;
    private javax.swing.JLabel deliveryTime;
    private javax.swing.JScrollPane jScrollPane2;
    private application.customer.design.PictureHolder productImage;
    private javax.swing.JTextPane productName;
    private javax.swing.JLabel productPrice;
    private javax.swing.JLabel rating;
    private application.customer.design.PictureHolder ratingImage;
    private javax.swing.JLabel shippingStatus;
    // End of variables declaration//GEN-END:variables
}
