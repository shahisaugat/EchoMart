package application.customer.forms;

import application.customer.dao.ProductDataDAO;
import application.customer.design.PictureHolder;
import application.customer.model.CatalogModel;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
    
    private void dottedPanelMouseClicked(java.awt.event.MouseEvent evt, JFileChooser fileChooser, PictureHolder pictureHolder, int index) {
    File fetchSelectedFile = handleDottedPanelClick(fileChooser, index);
    if (fetchSelectedFile != null) {
        progressBar.setVisible(true);
        simulateFileUpload(fetchSelectedFile, pictureHolder);
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
        image1 = new application.customer.design.PictureHolder();
        uploadImg1 = new javax.swing.JLabel();
        supportedFile = new javax.swing.JLabel();
        dottedPanelImg2 = new application.customer.design.DottedPanel();
        image2 = new application.customer.design.PictureHolder();
        uploadImg2 = new javax.swing.JLabel();
        img2Label = new javax.swing.JLabel();
        dottedPanelImg3 = new application.customer.design.DottedPanel();
        image3 = new application.customer.design.PictureHolder();
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

        image1.setOpaque(true);

        uploadImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Vector (6).png"))); // NOI18N

        supportedFile.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        supportedFile.setText("Supported File: .png, .jpg, .jpeg, .gif");

        image1.setLayer(uploadImg1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        image1.setLayer(supportedFile, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout image1Layout = new javax.swing.GroupLayout(image1);
        image1.setLayout(image1Layout);
        image1Layout.setHorizontalGroup(
            image1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(image1Layout.createSequentialGroup()
                .addGroup(image1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(image1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(uploadImg1))
                    .addGroup(image1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(supportedFile)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        image1Layout.setVerticalGroup(
            image1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(image1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(uploadImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(supportedFile, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dottedPanelImg1Layout = new javax.swing.GroupLayout(dottedPanelImg1);
        dottedPanelImg1.setLayout(dottedPanelImg1Layout);
        dottedPanelImg1Layout.setHorizontalGroup(
            dottedPanelImg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dottedPanelImg1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dottedPanelImg1Layout.setVerticalGroup(
            dottedPanelImg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dottedPanelImg1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        dottedPanelImg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dottedPanelImg2MouseClicked(evt);
            }
        });

        image2.setOpaque(true);

        uploadImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Vector (6).png"))); // NOI18N

        img2Label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        img2Label.setText("Image 2");

        image2.setLayer(uploadImg2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        image2.setLayer(img2Label, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout image2Layout = new javax.swing.GroupLayout(image2);
        image2.setLayout(image2Layout);
        image2Layout.setHorizontalGroup(
            image2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(image2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(image2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, image2Layout.createSequentialGroup()
                        .addComponent(uploadImg2)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, image2Layout.createSequentialGroup()
                        .addComponent(img2Label)
                        .addGap(48, 48, 48))))
        );
        image2Layout.setVerticalGroup(
            image2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(image2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(uploadImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(img2Label)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dottedPanelImg2Layout = new javax.swing.GroupLayout(dottedPanelImg2);
        dottedPanelImg2.setLayout(dottedPanelImg2Layout);
        dottedPanelImg2Layout.setHorizontalGroup(
            dottedPanelImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dottedPanelImg2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dottedPanelImg2Layout.setVerticalGroup(
            dottedPanelImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dottedPanelImg2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dottedPanelImg3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dottedPanelImg3MouseClicked(evt);
            }
        });

        image3.setOpaque(true);

        UploadImg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Vector (6).png"))); // NOI18N

        img3Label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        img3Label.setText("Image 3");

        image3.setLayer(UploadImg3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        image3.setLayer(img3Label, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout image3Layout = new javax.swing.GroupLayout(image3);
        image3.setLayout(image3Layout);
        image3Layout.setHorizontalGroup(
            image3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(image3Layout.createSequentialGroup()
                .addGroup(image3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(image3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(UploadImg3))
                    .addGroup(image3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(img3Label)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        image3Layout.setVerticalGroup(
            image3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(image3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(UploadImg3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(img3Label)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dottedPanelImg3Layout = new javax.swing.GroupLayout(dottedPanelImg3);
        dottedPanelImg3.setLayout(dottedPanelImg3Layout);
        dottedPanelImg3Layout.setHorizontalGroup(
            dottedPanelImg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dottedPanelImg3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(image3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dottedPanelImg3Layout.setVerticalGroup(
            dottedPanelImg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dottedPanelImg3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(image3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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
        dottedPanelMouseClicked(evt, new JFileChooser(), image1, 0);
    }//GEN-LAST:event_dottedPanelImg1MouseClicked

    private void dottedPanelImg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dottedPanelImg2MouseClicked
        dottedPanelMouseClicked(evt, new JFileChooser(), image2, 1);
    }//GEN-LAST:event_dottedPanelImg2MouseClicked

    private void dottedPanelImg3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dottedPanelImg3MouseClicked
        dottedPanelMouseClicked(evt, new JFileChooser(), image3, 2);
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

    private void simulateFileUpload(File file, PictureHolder pictureHolder) {
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
            try {
                BufferedImage image = ImageIO.read(file);
                ImageIcon icon = new ImageIcon(image);
                pictureHolder.setImage(icon);
                pictureHolder.repaint();
            } catch (IOException ex) {
                Logger.getLogger(UploadCatalogue.class.getName()).log(Level.SEVERE, null, ex);
            }
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
    private application.customer.design.PictureHolder image1;
    private application.customer.design.PictureHolder image2;
    private application.customer.design.PictureHolder image3;
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
