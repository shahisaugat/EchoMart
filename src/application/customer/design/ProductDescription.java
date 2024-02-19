package application.customer.design;

import application.customer.forms.Dashboard;
import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;

/**
 *
 * @author shahi
 */
public class ProductDescription extends javax.swing.JPanel {
    
    private int headerVar = 0;
    private int varQtyValue = 0;

    public ProductDescription() {
        initComponents();
        
        JScrollBar vScroll = jScrollPane1.getVerticalScrollBar();
        vScroll.putClientProperty(FlatClientProperties.STYLE, ""
                + "width:$Menu.scroll.width;"
                + "trackInsets:$Menu.scroll.trackInsets;"
                + "thumbInsets:$Menu.scroll.thumbInsets;"
                + "background:$Menu.ScrollBar.background;"
                + "thumb:$Menu.ScrollBar.thumb");
        
        String description = "<html><body style='width: 300px; font-size: 12px;'>" +
        "<p style='margin-top: 0; margin-bottom: 0px;'>The Analog Watch offers timeless elegance with its classic design and reliable performance. Powered by quartz movement, it ensures accurate timekeeping. The watch features a comfortable leather strap that adds a touch of luxury to your wrist. With its water-resistant construction, you can wear it confidently in various environments.</p>" +
                "<p><b style='margin-top: 0;'>Features:</b></p>" +
        "<ul style='margin-top: 0; margin-bottom: 0px;'>" +
        "<li>Classic Design</li>" +
        "<li>Quartz Movement</li>" +
        "<li>Leather Strap</li>" +
        "<li>Water Resistant</li>" +
        "</ul>" + "</body></html>";

        desc.setContentType("text/html");
        desc.setText(description);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showImg1 = new application.customer.design.PictureHolder();
        showImg2 = new application.customer.design.PictureHolder();
        showImg3 = new application.customer.design.PictureHolder();
        pictureView = new application.customer.design.PictureHolder();
        descLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextPane();
        qtyLabel = new javax.swing.JLabel();
        decQty = new javax.swing.JButton();
        incQty = new javax.swing.JButton();
        addToCartBtn = new javax.swing.JButton();
        headerLabel = new javax.swing.JLabel();
        pidLabel = new javax.swing.JLabel();
        pNameLabel = new javax.swing.JLabel();
        colorLabel = new javax.swing.JLabel();
        conditionLabel = new javax.swing.JLabel();
        productId = new javax.swing.JLabel();
        productName = new javax.swing.JLabel();
        color1 = new application.customer.design.PanelRound();
        color2 = new application.customer.design.PanelRound();
        color3 = new application.customer.design.PanelRound();
        color4 = new application.customer.design.PanelRound();
        condition = new javax.swing.JLabel();
        varQty = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        showImg1.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/design/Mask group (13).png"))); // NOI18N
        showImg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showImg1MouseClicked(evt);
            }
        });

        showImg2.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/design/Mask group (13).png"))); // NOI18N
        showImg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showImg2MouseClicked(evt);
            }
        });

        showImg3.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/design/Mask group (13).png"))); // NOI18N
        showImg3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showImg3MouseClicked(evt);
            }
        });

        pictureView.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/design/Mask group (13).png"))); // NOI18N

        descLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        descLabel.setText("Description");

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        desc.setEditable(false);
        desc.setBorder(null);
        desc.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        desc.setFocusable(false);
        jScrollPane1.setViewportView(desc);

        qtyLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        qtyLabel.setText("Quantity");

        decQty.setBackground(new java.awt.Color(255, 92, 0));
        decQty.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        decQty.setForeground(new java.awt.Color(255, 255, 255));
        decQty.setText("-");
        decQty.setBorderPainted(false);
        decQty.setFocusPainted(false);
        decQty.setFocusable(false);
        decQty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decQtyMouseClicked(evt);
            }
        });

        incQty.setBackground(new java.awt.Color(255, 92, 0));
        incQty.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        incQty.setForeground(new java.awt.Color(255, 255, 255));
        incQty.setText("+");
        incQty.setBorderPainted(false);
        incQty.setFocusPainted(false);
        incQty.setFocusable(false);
        incQty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                incQtyMouseClicked(evt);
            }
        });
        incQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incQtyActionPerformed(evt);
            }
        });

        addToCartBtn.setBackground(new java.awt.Color(255, 92, 0));
        addToCartBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        addToCartBtn.setForeground(new java.awt.Color(255, 255, 255));
        addToCartBtn.setText("Add to cart");
        addToCartBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addToCartBtnMouseClicked(evt);
            }
        });

        headerLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        headerLabel.setText("Product Information");

        pidLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        pidLabel.setText("Product Id :");

        pNameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        pNameLabel.setText("Product Name :");

        colorLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        colorLabel.setText("Color Variation :");

        conditionLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        conditionLabel.setText("Condition :");

        productId.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        productId.setText("#12D2341D");

        productName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        productName.setText("Naviforce Watch");

        color1.setBackground(new java.awt.Color(0, 153, 51));
        color1.setRoundBottomLeft(18);
        color1.setRoundBottomRight(18);
        color1.setRoundTopLeft(18);
        color1.setRoundTopRight(18);

        javax.swing.GroupLayout color1Layout = new javax.swing.GroupLayout(color1);
        color1.setLayout(color1Layout);
        color1Layout.setHorizontalGroup(
            color1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        color1Layout.setVerticalGroup(
            color1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        color2.setBackground(new java.awt.Color(255, 153, 0));
        color2.setRoundBottomLeft(18);
        color2.setRoundBottomRight(18);
        color2.setRoundTopLeft(18);
        color2.setRoundTopRight(18);

        javax.swing.GroupLayout color2Layout = new javax.swing.GroupLayout(color2);
        color2.setLayout(color2Layout);
        color2Layout.setHorizontalGroup(
            color2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        color2Layout.setVerticalGroup(
            color2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        color3.setBackground(new java.awt.Color(51, 51, 51));
        color3.setRoundBottomLeft(18);
        color3.setRoundBottomRight(18);
        color3.setRoundTopLeft(18);
        color3.setRoundTopRight(18);

        javax.swing.GroupLayout color3Layout = new javax.swing.GroupLayout(color3);
        color3.setLayout(color3Layout);
        color3Layout.setHorizontalGroup(
            color3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        color3Layout.setVerticalGroup(
            color3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        color4.setBackground(new java.awt.Color(255, 0, 0));
        color4.setForeground(new java.awt.Color(204, 102, 0));
        color4.setRoundBottomLeft(18);
        color4.setRoundBottomRight(18);
        color4.setRoundTopLeft(18);
        color4.setRoundTopRight(18);

        javax.swing.GroupLayout color4Layout = new javax.swing.GroupLayout(color4);
        color4.setLayout(color4Layout);
        color4Layout.setHorizontalGroup(
            color4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        color4Layout.setVerticalGroup(
            color4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        condition.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        condition.setText("Like New");

        varQty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        varQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        varQty.setText("0");
        varQty.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pidLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(productId, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(headerLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showImg2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showImg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(pictureView, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(descLabel)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(colorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(color1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(color2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(color3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(color4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(conditionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(condition, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addToCartBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qtyLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(decQty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(varQty, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(incQty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pidLabel)
                        .addComponent(colorLabel)
                        .addComponent(productId))
                    .addComponent(color4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conditionLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pNameLabel)
                        .addComponent(productName)
                        .addComponent(condition)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(descLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(varQty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(qtyLabel)
                                .addComponent(decQty)
                                .addComponent(incQty)))
                        .addGap(24, 24, 24)
                        .addComponent(addToCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pictureView, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(showImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(showImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(showImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showImg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showImg1MouseClicked
        ImageIcon img1 = new ImageIcon(getClass().getResource("/application/customer/catalog/image2.png/"));
        pictureView.setImage(img1);
        
        
        revalidate();
        repaint();
    }//GEN-LAST:event_showImg1MouseClicked

    private void showImg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showImg2MouseClicked
        ImageIcon img2 = new ImageIcon(getClass().getResource("/application/customer/catalog/image3.png/"));
        pictureView.setImage(img2);
        
        revalidate();
        repaint();
    }//GEN-LAST:event_showImg2MouseClicked

    private void showImg3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showImg3MouseClicked
        ImageIcon img3 = new ImageIcon(getClass().getResource("/application/customer/catalog/image4.png/"));
        pictureView.setImage(img3);
        
        revalidate();
        repaint();
    }//GEN-LAST:event_showImg3MouseClicked

    private void incQtyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incQtyMouseClicked
        String stringVar = varQty.getText();
        varQtyValue = Integer.parseInt(stringVar);
        varQtyValue++;
        varQty.setText(Integer.toString(varQtyValue));
    }//GEN-LAST:event_incQtyMouseClicked

    private void decQtyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decQtyMouseClicked
        String stringVar = varQty.getText();
        varQtyValue = Integer.parseInt(stringVar);
        if (varQtyValue > 0) { 
            varQtyValue--;
            varQty.setText(Integer.toString(varQtyValue)); 
        }
    }//GEN-LAST:event_decQtyMouseClicked

    private void incQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incQtyActionPerformed
        
    }//GEN-LAST:event_incQtyActionPerformed

    private void addToCartBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addToCartBtnMouseClicked
        headerVar += varQtyValue; 
        Dashboard.setHeaderCart(headerVar);
    }//GEN-LAST:event_addToCartBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartBtn;
    private application.customer.design.PanelRound color1;
    private application.customer.design.PanelRound color2;
    private application.customer.design.PanelRound color3;
    private application.customer.design.PanelRound color4;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JLabel condition;
    private javax.swing.JLabel conditionLabel;
    private javax.swing.JButton decQty;
    private javax.swing.JTextPane desc;
    private javax.swing.JLabel descLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JButton incQty;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pNameLabel;
    private application.customer.design.PictureHolder pictureView;
    private javax.swing.JLabel pidLabel;
    private javax.swing.JLabel productId;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel qtyLabel;
    private application.customer.design.PictureHolder showImg1;
    private application.customer.design.PictureHolder showImg2;
    private application.customer.design.PictureHolder showImg3;
    private javax.swing.JTextField varQty;
    // End of variables declaration//GEN-END:variables
}
