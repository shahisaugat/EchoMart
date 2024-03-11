package application.customer.forms;

import application.customer.dao.ProductDataDAO;
import application.customer.model.CatalogModel;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileNameExtensionFilter;
import raven.toast.Notifications;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 *
 * @author shahi
 */
public class UploadCatalogue extends javax.swing.JPanel {
    
    private final File[] selectedFiles = new File[3];
    private final SimpleDateFormat dateFormat;
    private final String formattedDate;
    
    private final JProgressBar progressBar;
    
    public UploadCatalogue() {
        initComponents();
        
        long currentTimeMillis = System.currentTimeMillis();
        Timestamp currentTimestamp = new Timestamp(currentTimeMillis);
        java.util.Date currentDate = new java.util.Date(currentTimestamp.getTime());
        dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        formattedDate = dateFormat.format(currentDate);
        
        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        progressBar.setValue(0);
        
        progressBar.setBounds(320, 400, 300, 20);
        progressBar.setVisible(false);
        add(progressBar);
        
        
        JSeparator vSeparator = new JSeparator(SwingConstants.VERTICAL);
        vSeparator.setPreferredSize(new Dimension(2, 100));
        
        int sepX = productTitleField.getX() + 368;
        int sepY = productTitleField.getY() + 84;
        vSeparator.setBounds(sepX, sepY, 3, 250);
        add(vSeparator);
        setComponentZOrder(progressBar, 0);
    }
    
    public String getProductTitleField() {
        String productTitle = productTitleField.getText();
        return productTitle;
    }
    
    public String getProductDescriptionField() {
        String productDescription = productDescriptionField.getText();
        return productDescription;
    }
    
    public BigDecimal getPriceTagField() {
        String priceString = priceTagField.getText();
        int priceInt = Integer.parseInt(priceString);
        
        BigDecimal bigDecimal = new BigDecimal(priceInt);
        return bigDecimal;
    }
    
    public int getProductCategory() {
        Object catObject = productCategoryValue.getSelectedItem();
        if (catObject != null) {
            String productCategory = (String) catObject;
            if (productCategory.equals("Automobile")) {
                return 1;
            } else if (productCategory.equals("Books & Audible")) {
                return 2;
            }
        }
        return -1;
    }
    
    public int getDeliveryStatus() {
        Object deliveryObject = deliveryStatusValue.getSelectedItem();
        if (deliveryObject != null) {
            String deliveryStatus = (String) deliveryObject;
            if (deliveryStatus.equals("Free Delivery")) {
                return 1;
            } else if (deliveryStatus.equals("Free Delivery")) {
                return 2;
            }
        }
        return -1;
    }
    
    public String getFormattedDate() {
        return formattedDate;
    }
    
    private File handleDottedPanelClick(JFileChooser fileChooser, int index) {
    FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image files", "png", "jpeg", "jpg", "gif");
    fileChooser.setFileFilter(imageFilter);

    int result = fileChooser.showOpenDialog(this);

    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        String imageName = selectedFile.getName();
        if (imageFilter.accept(selectedFile)) {
            if (imageName != null) {
                selectedFiles[index] = selectedFile; // Store selected file in the array
                return selectedFile;
            } else {
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Invalid Image Format!");
            }
        }
    }
    return null;
}
    
    private void dottedPanelMouseClicked(java.awt.event.MouseEvent evt, JFileChooser fileChooser, int index) {
    File fetchSelectedFile = handleDottedPanelClick(fileChooser, index);
    if (fetchSelectedFile != null) {
        progressBar.setVisible(true);
        simulateFileUpload(fetchSelectedFile);
    }
}
    
    public File getSelectedFile(int index) {
        if (index >= 0 && index < selectedFiles.length) {
            return selectedFiles[index];
        } else {
            return null;
        }
    }
    
    public byte[] getSelectedFile1() throws IOException {
        byte[] firstImage = Files.readAllBytes(getSelectedFile(0).toPath());
        return firstImage;
    }
    
    public byte[] getSelectedFile2() throws IOException {
        byte[] secondImage = Files.readAllBytes(getSelectedFile(1).toPath());
        return secondImage;
    }
    
    public byte[] getSelectedFile3() throws IOException {
        byte[] thirdImage = Files.readAllBytes(getSelectedFile(2).toPath());
        return thirdImage;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dottedPanelImg1 = new application.customer.design.DottedPanel();
        supportedFile = new javax.swing.JLabel();
        uploadImg1 = new javax.swing.JLabel();
        dottedPanelImg2 = new application.customer.design.DottedPanel();
        uploadImg2 = new javax.swing.JLabel();
        img2Label = new javax.swing.JLabel();
        dottedPanelImg3 = new application.customer.design.DottedPanel();
        UploadImg3 = new javax.swing.JLabel();
        img3Label = new javax.swing.JLabel();
        ImageHeaderLabel = new javax.swing.JLabel();
        productHeaderLabel = new javax.swing.JLabel();
        productTitleLabel = new javax.swing.JLabel();
        productDescriptionLabel = new javax.swing.JLabel();
        productCategoryValue = new javax.swing.JComboBox<>();
        productTitleField = new javax.swing.JTextField();
        deliveryStatusValue = new javax.swing.JComboBox<>();
        priceTagLabel = new javax.swing.JLabel();
        priceTagField = new javax.swing.JTextField();
        scrollPane1 = new javax.swing.JScrollPane();
        productDescriptionField = new javax.swing.JTextPane();
        goBackButton = new javax.swing.JButton();
        uploadButton = new javax.swing.JButton();
        noteHeader = new javax.swing.JLabel();
        note1 = new javax.swing.JLabel();
        note2 = new javax.swing.JLabel();
        hSeparator = new javax.swing.JSeparator();

        dottedPanelImg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dottedPanelImg1MouseClicked(evt);
            }
        });

        supportedFile.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        supportedFile.setText("Supported File: .png, .jpg, .jpeg, .gif");

        uploadImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Vector (6).png"))); // NOI18N

        javax.swing.GroupLayout dottedPanelImg1Layout = new javax.swing.GroupLayout(dottedPanelImg1);
        dottedPanelImg1.setLayout(dottedPanelImg1Layout);
        dottedPanelImg1Layout.setHorizontalGroup(
            dottedPanelImg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dottedPanelImg1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(dottedPanelImg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dottedPanelImg1Layout.createSequentialGroup()
                        .addComponent(uploadImg1)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dottedPanelImg1Layout.createSequentialGroup()
                        .addComponent(supportedFile)
                        .addGap(55, 55, 55))))
        );
        dottedPanelImg1Layout.setVerticalGroup(
            dottedPanelImg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dottedPanelImg1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(uploadImg1)
                .addGap(18, 18, 18)
                .addComponent(supportedFile, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        dottedPanelImg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dottedPanelImg2MouseClicked(evt);
            }
        });

        uploadImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Vector (6).png"))); // NOI18N

        img2Label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        img2Label.setText("Image 2");

        javax.swing.GroupLayout dottedPanelImg2Layout = new javax.swing.GroupLayout(dottedPanelImg2);
        dottedPanelImg2.setLayout(dottedPanelImg2Layout);
        dottedPanelImg2Layout.setHorizontalGroup(
            dottedPanelImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dottedPanelImg2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(dottedPanelImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dottedPanelImg2Layout.createSequentialGroup()
                        .addComponent(uploadImg2)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dottedPanelImg2Layout.createSequentialGroup()
                        .addComponent(img2Label)
                        .addGap(54, 54, 54))))
        );
        dottedPanelImg2Layout.setVerticalGroup(
            dottedPanelImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dottedPanelImg2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(uploadImg2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(img2Label)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        dottedPanelImg3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dottedPanelImg3MouseClicked(evt);
            }
        });

        UploadImg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Vector (6).png"))); // NOI18N

        img3Label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        img3Label.setText("Image 3");

        javax.swing.GroupLayout dottedPanelImg3Layout = new javax.swing.GroupLayout(dottedPanelImg3);
        dottedPanelImg3.setLayout(dottedPanelImg3Layout);
        dottedPanelImg3Layout.setHorizontalGroup(
            dottedPanelImg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dottedPanelImg3Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(dottedPanelImg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dottedPanelImg3Layout.createSequentialGroup()
                        .addComponent(img3Label)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dottedPanelImg3Layout.createSequentialGroup()
                        .addComponent(UploadImg3)
                        .addGap(64, 64, 64))))
        );
        dottedPanelImg3Layout.setVerticalGroup(
            dottedPanelImg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dottedPanelImg3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UploadImg3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(img3Label)
                .addGap(33, 33, 33))
        );

        ImageHeaderLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        ImageHeaderLabel.setText(" Include Images");

        productHeaderLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        productHeaderLabel.setText("Create Product Listing");

        productTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        productTitleLabel.setText("Product Title");

        productDescriptionLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        productDescriptionLabel.setText("Product Description");

        productCategoryValue.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        productCategoryValue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categories", "Automobile", "Books & Audible", "Toys & Games", "Furniture & Decor", "Tools & Home Improvement", "Watches", "Musical Instruments" }));

        productTitleField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        deliveryStatusValue.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        deliveryStatusValue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivery Options", "Free Delivery", "No Delivery" }));

        priceTagLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        priceTagLabel.setText("Price Tag");

        priceTagField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        scrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        productDescriptionField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        scrollPane1.setViewportView(productDescriptionField);

        goBackButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        goBackButton.setText("Go Back");

        uploadButton.setBackground(new java.awt.Color(255, 92, 0));
        uploadButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        uploadButton.setForeground(new java.awt.Color(255, 255, 255));
        uploadButton.setText("Upload Listing");
        uploadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadBtnClicked(evt);
            }
        });

        noteHeader.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        noteHeader.setText("NOTE");

        note1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        note1.setText("• All items listed must be accurately described, including any wear and tear, defects, or imperfections.");

        note2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        note2.setText("• Buyers are encouraged to ask questions and request additional photos before making a purchase.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(note1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(noteHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(note2)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                            .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ImageHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(dottedPanelImg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dottedPanelImg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(dottedPanelImg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(productHeaderLabel)
                                        .addComponent(productTitleLabel)
                                        .addComponent(productDescriptionLabel)
                                        .addComponent(productTitleField)
                                        .addComponent(productCategoryValue, 0, 224, Short.MAX_VALUE))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(deliveryStatusValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(priceTagLabel)
                                        .addComponent(priceTagField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(scrollPane1)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productHeaderLabel)
                    .addComponent(ImageHeaderLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productTitleLabel)
                            .addComponent(priceTagLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceTagField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productCategoryValue, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deliveryStatusValue, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(productDescriptionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dottedPanelImg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dottedPanelImg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dottedPanelImg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(noteHeader))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(hSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(note1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(note2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dottedPanelImg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dottedPanelImg1MouseClicked
        dottedPanelMouseClicked(evt, new JFileChooser(), 0);
    }//GEN-LAST:event_dottedPanelImg1MouseClicked

    private void dottedPanelImg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dottedPanelImg2MouseClicked
        dottedPanelMouseClicked(evt, new JFileChooser(), 1);
    }//GEN-LAST:event_dottedPanelImg2MouseClicked

    private void dottedPanelImg3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dottedPanelImg3MouseClicked
        dottedPanelMouseClicked(evt, new JFileChooser(), 2);
    }//GEN-LAST:event_dottedPanelImg3MouseClicked

    private void uploadBtnClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadBtnClicked
        ProductDataDAO productUpload = new ProductDataDAO();
        
        String email = LoginForm.getStoredUserEmail();
        
        try {
            CatalogModel saveDataModel = new CatalogModel(
                    getProductCategory(),
                    getProductTitleField(),
                    getProductDescriptionField(),
                    getPriceTagField(),
                    getDeliveryStatus(),
                    getFormattedDate(),
                    "Like New",
                    "Kathmandu",
                    getSelectedFile1(),
                    getSelectedFile2(),
                    getSelectedFile3(),
                    email
            );
            boolean check = productUpload.saveProductData(saveDataModel);
            if (check) {
                Notifications.getInstance().show(Notifications.Type.SUCCESS, "Done!");
            }
        } catch (IOException ex) {
            Logger.getLogger(UploadCatalogue.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uploadBtnClicked

    private void simulateFileUpload(File file) {
    SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
        @Override
        protected Void doInBackground() throws Exception {
            for (int progress = 0; progress <= 100; progress += 2) {
                Thread.sleep(20);
                publish(progress);
            }
            return null;
        }

        @Override
        protected void process(java.util.List<Integer> chunks) {
            for (int progress : chunks) {
                progressBar.setValue(progress);
            }
        }

        @Override
        protected void done() {
            progressBar.setValue(100);
            progressBar.setValue(0);
            progressBar.setVisible(false);
        }
    };
    worker.execute();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageHeaderLabel;
    private javax.swing.JLabel UploadImg3;
    private javax.swing.JComboBox<String> deliveryStatusValue;
    private application.customer.design.DottedPanel dottedPanelImg1;
    private application.customer.design.DottedPanel dottedPanelImg2;
    private application.customer.design.DottedPanel dottedPanelImg3;
    private javax.swing.JButton goBackButton;
    private javax.swing.JSeparator hSeparator;
    private javax.swing.JLabel img2Label;
    private javax.swing.JLabel img3Label;
    private javax.swing.JLabel note1;
    private javax.swing.JLabel note2;
    private javax.swing.JLabel noteHeader;
    private javax.swing.JTextField priceTagField;
    private javax.swing.JLabel priceTagLabel;
    private javax.swing.JComboBox<String> productCategoryValue;
    private javax.swing.JTextPane productDescriptionField;
    private javax.swing.JLabel productDescriptionLabel;
    private javax.swing.JLabel productHeaderLabel;
    private javax.swing.JTextField productTitleField;
    private javax.swing.JLabel productTitleLabel;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JLabel supportedFile;
    private javax.swing.JButton uploadButton;
    private javax.swing.JLabel uploadImg1;
    private javax.swing.JLabel uploadImg2;
    // End of variables declaration//GEN-END:variables
}
