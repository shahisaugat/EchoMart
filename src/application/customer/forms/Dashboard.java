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
        roundPanelBorder2 = new application.customer.design.RoundPanelBorder();

        jScrollPane1.setViewportView(panelItem1);

        javax.swing.GroupLayout roundPanelBorder2Layout = new javax.swing.GroupLayout(roundPanelBorder2);
        roundPanelBorder2.setLayout(roundPanelBorder2Layout);
        roundPanelBorder2Layout.setHorizontalGroup(
            roundPanelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );
        roundPanelBorder2Layout.setVerticalGroup(
            roundPanelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(roundPanelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(roundPanelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private application.customer.design.PanelItem panelItem1;
    private application.customer.design.RoundPanelBorder roundPanelBorder2;
    // End of variables declaration//GEN-END:variables
}
