package application.customer.forms;

import application.customer.catalog.Catalogue;
import application.customer.design.PanelRound;
import java.awt.Dimension;
import javax.swing.ImageIcon;

/**
 *
 * @author shahi
 */
public class Dashboard extends javax.swing.JPanel {

    public Dashboard() {
        initComponents();
        
        removeAll();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(14);
        PanelRound panelNew = new PanelRound();
        panelNew.setPreferredSize(new Dimension(1036, 120));
        
        jScrollPane1.setColumnHeaderView(panelNew);
        addProducts();
    }
    
    private void addProducts() {
        for (int i = 0; i <= 42; i++) {
            panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/image/catalogueTestImage.png/")), "Redmi Note 9s", "NRs. 23000", "Free Delivery", "1 Day Delivery"));
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelItem1 = new application.customer.design.PanelItem();

        jScrollPane1.setViewportView(panelItem1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private application.customer.design.PanelItem panelItem1;
    // End of variables declaration//GEN-END:variables
}
