package application.customer.design;

import application.customer.forms.Dashboard;
import javax.swing.ImageIcon;

/**
 *
 * @author shahi
 */
public class ProductDescription extends javax.swing.JPanel {
    
    private int headerVar = 0;
    private int varQtyValue = 0;

    public ProductDescription(int pID, String pName, String pCondition, String pDesc, ImageIcon image1, ImageIcon image2, ImageIcon image3, String oName, String oMail, String oContact, String oRep) {
        initComponents();
        
        productId.setText(Integer.toString(pID));
        productName.setText(pName);
        condition.setText(pCondition);
        desc.setText(pDesc);
        showImg1.setImage(image1);
        showImg2.setImage(image2);
        showImg3.setImage(image3);
        pictureView.setImage(image1);
        ownerName.setText(oName);
        ownerContact.setText(oContact);
        ownerGmail.setText(oMail);
        ownerRepScore.setText(oRep);
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
        color8 = new application.customer.design.PanelRound();
        color5 = new application.customer.design.PanelRound();
        condition = new javax.swing.JLabel();
        varQty = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panelRound1 = new application.customer.design.PanelRound();
        ownerProfile = new application.customer.design.ImageAvatar();
        ownerName = new javax.swing.JLabel();
        ownerContact = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        commentsScroll = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jSeparator2 = new javax.swing.JSeparator();
        ownerGmail = new javax.swing.JLabel();
        ownerRepScore = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ownerAccountStatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        showImg1.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Mask group (13).png"))); // NOI18N
        showImg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showImg1MouseClicked(evt);
            }
        });

        showImg2.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Mask group (13).png"))); // NOI18N
        showImg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showImg2MouseClicked(evt);
            }
        });

        showImg3.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Mask group (13).png"))); // NOI18N
        showImg3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showImg3MouseClicked(evt);
            }
        });

        pictureView.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Mask group (6).png"))); // NOI18N

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

        color8.setBackground(new java.awt.Color(51, 51, 51));
        color8.setRoundBottomLeft(18);
        color8.setRoundBottomRight(18);
        color8.setRoundTopLeft(18);
        color8.setRoundTopRight(18);

        javax.swing.GroupLayout color8Layout = new javax.swing.GroupLayout(color8);
        color8.setLayout(color8Layout);
        color8Layout.setHorizontalGroup(
            color8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        color8Layout.setVerticalGroup(
            color8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        color5.setBackground(new java.awt.Color(255, 0, 0));
        color5.setForeground(new java.awt.Color(204, 102, 0));
        color5.setRoundBottomLeft(18);
        color5.setRoundBottomRight(18);
        color5.setRoundTopLeft(18);
        color5.setRoundTopRight(18);

        javax.swing.GroupLayout color5Layout = new javax.swing.GroupLayout(color5);
        color5.setLayout(color5Layout);
        color5Layout.setHorizontalGroup(
            color5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        color5Layout.setVerticalGroup(
            color5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        condition.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        condition.setText("Like New");

        varQty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        varQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        varQty.setText("0");
        varQty.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel1.setText("Owner Description");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Comments");

        panelRound1.setBackground(new java.awt.Color(244, 244, 244));
        panelRound1.setRoundBottomLeft(12);
        panelRound1.setRoundBottomRight(12);
        panelRound1.setRoundTopLeft(12);
        panelRound1.setRoundTopRight(12);

        ownerProfile.setBorderSize(2);
        ownerProfile.setBorderSpace(1);
        ownerProfile.setGradientColor1(new java.awt.Color(255, 92, 0));
        ownerProfile.setGradientColor2(new java.awt.Color(255, 92, 0));
        ownerProfile.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/image1.png"))); // NOI18N

        ownerName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        ownerName.setText("Saugat Shahi Thakuri");

        ownerContact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ownerContact.setText("9866291003");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ownerProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ownerName)
                    .addComponent(ownerContact))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ownerProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ownerName)
                .addGap(4, 4, 4)
                .addComponent(ownerContact)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        commentsScroll.setBorder(null);
        commentsScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setViewportView(jTextPane1);

        ownerGmail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        ownerGmail.setText("Email Id: devops.shahi@gmail.com");

        ownerRepScore.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ownerRepScore.setText("Rep Score: 120");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("See reviews");

        ownerAccountStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ownerAccountStatus.setText("Account Verification Status: Verified");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4)
                                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ownerRepScore)
                                    .addComponent(ownerGmail)
                                    .addComponent(ownerAccountStatus)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(commentsScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                    .addComponent(color8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(color5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(incQty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(headerLabel)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pidLabel)
                        .addComponent(colorLabel)
                        .addComponent(productId))
                    .addComponent(color5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ownerGmail)
                        .addGap(18, 18, 18)
                        .addComponent(ownerRepScore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ownerAccountStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(commentsScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void decQtyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decQtyMouseClicked
        String stringVar = varQty.getText();
        varQtyValue = Integer.parseInt(stringVar);
        if (varQtyValue > 0) {
            varQtyValue--;
            varQty.setText(Integer.toString(varQtyValue));
        }
    }//GEN-LAST:event_decQtyMouseClicked

    private void showImg3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showImg3MouseClicked
        ImageIcon img3 = new ImageIcon(getClass().getResource("/application/customer/catalog/image4.png/"));
        pictureView.setImage(img3);

        revalidate();
        repaint();
    }//GEN-LAST:event_showImg3MouseClicked

    private void showImg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showImg2MouseClicked
        ImageIcon img2 = new ImageIcon(getClass().getResource("/application/customer/catalog/image3.png/"));
        pictureView.setImage(img2);

        revalidate();
        repaint();
    }//GEN-LAST:event_showImg2MouseClicked

    private void showImg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showImg1MouseClicked
        ImageIcon img1 = new ImageIcon(getClass().getResource("/application/customer/catalog/image2.png/"));
        pictureView.setImage(img1);

        revalidate();
        repaint();
    }//GEN-LAST:event_showImg1MouseClicked

    private void addToCartBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addToCartBtnMouseClicked
        headerVar += varQtyValue;
        Dashboard.setHeaderCart(headerVar);
    }//GEN-LAST:event_addToCartBtnMouseClicked

    private void incQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incQtyActionPerformed

    }//GEN-LAST:event_incQtyActionPerformed

    private void incQtyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incQtyMouseClicked
        String stringVar = varQty.getText();
        varQtyValue = Integer.parseInt(stringVar);
        varQtyValue++;
        varQty.setText(Integer.toString(varQtyValue));
    }//GEN-LAST:event_incQtyMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartBtn;
    private application.customer.design.PanelRound color1;
    private application.customer.design.PanelRound color2;
    private application.customer.design.PanelRound color5;
    private application.customer.design.PanelRound color8;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JScrollPane commentsScroll;
    private javax.swing.JLabel condition;
    private javax.swing.JLabel conditionLabel;
    private javax.swing.JButton decQty;
    private javax.swing.JTextPane desc;
    private javax.swing.JLabel descLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JButton incQty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel ownerAccountStatus;
    private javax.swing.JLabel ownerContact;
    private javax.swing.JLabel ownerGmail;
    private javax.swing.JLabel ownerName;
    private application.customer.design.ImageAvatar ownerProfile;
    private javax.swing.JLabel ownerRepScore;
    private javax.swing.JLabel pNameLabel;
    private application.customer.design.PanelRound panelRound1;
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
