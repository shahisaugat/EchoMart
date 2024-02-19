package authentication.app.popup;

import application.customer.dao.RecoveryCodesDAO;
import application.customer.forms.ProfileSetup;
import application.customer.main.EchoMartRunner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;
import raven.toast.Notifications;
import java.sql.Timestamp;
import java.util.Calendar;

/**
 *
 * @author shahi
 */
public class RecoveryCode extends javax.swing.JPanel {
    
    private final Map<Integer, Boolean> recoveryCodeMap = new HashMap<>();
    private final String[] codes;
    private final String email;

    public RecoveryCode(String email) {
        initComponents();
        this.email = email;
        
        codes = generateRecoveryCodes();
    }
    
    private String[] generateRecoveryCodes() {
    Random rand = new Random();
    String[] generatedCodes = new String[6];
    int count = 0;
    while(count < 6) {
        int code = 100000 + rand.nextInt(900000);
        
        if (!recoveryCodeMap.containsKey(code)) {
            recoveryCodeMap.put(code, true);
            generatedCodes[count] = String.valueOf(code);
            count++;
        }
    }
    return generatedCodes;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel1.setText("Password Recovery Code");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("When you forget your password you may use these");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("codes to quickly recover your account!");

        jButton1.setBackground(new java.awt.Color(255, 92, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Download Codes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        jButton2.setText("Skip for now");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText(":- Downloaded codes will be saved to -/Downloads/-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(82, 82, 82))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(75, 75, 75)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ProfileSetup.destroyDialog();
        EchoMartRunner.openLoginForm();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        downloadTextFile(codes);
        ProfileSetup.destroyDialog();
        EchoMartRunner.openLoginForm();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void downloadTextFile(String[] codes) {
    if (codes == null || codes.length == 0) {
        codes = generateRecoveryCodes();
    }
    
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.MONTH, 3); 
    Timestamp expirationTime = new Timestamp(calendar.getTimeInMillis());

    RecoveryCodesDAO pushCodesDAO = new RecoveryCodesDAO();
    pushCodesDAO.saveRecoveryCodes(email, codes, expirationTime);
    
    String userHome = System.getProperty("user.home");
    String fileName = "recovery_codes.txt";
    String filePath = userHome + File.separator + "Downloads" + File.separator + fileName;
    String message =  "RECOVERY_CODES_ECHO_MART\n\n" +
                      codes[0] + "\n" +
                      codes[1] + "\n" +
                      codes[2] + "\n" +
                      codes[3] + "\n" +
                      codes[4] + "\n" +
                      codes[5] + "\n" +
                      "\nUse one of the following codes to recover your password.\n" +
                      "You can use this code as long as you want!\n\n" +
                      "but the codes are only valid for the next three months!\n" +
                      "Customer Support: " + 
                      "9866291003\n" +
                      "or email us at devops.shahi@gmail.com";

    try {
        try (FileWriter writer = new FileWriter(filePath)) {
                writer.write(message); 
        }

        Notifications.getInstance().show(Notifications.Type.SUCCESS, "Codes Downloaded Successfully!");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error downloading text file.");
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
