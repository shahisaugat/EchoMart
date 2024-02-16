package application.customer.forms;

import application.customer.dao.CustomerProfileDAO;
import application.customer.model.CustomerProfile;
import authentication.app.popup.RecoveryCode;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import raven.toast.Notifications;

/**
 *
 * @author shahi
 */
public class ProfileSetup extends javax.swing.JPanel {

    private File selectedFile;
    private byte[] imageData;
    
    private static JDialog codeDialog;
    private static RecoveryCode recoveryCodesForm;
    
    public ProfileSetup(String email, String fullName) {
        
        initComponents();
        
        recoveryCodesForm = new RecoveryCode();
        
        codeDialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Recovery Codes", true);
        codeDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        codeDialog.getContentPane().add(recoveryCodesForm);
        codeDialog.pack();
        
        userEmailLabel.setText(email);
        userNameLabel.setText(fullName);
    }
    
    public File getSelectedFile() {
        return selectedFile;
    }
    
    public byte[] getImageData() {
        return imageData;
    }
    
    public void displayImage(File selectedFile) {
        try {
            BufferedImage img = ImageIO.read(selectedFile);
            ImageIcon icon = new ImageIcon(img);
            userProfilePicture.setImage(icon);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new application.customer.design.PanelRound();
        userProfilePicture = new application.customer.design.ImageAvatar();
        provinceLabel = new javax.swing.JLabel();
        dateOfBirthLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        userEmailLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        birthDateField = new javax.swing.JTextField();
        contactField = new javax.swing.JTextField();
        provinceField = new javax.swing.JTextField();
        shippingLabel = new javax.swing.JLabel();
        shippingField = new javax.swing.JTextField();
        skipPID1 = new javax.swing.JButton();
        continueSignupBtn = new javax.swing.JButton();

        setOpaque(false);

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        userProfilePicture.setBorderSize(3);
        userProfilePicture.setBorderSpace(3);
        userProfilePicture.setGradientColor1(new java.awt.Color(255, 154, 27));
        userProfilePicture.setGradientColor2(new java.awt.Color(255, 92, 0));
        userProfilePicture.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/loginBackground_Ad.png"))); // NOI18N
        userProfilePicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userProfilePictureMouseClicked(evt);
            }
        });

        provinceLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        provinceLabel.setText("Province");

        dateOfBirthLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        dateOfBirthLabel.setText("Date of Birth");

        contactLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        contactLabel.setText("Contact Number");

        userEmailLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        userEmailLabel.setText("shahisaugat2022@gmail.com");

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        userNameLabel.setText("Saugat Shahi Thakuri");

        birthDateField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        contactField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        provinceField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        shippingLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        shippingLabel.setText("Shipping Address");

        shippingField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        skipPID1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        skipPID1.setForeground(new java.awt.Color(255, 92, 0));
        skipPID1.setText("SKIP");
        skipPID1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 92, 0)));
        skipPID1.setFocusable(false);
        skipPID1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                skipPID1MouseClicked(evt);
            }
        });

        continueSignupBtn.setBackground(new java.awt.Color(255, 92, 0));
        continueSignupBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        continueSignupBtn.setForeground(new java.awt.Color(255, 255, 255));
        continueSignupBtn.setText("CONTINUE");
        continueSignupBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continueSignupBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(userProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userEmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(153, 153, 153))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(dateOfBirthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(contactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(provinceLabel)
                            .addComponent(provinceField, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(birthDateField)
                            .addComponent(skipPID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(continueSignupBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shippingLabel)
                            .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shippingField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(userProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(userNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userEmailLabel)))
                .addGap(31, 31, 31)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                                .addComponent(dateOfBirthLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(birthDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(provinceLabel)
                                    .addComponent(shippingLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(provinceField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(shippingField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(contactLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addComponent(skipPID1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(continueSignupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void skipPID1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skipPID1MouseClicked
        SignupForm.destroyDialog();
        showCodeDialog();
    }//GEN-LAST:event_skipPID1MouseClicked

    private void continueSignupBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continueSignupBtnMouseClicked
        CustomerProfileDAO profileDAO = new CustomerProfileDAO();
        CustomerProfile customerProfile = new CustomerProfile(
                userEmailLabel.getText(),
                getImageData(),
                contactField.getText(),
                birthDateField.getText(),
                shippingField.getText(),
                provinceField.getText());
        
        boolean check = profileDAO.saveCustomerProfile(customerProfile);
        
        if (check) {
            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Account Successfully Created!");
        } else {
            Notifications.getInstance().show(Notifications.Type.ERROR, "Please try again!");
        }
        
        SignupForm.destroyDialog();
        showCodeDialog();
    }//GEN-LAST:event_continueSignupBtnMouseClicked

    private void showCodeDialog() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
    
        int centerX = (screenWidth - codeDialog.getWidth()) / 2;
        int centerY = (screenHeight - codeDialog.getHeight()) / 2;
    
        codeDialog.setLocation(centerX, centerY);
    
        codeDialog.setVisible(true);
    }
    
    public static void destroyDialog() {
        codeDialog.dispose();
    }
    
    private void userProfilePictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userProfilePictureMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image files", "png", "jpeg", "jpg", "gif");
        fileChooser.setFileFilter(imageFilter);
        
        int result = fileChooser.showOpenDialog(this);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            String imageName = selectedFile.getName();
            if (imageFilter.accept(selectedFile)) {
                displayImage(selectedFile);
                if (imageName != null) {
                    try {
                       imageData = Files.readAllBytes(selectedFile.toPath());
                    } catch (IOException ex) {
                        Logger.getLogger(SignupForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Invalid Image Format!");
                } 
            }
        }
    }//GEN-LAST:event_userProfilePictureMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birthDateField;
    private javax.swing.JTextField contactField;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JButton continueSignupBtn;
    private javax.swing.JLabel dateOfBirthLabel;
    private application.customer.design.PanelRound panelRound1;
    private javax.swing.JTextField provinceField;
    private javax.swing.JLabel provinceLabel;
    private javax.swing.JTextField shippingField;
    private javax.swing.JLabel shippingLabel;
    private javax.swing.JButton skipPID1;
    private javax.swing.JLabel userEmailLabel;
    private javax.swing.JLabel userNameLabel;
    private application.customer.design.ImageAvatar userProfilePicture;
    // End of variables declaration//GEN-END:variables
}
