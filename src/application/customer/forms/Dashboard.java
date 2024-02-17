package application.customer.forms;

import application.customer.catalog.Catalogue;
import application.customer.design.PanelRound;
import authentication.app.popup.AccountMenus;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import raven.glasspanepopup.DefaultOption;
import raven.glasspanepopup.GlassPanePopup;

/**
 *
 * @author shahi
 */
public class Dashboard extends javax.swing.JPanel {
    
    private AccountMenus accountMenu;

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
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/image/Mask group.png/")), "New Watch", "NRs. 12000", "Delivery", "Ktm"));
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/image/Mask group (1).png/")), "Jordan Air M1", "NRs. 12000", "Delivery", "Ktm"));
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/image/Mask group (3).png/")), "Power Bank", "NRs. 3000", "Delivery", "Ktm"));
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/image/Mask group (4).png/")), "Face Mask", "NRs. 3000", "Delivery", "Ktm"));
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/image/Mask group (6).png/")), "Power Bank", "NRs. 3000", "Delivery", "Ktm"));
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/image/Mask group (7).png/")), "Power Bank", "NRs. 3000", "Delivery", "Ktm"));
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/image/Mask group (8).png/")), "Power Bank", "NRs. 3000", "Delivery", "Ktm"));
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/image/Mask group (9).png/")), "Power Bank", "NRs. 3000", "Delivery", "Ktm"));
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/image/Mask group (10).png/")), "Power Bank", "NRs. 3000", "Delivery", "Ktm"));
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/image/Mask group (11).png/")), "Power Bank", "NRs. 3000", "Delivery", "Ktm"));
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/image/Mask group (12).png/")), "Power Bank", "NRs. 3000", "Delivery", "Ktm"));
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/image/Mask group (2).png/")), "Crop Tops Gray", "NRs. 3000", "Delivery", "Ktm"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelItem1 = new application.customer.design.PanelItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        styledSearchField1 = new application.customer.design.StyledSearchField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(panelItem1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Frame 13.png"))); // NOI18N
        jLabel1.setText("My Account");
        jLabel1.setIconTextGap(10);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Frame 12.png"))); // NOI18N
        jLabel2.setText("Favourites");
        jLabel2.setIconTextGap(10);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Vector.png"))); // NOI18N
        jLabel3.setText("Cart");
        jLabel3.setIconTextGap(10);

        styledSearchField1.setText("styledSearchField1");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Vector (1).png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Vector (2).png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel6.setText("New");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel7.setText("Watches");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel8.setText("Clothes");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel9.setText("Electronics");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel10.setText("Toys");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addComponent(jLabel8)
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addGap(34, 34, 34)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(styledSearchField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel3)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(styledSearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        accountMenu = new AccountMenus();
        GlassPanePopup.showPopup(accountMenu, new DefaultOption() {
            @Override
            public float opacity() {
                return 0.02f;
            }
            
            @Override
            public String getLayout(Component parent, float animate) {
                float xOffset = 0.799f;
                float yOffset = 0.124f;

                return "pos " + xOffset + "al " + yOffset + "al";
            }
        });
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private application.customer.design.PanelItem panelItem1;
    private application.customer.design.StyledSearchField styledSearchField1;
    // End of variables declaration//GEN-END:variables
}
