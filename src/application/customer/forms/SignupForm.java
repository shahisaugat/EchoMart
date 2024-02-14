package application.customer.forms;

import application.customer.main.EchoMartRunner;
import application.customer.methods.SaveAndFetch;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import raven.toast.Notifications;

/**
 *
 * @author shahi
 */
public class SignupForm extends javax.swing.JPanel {
    
    private ProfileSetup profile;
    private static JDialog profileDialog;

    public SignupForm() {
        initComponents();
        
        profile = new ProfileSetup();
        
        UIManager.put("DialogTitle.background", Color.decode("#FF5C00"));
        
        profileDialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Profile Setup", true);
        profileDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        profileDialog.getContentPane().add(profile);
        profileDialog.pack();
        
        Cursor defaultCursor = new Cursor(Cursor.HAND_CURSOR);
        
        termsCheckBox.setCursor(defaultCursor);
        backToLogin.setCursor(defaultCursor);
        createAccountBtn.setCursor(defaultCursor);
        
        String fontFilePath = "/application/customer/fonts/Lato-Regular.ttf/";
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(fontFilePath));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
            
            Font sizedFont = customFont.deriveFont(Font.PLAIN,(float) 17);
            
            accountExists.setFont(sizedFont);      
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
    }
    
    public String getFNameTextField() {
        String fullName = fNameTextField.getText();
        return fullName;
    }
    
    public String getLNameTextField() {
        String fullName = lNameTextField.getText();
        return fullName;
    }
    
    public String getEmailTextField() {
        String emailAddress = emailTextField.getText();
        return emailAddress;
    }
    
    private boolean isStrongPassword(String password) {
    return password.length() >= 7 && 
           password.matches(".*[A-Z].*") &&
           password.matches(".*\\d.*") &&
           password.matches(".*[!@#$%].*");
    }
    
    public String getPwdTextField() {
            String hashedPassword = hashPassword(pwdTextField.getText());
        return hashedPassword;
    }
    
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            return bytesToHex(hash);
        } catch (NoSuchAlgorithmException e) {
            System.out.print(e);
            return null;
        }
    }
    
    private String bytesToHex(byte[] bytes) {
        Formatter formatter = new Formatter();
        for (byte b : bytes) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerText = new javax.swing.JLabel();
        fNameLabel = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JLabel();
        emailAddressLabel = new javax.swing.JLabel();
        pwdLabel = new javax.swing.JLabel();
        cfmPwdLabel = new javax.swing.JLabel();
        fNameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        pwdTextField = new javax.swing.JTextField();
        lNameTextField = new javax.swing.JTextField();
        cfmPwdTextField = new javax.swing.JTextField();
        termsCheckBox = new javax.swing.JCheckBox();
        createAccountBtn = new javax.swing.JButton();
        accountExists = new javax.swing.JLabel();
        backToLogin = new javax.swing.JLabel();
        panelRound1 = new application.customer.design.PanelRound();
        pictureHolder1 = new application.customer.design.PictureHolder();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelRound2 = new application.customer.design.PanelRound();
        panelRound3 = new application.customer.design.PanelRound();

        setBackground(new java.awt.Color(255, 255, 255));

        headerText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        headerText.setForeground(new java.awt.Color(255, 92, 0));
        headerText.setText("CREATE AN ECHO ACCOUNT");

        fNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fNameLabel.setText("First Name");

        lNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lNameLabel.setText("Last Name");

        emailAddressLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailAddressLabel.setText("Email Address");

        pwdLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pwdLabel.setText("Password");

        cfmPwdLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cfmPwdLabel.setText("Confirm Password");

        fNameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        emailTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        pwdTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lNameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cfmPwdTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        termsCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        termsCheckBox.setText("I've read and agreed to the Terms and Conditions of Echo Mart.");
        termsCheckBox.setIconTextGap(10);
        termsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termsCheckBoxActionPerformed(evt);
            }
        });

        createAccountBtn.setBackground(new java.awt.Color(255, 92, 0));
        createAccountBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        createAccountBtn.setForeground(new java.awt.Color(255, 255, 255));
        createAccountBtn.setText("CREATE ACCOUNT");
        createAccountBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountBtnMouseClicked(evt);
            }
        });

        accountExists.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        accountExists.setText("Already have an account?");

        backToLogin.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        backToLogin.setForeground(new java.awt.Color(255, 92, 0));
        backToLogin.setText("Login Here");
        backToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToLoginMouseClicked(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(255, 92, 0));
        panelRound1.setRoundBottomRight(800);

        pictureHolder1.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/_R57IQ08-removebg-preview.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JOIN OUR COMMUNITY OF PASSIONATE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUYERS AND SELLERS !");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Saugat_Shahi-removebg-preview.png"))); // NOI18N

        panelRound2.setBackground(new java.awt.Color(255, 92, 0));
        panelRound2.setRoundBottomLeft(140);
        panelRound2.setRoundBottomRight(140);
        panelRound2.setRoundTopLeft(140);
        panelRound2.setRoundTopRight(140);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pictureHolder1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(pictureHolder1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );

        panelRound3.setBackground(new java.awt.Color(255, 92, 0));
        panelRound3.setRoundBottomLeft(140);
        panelRound3.setRoundBottomRight(140);
        panelRound3.setRoundTopLeft(140);
        panelRound3.setRoundTopRight(140);

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwdLabel)
                            .addComponent(pwdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cfmPwdLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cfmPwdTextField)))
                    .addComponent(emailTextField)
                    .addComponent(createAccountBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(termsCheckBox)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(accountExists)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backToLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fNameLabel)
                            .addComponent(emailAddressLabel)
                            .addComponent(fNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNameLabel)
                            .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(headerText, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(headerText)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(566, 566, 566)
                        .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fNameLabel)
                            .addComponent(lNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(emailAddressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pwdLabel)
                                    .addComponent(cfmPwdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pwdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cfmPwdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(termsCheckBox))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(createAccountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(accountExists)
                                    .addComponent(backToLogin))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void termsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termsCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_termsCheckBoxActionPerformed

    private void backToLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToLoginMouseClicked
        EchoMartRunner.openLoginForm();
    }//GEN-LAST:event_backToLoginMouseClicked

    private void createAccountBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountBtnMouseClicked
        if (getFNameTextField().isEmpty() || getLNameTextField().isEmpty() || getEmailTextField().isEmpty() || getPwdTextField().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the credentials and proceed!");
        } else if (!isStrongPassword(pwdTextField.getText())) {
            JOptionPane.showMessageDialog(this, "Password must be strong");
        } else if (!termsCheckBox.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please, Agree to our terms and conditions then continue!");
        } else {
            SaveAndFetch.registerAccount(this);
            Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER, "Customer Details Saved Successfully!");
            showProfileDialog();
        }
    }//GEN-LAST:event_createAccountBtnMouseClicked

    private void showProfileDialog() {
        
        int centerX = (int) (this.getTopLevelAncestor().getLocationOnScreen().getX() + this.getTopLevelAncestor().getSize().getWidth() / 2 - profileDialog.getWidth() / 2);
        int centerY = (int) (this.getTopLevelAncestor().getLocationOnScreen().getY() + this.getTopLevelAncestor().getSize().getHeight() / 2 - profileDialog.getHeight() / 2);

        profileDialog.setLocation(centerX, centerY);
        
        profileDialog.setVisible(true);
    }
    
    public static void destroyDialog() {
        profileDialog.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountExists;
    private javax.swing.JLabel backToLogin;
    private javax.swing.JLabel cfmPwdLabel;
    private javax.swing.JTextField cfmPwdTextField;
    private javax.swing.JButton createAccountBtn;
    private javax.swing.JLabel emailAddressLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameTextField;
    private javax.swing.JLabel headerText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lNameTextField;
    private application.customer.design.PanelRound panelRound1;
    private application.customer.design.PanelRound panelRound2;
    private application.customer.design.PanelRound panelRound3;
    private application.customer.design.PictureHolder pictureHolder1;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JTextField pwdTextField;
    private javax.swing.JCheckBox termsCheckBox;
    // End of variables declaration//GEN-END:variables
}
