package authentication.app.popup;

import application.customer.dao.CustomerProfileDAO;
import application.customer.dao.RecoveryCodesDAO;
import application.customer.forms.LoginForm;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import raven.toast.Notifications;
import java.sql.Timestamp;
import java.util.Formatter;

/**
 *
 * @author shahi
 */
public class ForgotPassword extends javax.swing.JPanel {
    
    public ForgotPassword() {
        initComponents();
    }
    public String getPwdTextField() {
            String hashedPassword = hashPassword(newPwdEntry.getText());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emailEntry = new javax.swing.JTextField();
        codeEntry = new javax.swing.JTextField();
        newPwdEntry = new javax.swing.JTextField();
        cfmPwdEntry = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 92, 0));
        jLabel1.setText("Reset your password");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Email Address");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Recovery Code");

        emailEntry.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        codeEntry.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        newPwdEntry.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        cfmPwdEntry.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("New Password");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Confirm Password");

        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton3.setText("Back");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 92, 0));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update Password");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codeEntry)
                            .addComponent(emailEntry)
                            .addComponent(jLabel3)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(cfmPwdEntry)
                            .addComponent(newPwdEntry)
                            .addComponent(jLabel4)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPwdEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cfmPwdEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    RecoveryCodesDAO codeDAO = new RecoveryCodesDAO();
    String enteredCode = codeEntry.getText();
    String email = emailEntry.getText();

    HashMap<String, HashMap<String, Object>> recoveryCodes = codeDAO.fetchRecoveryCodes(email);

    boolean codeFound = false;

    for (String recoveryCode : recoveryCodes.keySet()) {
        if (recoveryCode.equals(enteredCode)) {
            codeFound = true;
            String cfmPwd = cfmPwdEntry.getText();
            String pwd = newPwdEntry.getText();
            
            HashMap<String, Object> recoveryCodeData = recoveryCodes.get(recoveryCode);
            Timestamp expirationTime = (Timestamp) recoveryCodeData.get("ExpirationTime");
            Timestamp currentTime = new Timestamp(System.currentTimeMillis());
            
            if (expirationTime.after(currentTime)) {
                if (pwd.equals(cfmPwd)) {
                    CustomerProfileDAO changePwdDAO = new CustomerProfileDAO();
                    boolean result = changePwdDAO.changePassword(getPwdTextField(), email);
                    if (result) {
                        Notifications.getInstance().show(Notifications.Type.SUCCESS, "Password Updated Successfully!");
                    } else {
                        Notifications.getInstance().show(Notifications.Type.ERROR, "We can't update your password right now!");
                    }
                } else {
                    Notifications.getInstance().show(Notifications.Type.ERROR, "Password didn't match!");
                }
            } else {
                Notifications.getInstance().show(Notifications.Type.ERROR, "Recovery Code has expired!");
            }
        }
    }

    if (!codeFound) {
        Notifications.getInstance().show(Notifications.Type.ERROR, "Invalid Code!");
    }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        LoginForm.destroyPwdDialog();
    }//GEN-LAST:event_jButton3MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cfmPwdEntry;
    private javax.swing.JTextField codeEntry;
    private javax.swing.JTextField emailEntry;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField newPwdEntry;
    // End of variables declaration//GEN-END:variables
}
