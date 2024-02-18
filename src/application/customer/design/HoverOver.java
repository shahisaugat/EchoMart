package application.customer.design;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author shahi
 */
public class HoverOver extends javax.swing.JPanel {
    
    private ProductDescription desc;
    private JDialog descDialog;

    public HoverOver() {
        initComponents();
        
        desc = new ProductDescription();
        
        descDialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Profile Setup", true);
        descDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        descDialog.getContentPane().add(desc);
        descDialog.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pictureHolder1 = new application.customer.design.PictureHolder();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setOpaque(false);

        pictureHolder1.setImage(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Rectangle 63.png"))); // NOI18N
        pictureHolder1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pictureHolder1MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Vector (3).png"))); // NOI18N
        pictureHolder1.add(jLabel1);
        jLabel1.setBounds(67, 30, 22, 22);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Saugat Shahi");
        pictureHolder1.add(jLabel2);
        jLabel2.setBounds(0, 60, 150, 18);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureHolder1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureHolder1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pictureHolder1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pictureHolder1MouseClicked

    }//GEN-LAST:event_pictureHolder1MouseClicked

    private void showDescDialog() {
        
        int centerX = (int) (this.getTopLevelAncestor().getLocationOnScreen().getX() + this.getTopLevelAncestor().getSize().getWidth() / 2 - descDialog.getWidth() / 2);
        int centerY = (int) (this.getTopLevelAncestor().getLocationOnScreen().getY() + this.getTopLevelAncestor().getSize().getHeight() / 2 - descDialog.getHeight() / 2);

        descDialog.setLocation(centerX, centerY);
        descDialog.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private application.customer.design.PictureHolder pictureHolder1;
    // End of variables declaration//GEN-END:variables
}
