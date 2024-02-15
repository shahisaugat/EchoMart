package application.customer.forms;

import authentication.app.popup.AdminAuthenticator;
import application.customer.main.EchoMartRunner;
import application.customer.methods.SaveAndFetch;
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
import javax.swing.SwingUtilities;

/**
 *
 * @author shahi
 */
public class LoginForm extends javax.swing.JPanel {
    
    private static JDialog authenticateDialog;
    private AdminAuthenticator authenticator;
    
    public LoginForm() {
        initComponents();
        
        authenticator = new AdminAuthenticator();
        
        authenticateDialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Profile Setup", true);
        authenticateDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        authenticateDialog.getContentPane().add(authenticator);
        authenticateDialog.pack();
        
        Cursor defaultCursor = new Cursor(Cursor.HAND_CURSOR);
        
        aboutUsButton.setCursor(defaultCursor);
        forgotPassword.setCursor(defaultCursor);
        rememberMe.setCursor(defaultCursor);
        afilliateButton.setCursor(defaultCursor);
        signupButton.setCursor(defaultCursor);
        contactButton.setCursor(defaultCursor);
        termsButton.setCursor(defaultCursor);
        loginButton.setCursor(defaultCursor);
        
        copyrightText.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        
        String fontFilePath = "/application/customer/fonts/Lato-Regular.ttf/";
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(fontFilePath));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
            
            Font sizedFont = customFont.deriveFont(Font.PLAIN,(float) 17);
            
              emailLabel.setFont(sizedFont);
              passwordLabel.setFont(sizedFont);
              forgotPassword.setFont(sizedFont);
              noAccountText.setFont(sizedFont);
              rememberMe.setFont(sizedFont);
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
    }
    
    public String getPasswordTextField() {
        String pwd = passwordTextField.getText();
        String hashedPwd = hashPassword(pwd);
        return hashedPwd;
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

        brandLogo = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        rememberMe = new javax.swing.JCheckBox();
        forgotPassword = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        noAccountText = new javax.swing.JLabel();
        signupButton = new javax.swing.JLabel();
        brandBackground = new application.customer.design.PanelRound();
        aboutUsButton = new javax.swing.JLabel();
        contactButton = new javax.swing.JLabel();
        afilliateButton = new javax.swing.JLabel();
        termsButton = new javax.swing.JLabel();
        brandPicture = new application.customer.design.PictureHolder();
        copyrightText = new javax.swing.JLabel();
        brandText1 = new javax.swing.JLabel();
        brandText3 = new javax.swing.JLabel();
        brandText2 = new javax.swing.JLabel();
        bigCircle = new application.customer.design.PanelRound();
        smallCircle = new application.customer.design.PanelRound();
        bullet1 = new javax.swing.JLabel();
        bullet2 = new javax.swing.JLabel();
        bullet3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        brandLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/logo.png"))); // NOI18N

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordLabel.setText("Password");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailLabel.setText("Email Address");

        emailTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        passwordTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        rememberMe.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rememberMe.setText("Remember Me");
        rememberMe.setIconTextGap(8);

        forgotPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        forgotPassword.setText("Forgot your password?");

        loginButton.setBackground(new java.awt.Color(255, 92, 0));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("LOGIN");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });

        noAccountText.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        noAccountText.setText("Don't have an account?");

        signupButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        signupButton.setForeground(new java.awt.Color(255, 92, 0));
        signupButton.setText("SignUp");
        signupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupButtonMouseClicked(evt);
            }
        });

        brandBackground.setBackground(new java.awt.Color(255, 92, 0));
        brandBackground.setRoundBottomLeft(800);

        aboutUsButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aboutUsButton.setForeground(new java.awt.Color(255, 255, 255));
        aboutUsButton.setText("ABOUT US");
        aboutUsButton.setToolTipText("");
        aboutUsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutUsButtonMouseClicked(evt);
            }
        });

        contactButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contactButton.setForeground(new java.awt.Color(255, 255, 255));
        contactButton.setText("CONTACT");
        contactButton.setToolTipText("");
        contactButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactButtonMouseClicked(evt);
            }
        });

        afilliateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        afilliateButton.setForeground(new java.awt.Color(255, 255, 255));
        afilliateButton.setText("AFILLIATE PROGRAM");
        afilliateButton.setToolTipText("");
        afilliateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                afilliateButtonMouseClicked(evt);
            }
        });

        termsButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        termsButton.setForeground(new java.awt.Color(255, 255, 255));
        termsButton.setText("TERMS AND POLICIES");
        termsButton.setToolTipText("");
        termsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                termsButtonMouseClicked(evt);
            }
        });

        brandPicture.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/woman.png"))); // NOI18N

        copyrightText.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        copyrightText.setForeground(new java.awt.Color(255, 255, 255));
        copyrightText.setText("Copyright @ Echo Mart Private Limited - Saugat");

        brandText1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        brandText1.setForeground(new java.awt.Color(255, 255, 255));
        brandText1.setText("DISCOVER TREASURES THAT");

        brandText3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        brandText3.setForeground(new java.awt.Color(255, 255, 255));
        brandText3.setText("START THRIFITING TODAY");

        brandText2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        brandText2.setForeground(new java.awt.Color(255, 255, 255));
        brandText2.setText("CARRIES STORIES");

        bigCircle.setBackground(new java.awt.Color(255, 92, 0));
        bigCircle.setRoundBottomLeft(140);
        bigCircle.setRoundBottomRight(140);
        bigCircle.setRoundTopLeft(140);
        bigCircle.setRoundTopRight(140);

        javax.swing.GroupLayout bigCircleLayout = new javax.swing.GroupLayout(bigCircle);
        bigCircle.setLayout(bigCircleLayout);
        bigCircleLayout.setHorizontalGroup(
            bigCircleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );
        bigCircleLayout.setVerticalGroup(
            bigCircleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        smallCircle.setBackground(new java.awt.Color(255, 92, 0));
        smallCircle.setRoundBottomLeft(140);
        smallCircle.setRoundBottomRight(140);
        smallCircle.setRoundTopLeft(140);
        smallCircle.setRoundTopRight(140);

        javax.swing.GroupLayout smallCircleLayout = new javax.swing.GroupLayout(smallCircle);
        smallCircle.setLayout(smallCircleLayout);
        smallCircleLayout.setHorizontalGroup(
            smallCircleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        smallCircleLayout.setVerticalGroup(
            smallCircleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        bullet1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bullet1.setForeground(new java.awt.Color(255, 255, 255));
        bullet1.setText("● Find local treasures.");

        bullet2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bullet2.setForeground(new java.awt.Color(255, 255, 255));
        bullet2.setText("● Go green. Shop sustainably.");

        bullet3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bullet3.setForeground(new java.awt.Color(255, 255, 255));
        bullet3.setText("● Sell with heart.");

        javax.swing.GroupLayout brandBackgroundLayout = new javax.swing.GroupLayout(brandBackground);
        brandBackground.setLayout(brandBackgroundLayout);
        brandBackgroundLayout.setHorizontalGroup(
            brandBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandBackgroundLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(aboutUsButton)
                .addGap(81, 81, 81)
                .addComponent(contactButton)
                .addGap(91, 91, 91)
                .addComponent(afilliateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(termsButton)
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, brandBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(smallCircle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bigCircle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(copyrightText)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, brandBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(brandBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, brandBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(brandText1)
                        .addComponent(brandText2))
                    .addComponent(brandText3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bullet1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bullet2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bullet3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(brandPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        brandBackgroundLayout.setVerticalGroup(
            brandBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandBackgroundLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(brandBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aboutUsButton)
                    .addComponent(contactButton)
                    .addComponent(afilliateButton)
                    .addComponent(termsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(brandBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(brandBackgroundLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(brandText1)
                        .addGap(18, 18, 18)
                        .addComponent(brandText2)
                        .addGap(18, 18, 18)
                        .addComponent(brandText3)
                        .addGap(42, 42, 42)
                        .addComponent(bullet1)
                        .addGap(30, 30, 30)
                        .addComponent(bullet2)
                        .addGap(33, 33, 33)
                        .addComponent(bullet3)
                        .addGap(133, 133, 133)
                        .addComponent(bigCircle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, brandBackgroundLayout.createSequentialGroup()
                        .addComponent(smallCircle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(brandBackgroundLayout.createSequentialGroup()
                        .addComponent(brandPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(copyrightText)
                        .addGap(32, 32, 32))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(brandLogo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rememberMe)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(forgotPassword))
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(noAccountText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signupButton))
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(brandBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(brandLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rememberMe)
                    .addComponent(forgotPassword))
                .addGap(44, 44, 44)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noAccountText)
                    .addComponent(signupButton))
                .addGap(118, 118, 118))
            .addComponent(brandBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        if (emailTextField.getText().equals("admin") && passwordTextField.getText().equals("admin")) {
            showAuthenticationDialog();
        } else {
            boolean authorize = SaveAndFetch.performLogin(emailTextField.getText(), getPasswordTextField());
            if (authorize) {
                EchoMartRunner.getIntoApp();
            }
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void aboutUsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUsButtonMouseClicked
        EchoMartRunner.openAboutUsForm();
    }//GEN-LAST:event_aboutUsButtonMouseClicked

    private void contactButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactButtonMouseClicked
        EchoMartRunner.openContactForm();
    }//GEN-LAST:event_contactButtonMouseClicked

    private void afilliateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_afilliateButtonMouseClicked
        EchoMartRunner.openAfilliateForm();
    }//GEN-LAST:event_afilliateButtonMouseClicked

    private void termsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_termsButtonMouseClicked
        EchoMartRunner.openTermsForm();
    }//GEN-LAST:event_termsButtonMouseClicked

    private void signupButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupButtonMouseClicked
        EchoMartRunner.openSignUpForm();
    }//GEN-LAST:event_signupButtonMouseClicked

    private void showAuthenticationDialog() {
        
        int centerX = (int) (this.getTopLevelAncestor().getLocationOnScreen().getX() + this.getTopLevelAncestor().getSize().getWidth() / 2 - authenticateDialog.getWidth() / 2);
        int centerY = (int) (this.getTopLevelAncestor().getLocationOnScreen().getY() + this.getTopLevelAncestor().getSize().getHeight() / 2 - authenticateDialog.getHeight() / 2);

        authenticateDialog.setLocation(centerX, centerY);
        
        authenticateDialog.setVisible(true);
    }
    
    public static void destroyDialog() {
        authenticateDialog.dispose();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutUsButton;
    private javax.swing.JLabel afilliateButton;
    private application.customer.design.PanelRound bigCircle;
    private application.customer.design.PanelRound brandBackground;
    private javax.swing.JLabel brandLogo;
    private application.customer.design.PictureHolder brandPicture;
    private javax.swing.JLabel brandText1;
    private javax.swing.JLabel brandText2;
    private javax.swing.JLabel brandText3;
    private javax.swing.JLabel bullet1;
    private javax.swing.JLabel bullet2;
    private javax.swing.JLabel bullet3;
    private javax.swing.JLabel contactButton;
    private javax.swing.JLabel copyrightText;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel noAccountText;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JCheckBox rememberMe;
    private javax.swing.JLabel signupButton;
    private application.customer.design.PanelRound smallCircle;
    private javax.swing.JLabel termsButton;
    // End of variables declaration//GEN-END:variables
}
