package application.customer.forms;

//import application.customer.catalog.BannerHolder;
import application.customer.catalog.Catalogue;
import application.customer.design.NavigationItems;
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
//    private BannerHolder adShow;

    public Dashboard() {
        initComponents();
        
        removeAll();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(14);
        
        navigationBar1.setSize(new Dimension(490, 40));

        navigationBar1.setAnimate(24);
        navigationBar1.init(new NavigationItems("New", "Clothes", "Watches", "Fashion"), new NavigationItems("Electronics", "Cosmetics", "Gen-Z", "Smartphones"), new NavigationItems("Music Diaries", "Books", "Instruments", "Kitchen"));

//        adShow = new BannerHolder(); 
//        adShow.setSize(new Dimension(1060, 174));
//        adShow.init(new BannerShow("Welcome to the EchoMart", "Visit us"), new BannerShow("Welcome to the EchoMart1", "Shop"), new BannerShow("Welcome to the EchoMart2", "Shop1"));
//        adShow.setAnimate(30);
//        jScrollPane1.setColumnHeaderView(adShow);
        
        addProducts();
    }
    
    private void addProducts() {
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/catalog/no.png/")), "New Watch", "NRs. 12000", "Delivery", "Ktm"));
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/catalog/no.png/")), "Jordan Air M1", "NRs. 12000", "Delivery", "Ktm"));
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/catalog/no.png/")), "Power Bank", "NRs. 3000", "Delivery", "Ktm"));
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/catalog/no.png/")), "Face Mask", "NRs. 3000", "Delivery", "Ktm"));
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/catalog/no.png/")), "Power Bank", "NRs. 3000", "Delivery", "Ktm"));
        panelItem1.add(new Catalogue(new ImageIcon(getClass().getResource("/application/customer/catalog/no.png/")), "Power Bank", "NRs. 3000", "Delivery", "Ktm"));
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
        navigationBar1 = new application.customer.design.NavigationBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(panelItem1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Group 13.png"))); // NOI18N
        jLabel1.setText("My Account");
        jLabel1.setIconTextGap(10);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Group 14.png"))); // NOI18N
        jLabel2.setText("Favourites");
        jLabel2.setIconTextGap(10);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Group 15.png"))); // NOI18N
        jLabel3.setText("Cart");
        jLabel3.setIconTextGap(10);

        styledSearchField1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        styledSearchField1.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Frame 15.png"))); // NOI18N

        navigationBar1.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout navigationBar1Layout = new javax.swing.GroupLayout(navigationBar1);
        navigationBar1.setLayout(navigationBar1Layout);
        navigationBar1Layout.setHorizontalGroup(
            navigationBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        navigationBar1Layout.setVerticalGroup(
            navigationBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/catalog/Polygon 2 (2).png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/catalog/Polygon 1 (2).png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navigationBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3))
                    .addComponent(styledSearchField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(42, 42, 42)
                        .addComponent(styledSearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(navigationBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        navigationBar1.show(1);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        navigationBar1.show(2);
    }//GEN-LAST:event_jLabel5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private application.customer.design.NavigationBar navigationBar1;
    private application.customer.design.PanelItem panelItem1;
    private application.customer.design.StyledSearchField styledSearchField1;
    // End of variables declaration//GEN-END:variables
}
