package application.customer.catalog;

import javax.swing.ImageIcon;

/**
 *
 * @author shahi
 */
public class TileViewCatalogue extends javax.swing.JPanel {

    public TileViewCatalogue(String pName, String description, String pPrice, String pRating, ImageIcon pImg, String dStatus, String ownerLocate) {
        initComponents();
        
        productName.setText(pName);
        desc.setText(description);
        price.setText(pPrice);
        rating.setText(pRating);
        pictureHolder1.setImage(pImg);
        deliveryStatus.setText(dStatus);
        location.setText(ownerLocate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new application.customer.design.PanelRound();
        jButton1 = new javax.swing.JButton();
        pictureHolder1 = new application.customer.design.PictureHolder();
        productName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextPane();
        price = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        deliveryStatus = new javax.swing.JLabel();
        rating = new javax.swing.JLabel();

        panelRound1.setBackground(new java.awt.Color(244, 244, 244));
        panelRound1.setRoundBottomLeft(12);
        panelRound1.setRoundBottomRight(12);
        panelRound1.setRoundTopLeft(12);
        panelRound1.setRoundTopRight(12);

        jButton1.setBackground(new java.awt.Color(244, 244, 244));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/catalog/newImage.png"))); // NOI18N
        jButton1.setBorder(null);

        pictureHolder1.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/catalog/image3.png"))); // NOI18N

        productName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        productName.setText("Naviforce Watch");

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        desc.setEditable(false);
        desc.setBackground(new java.awt.Color(244, 244, 244));
        desc.setBorder(null);
        desc.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        desc.setText("I have not used this watch for so long and got a new one recently so though to sell it!");
        desc.setFocusable(false);
        jScrollPane1.setViewportView(desc);

        price.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        price.setText("NRs. 12000");

        location.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        location.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        location.setText("Bagmati, Lalitpur");

        deliveryStatus.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        deliveryStatus.setText("Free Delivery");

        rating.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rating.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rating.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/design/Vector (4).png"))); // NOI18N
        rating.setText("4.5");
        rating.setIconTextGap(7);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pictureHolder1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deliveryStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(location, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rating, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(12, 12, 12))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(pictureHolder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productName)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price)
                            .addComponent(rating))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(location)
                            .addComponent(deliveryStatus))
                        .addGap(12, 12, 12))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deliveryStatus;
    private javax.swing.JTextPane desc;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel location;
    private application.customer.design.PanelRound panelRound1;
    private application.customer.design.PictureHolder pictureHolder1;
    private javax.swing.JLabel price;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel rating;
    // End of variables declaration//GEN-END:variables
}
