package application.customer.design;

import java.awt.Dimension;
import javax.swing.ImageIcon;

/**
 *
 * @author shahi
 */
public class ScrollableDesc extends javax.swing.JPanel {
    
    private ProductDescription productDesc;
    
    public ScrollableDesc(int pID, String pName, String pCondition, String pDesc, ImageIcon image1, ImageIcon image2, ImageIcon image3, String oName, String oMail, String oContact, String oRep) {
        initComponents();
        
        productDesc = new ProductDescription(pID, pName, pCondition, pDesc, image1, image2, image3, oName, oMail, oContact, oRep);
        
        jScrollPane2.setPreferredSize(new Dimension(685, 428));
        jScrollPane2.add(productDesc);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
