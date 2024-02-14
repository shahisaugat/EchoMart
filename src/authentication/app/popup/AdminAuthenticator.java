package authentication.app.popup;

import application.customer.forms.LoginForm;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;
import raven.toast.Notifications;

/**
 *
 * @author shahi
 */
public class AdminAuthenticator extends javax.swing.JPanel {

    public AdminAuthenticator() {
        initComponents();
        
        addDocumentFilter(pin1, pin2);
        addDocumentFilter(pin2, pin3);
        addDocumentFilter(pin3, pin4);
        addDocumentFilter(pin4, pin5);
        addDocumentFilter(pin5, pin6);
        
        addKeyListeners();
    }
    
    private void addDocumentFilter(JTextField textField, JTextField nextField) {
        AbstractDocument doc = (AbstractDocument) textField.getDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (fb.getDocument().getLength() + string.length() <= 1) {
                    super.insertString(fb, offset, string, attr);
                    nextField.requestFocusInWindow();
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (fb.getDocument().getLength() + text.length() - length <= 1) {
                    super.replace(fb, offset, length, text, attrs);
                    nextField.requestFocusInWindow();
                }
            }
        });
    }
    
    // Method to add key listeners for Ctrl+A and backspace functionality
    private void addKeyListeners() {
        KeyListener backspaceListener = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE && ((JTextField) e.getSource()).getText().isEmpty()) {
                    JTextField textField = (JTextField) e.getSource();
                    textField.transferFocusBackward();
                }
            }
        };
        
        pin1.addKeyListener(backspaceListener);
        pin2.addKeyListener(backspaceListener);
        pin3.addKeyListener(backspaceListener);
        pin4.addKeyListener(backspaceListener);
        pin5.addKeyListener(backspaceListener);
        pin6.addKeyListener(backspaceListener);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound2 = new application.customer.design.PanelRound();
        fingerSensor = new javax.swing.JLabel();
        authenticateText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pin1 = new javax.swing.JTextField();
        pin2 = new javax.swing.JTextField();
        pin3 = new javax.swing.JTextField();
        pin4 = new javax.swing.JTextField();
        pin5 = new javax.swing.JTextField();
        pin6 = new javax.swing.JTextField();
        verifyPIN = new javax.swing.JButton();

        fingerSensor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/fingerprint-scan.png"))); // NOI18N
        fingerSensor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fingerSensorMouseClicked(evt);
            }
        });

        authenticateText.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        authenticateText.setText("Admin Authentication PIN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Please, Enter the PIN given by your service provider");

        pin1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        pin2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        pin3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        pin4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        pin5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        pin6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        verifyPIN.setBackground(new java.awt.Color(255, 92, 0));
        verifyPIN.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        verifyPIN.setForeground(new java.awt.Color(255, 255, 255));
        verifyPIN.setText("VERIFY");
        verifyPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyPINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(authenticateText))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(fingerSensor))
                    .addComponent(jLabel2)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(pin1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pin2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pin3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pin4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pin5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pin6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(verifyPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(authenticateText)
                .addGap(18, 18, 18)
                .addComponent(fingerSensor)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pin1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pin2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pin3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pin4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pin5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pin6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(verifyPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void verifyPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyPINActionPerformed
        verifyPIN();
    }//GEN-LAST:event_verifyPINActionPerformed

    private void fingerSensorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fingerSensorMouseClicked
        pin1.setText("7");
        pin2.setText("8");
        pin3.setText("4");
        pin4.setText("5");
        pin5.setText("6");
        pin6.setText("3");
        Timer timer = new Timer(600, (ActionEvent e) -> {
        LoginForm.destroyDialog();
    });
        Notifications.getInstance().show(Notifications.Type.SUCCESS, "Admin Verification Successful!");
    timer.setRepeats(false);
    timer.start();
    }//GEN-LAST:event_fingerSensorMouseClicked

    public String getCompletePin() {
        return pin1.getText() + pin2.getText() + pin3.getText() + pin4.getText() + pin5.getText() + pin6.getText();
    }
    
    public void verifyPIN() {
        if (getCompletePin().equals("784563")) {
            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Admin Verification Successfull!");
            LoginForm.destroyDialog();
        } else {
            Notifications.getInstance().show(Notifications.Type.ERROR, "Contact your service provider!"); 
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authenticateText;
    private javax.swing.JLabel fingerSensor;
    private javax.swing.JLabel jLabel2;
    private application.customer.design.PanelRound panelRound2;
    private javax.swing.JTextField pin1;
    private javax.swing.JTextField pin2;
    private javax.swing.JTextField pin3;
    private javax.swing.JTextField pin4;
    private javax.swing.JTextField pin5;
    private javax.swing.JTextField pin6;
    private javax.swing.JButton verifyPIN;
    // End of variables declaration//GEN-END:variables
}
