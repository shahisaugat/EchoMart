package application.customer.forms;

import application.customer.catalog.Catalogue;
import javax.swing.ImageIcon;

/**
 *
 * @author shahi
 */
public class Dashboard extends javax.swing.JPanel {

    public Dashboard() {
        initComponents();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(14);
        
        addProducts();
    }
    
    private void addProducts() {
//        Icon img, String name, String price, String status, String time
        for (int i = 0; i <= 42; i++) {
            panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/image/stageicon.png/")), "Redmi Note 9s", "NRs. 23000", "Free Delivery", "1 Day Delivery"));
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private application.customer.design.PanelItem panelItem1;
    // End of variables declaration//GEN-END:variables
}
