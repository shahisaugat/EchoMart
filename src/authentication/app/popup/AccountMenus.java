package authentication.app.popup;

import application.customer.dao.ProfileFetchDAO;
import application.customer.forms.LoginForm;
import application.customer.main.EchoMartRunner;
import java.awt.Cursor;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.HyperlinkEvent;

/**
 *
 * @author shahi
 */
public class AccountMenus extends javax.swing.JPanel {
    
    public AccountMenus() {
        initComponents();
        
        fetchAndSetEmail();
        
        Cursor handCursor = new Cursor(Cursor.HAND_CURSOR);
        jButton1.setCursor(handCursor);
        jButton2.setCursor(handCursor);
        jButton3.setCursor(handCursor);
        jButton4.setCursor(handCursor);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new application.customer.catalog.PanelShadow();
        panelRound1 = new application.customer.design.PanelRound();
        imageAvatar2 = new application.customer.design.ImageAvatar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        imageAvatar2.setBorderSize(2);
        imageAvatar2.setBorderSpace(1);
        imageAvatar2.setGradientColor1(new java.awt.Color(102, 102, 102));
        imageAvatar2.setGradientColor2(new java.awt.Color(102, 102, 102));
        imageAvatar2.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Group 13.png"))); // NOI18N

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        jTextPane1.setText("Saugat Shahi Thakuri devops.shahi@gmail.com");
        jTextPane1.setFocusable(false);
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(imageAvatar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/authentication/app/popup/Payment Method (1).png"))); // NOI18N
        jButton1.setText("Payment methods");
        jButton1.setBorder(null);
        jButton1.setIconTextGap(8);

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/authentication/app/popup/statistics (1).png"))); // NOI18N
        jButton2.setText("My Statistics");
        jButton2.setBorder(null);
        jButton2.setIconTextGap(8);

        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/authentication/app/popup/Prize.png"))); // NOI18N
        jButton3.setText("Reward Points");
        jButton3.setBorder(null);
        jButton3.setIconTextGap(8);

        jButton4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/authentication/app/popup/Vector (13).png"))); // NOI18N
        jButton4.setText("Logout");
        jButton4.setBorder(null);
        jButton4.setIconTextGap(9);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        removeAll();
        EchoMartRunner.logout();
    }//GEN-LAST:event_jButton4MouseClicked

    private void fetchAndSetEmail() {
        
        ProfileFetchDAO profileFetch = new ProfileFetchDAO();
        
        String userEmail = LoginForm.getStoredUserEmail();

        HashMap<String, Object> customerData = profileFetch.fetchCustomerData(userEmail);

        if (customerData.containsKey("EmailAddress")) {
            String emailAd = (String) customerData.get("EmailAddress");
            String userName = (String) customerData.get("FullName");
            String lastName = (String) customerData.get("LastName");
            
            String finalData =  userName + " " + lastName + " " + emailAd;
            jTextPane1.setText(finalData);
        } else {
            
            jTextPane1.setContentType("text/html");
            jTextPane1.setText("<html>No verified email found! <a href=\"#\">Contact Support</a></html>");

            jTextPane1.addHyperlinkListener((HyperlinkEvent e) -> {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                JOptionPane.showMessageDialog(null, "Contact Support clicked");
            }
            });
        }
        
        if (customerData.containsKey("ProfilePicture")) {
            byte[] profilePicture = (byte[]) customerData.get("ProfilePicture");
            if (profilePicture != null) {
                ImageIcon imageIcon = new ImageIcon(profilePicture);
                imageAvatar2.setImage(imageIcon);
            } else {
                ImageIcon img = new ImageIcon(getClass().getResource("/application/customer/image/Group 13.png/"));
                imageAvatar2.setImage(img);
            }
        } else{
            System.out.print("Image Not Found!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private application.customer.design.ImageAvatar imageAvatar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private application.customer.design.PanelRound panelRound1;
    private application.customer.catalog.PanelShadow panelShadow1;
    // End of variables declaration//GEN-END:variables
}
