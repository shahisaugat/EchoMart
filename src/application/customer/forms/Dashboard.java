package application.customer.forms;

import application.customer.catalog.ContentViewCatalogue;
import application.customer.catalog.TileViewCatalogue;
import application.customer.dao.ProductDataDAO;
import application.customer.design.NavigationItems;
import application.customer.design.WrapLayout;
import application.customer.main.EchoMartRunner;
import authentication.app.popup.AccountMenus;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.SwingUtilities;
import raven.glasspanepopup.DefaultOption;
import raven.glasspanepopup.GlassPanePopup;

/**
 *
 * @author shahi
 */
public class Dashboard extends javax.swing.JPanel {
    
    private static JLabel headerCart;
    private AccountMenus accountMenu;
    private static JLabel headerFav;
    private final UploadCatalogue createListing;
    private final JDialog listingDialog;
    private final List<HashMap<String, Object>> products;
    
    public Dashboard() {
        initComponents();
        
        removeAll();
        
        ProductDataDAO productFetch = new ProductDataDAO();
        products = productFetch.fetchAllProductData();
        
        Cursor handCursor = new Cursor(Cursor.HAND_CURSOR);
        jLabel1.setCursor(handCursor);
        jLabel2.setCursor(handCursor);
        jLabel3.setCursor(handCursor);
        
        createListing = new UploadCatalogue();
        
        listingDialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Profile Setup", true);
        listingDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        listingDialog.getContentPane().add(createListing);
        listingDialog.pack();
        
        headerCart = new JLabel();
        headerCart.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
        int headerCartX = jLabel3.getX() + (100 * 10) + 18;
        int headerCartY = jLabel3.getY() + (2 * 10 + 8);
        headerCart.setBounds(headerCartX, headerCartY, 17, 17);
        add(headerCart);
        
        headerFav = new JLabel();
        headerFav.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
        int headerFavX = jLabel2.getX() + (100 * 9) + 16;
        int headerFavY = jLabel2.getY() + (2 * 8 + 12);
        headerFav.setBounds(headerFavX, headerFavY, 17, 17);
        add(headerFav);
        
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(14);
        
        JScrollBar vScroll = jScrollPane1.getVerticalScrollBar();
        vScroll.putClientProperty(FlatClientProperties.STYLE, ""
                + "width:$Menu.scroll.width;"
                + "trackInsets:$Menu.scroll.trackInsets;"
                + "thumbInsets:$Menu.scroll.thumbInsets;"
                + "background:$Menu.ScrollBar.background;"
                + "thumb:$Menu.ScrollBar.thumb");
        
        navigationBar1.setSize(new Dimension(490, 32));

        navigationBar1.setAnimate(24);
        navigationBar1.init(new NavigationItems("New", "Clothes", "Watches", "Fashion"), new NavigationItems("Electronics", "Cosmetics", "Gen-Z", "Smartphones"), new NavigationItems("Music Diaries", "Books", "Instruments", "Kitchen"));

//      adShow = new BannerHolder(); 
//      adShow.setSize(new Dimension(1060, 174));
//      adShow.init(new BannerShow("Welcome to the EchoMart", "Visit us"), new BannerShow("Welcome to the EchoMart1", "Shop"), new BannerShow("Welcome to the EchoMart2", "Shop1"));
//      adShow.setAnimate(30);
//      jScrollPane1.setColumnHeaderView(adShow);
        
        jComboBox1.addActionListener((ActionEvent e) -> {
            // Get the selected item from the JComboBox
            String selectedOption = (String) jComboBox1.getSelectedItem();
            
            // Clear existing items from panelItem1
            panelItem1.removeAll();
            
            // Check the selected option and add products accordingly
            if ("Tiles".equals(selectedOption)) {
                addProductsAsTile();
            } else if ("Content".equals(selectedOption)) {
                addProductsAsContent();
            }
            
            // Repaint the panel to reflect changes
            panelItem1.revalidate();
            panelItem1.repaint();
        });
        
        String defaultOption = (String) jComboBox1.getSelectedItem();
    if ("Tiles".equals(defaultOption)) {
        addProductsAsTile();
    } else if ("Content".equals(defaultOption)) {
        addProductsAsContent();
    }
    }
    
    public static void setHeaderCart(int productHeaderCart) {
        if (productHeaderCart < 9) {
            headerCart.setText(Integer.toString(productHeaderCart));
        } else {
            headerCart.setText("9+");
        } 
    }
    
    public static void setHeaderFav(int productHeaderFav) {
        if (productHeaderFav < 9) {
            headerFav.setText(Integer.toString(productHeaderFav));
        } else {
            headerFav.setText("9+");
        } 
    }
    
    public static int getHeaderFav() {
    String currentVar = headerFav.getText();
    int currentIntVar;
    try {
        currentIntVar = Integer.parseInt(currentVar);
    } catch (NumberFormatException e) {
        currentIntVar = 0;
    }
    return currentIntVar;
}
    
    private void addProductsAsContent() {
        panelItem1.setLayout(new WrapLayout(WrapLayout.LEFT, 18, 18));
        for (HashMap<String, Object> product : products) {
            ImageIcon imageIcon = new ImageIcon((byte[]) product.get("primary_image"));
            String productName = (String) product.get("product_name");
            BigDecimal price = (BigDecimal) product.get("price");
            int deliveryStatusId = (int) product.get("delivery_status_id");
            String deliveryStatus = (deliveryStatusId == 1) ? "Free Delivery" : "No Delivery";
            String pCondition = (String) product.get("pcondition");
                    for (int i = 0; i < 8; i++) {

            panelItem1.add(new ContentViewCatalogue(
                    imageIcon, productName, "NRs. " + price, deliveryStatus, pCondition
            ));
                    }
        }
    }
    
    
    private void addProductsAsTile() {
        panelItem1.setLayout(new WrapLayout(WrapLayout.LEFT, 36, 36));
        for (HashMap<String, Object> product : products) {
            ImageIcon imageIcon = new ImageIcon((byte[]) product.get("primary_image"));
            String productName = (String) product.get("product_name");
            String description = (String) product.get("description");
            BigDecimal price = (BigDecimal) product.get("price");
            int deliveryStatusId = (int) product.get("delivery_status_id");
            String deliveryStatus = (deliveryStatusId == 1) ? "Free Delivery" : "No Delivery";
            String location = (String) product.get("location");
        
            for (int i = 0; i < 8; i++) {
            panelItem1.add(new TileViewCatalogue(
                    productName, 
                    description, 
                    price, "4.5", 
                    imageIcon, 
                    deliveryStatus, 
                    location
            ));
            }
        }
    }
    
    public void actionButton() {
        int centerX = (int) (this.getTopLevelAncestor().getLocationOnScreen().getX() + this.getTopLevelAncestor().getSize().getWidth() / 2 - listingDialog.getWidth() / 2);
        int centerY = (int) (this.getTopLevelAncestor().getLocationOnScreen().getY() + this.getTopLevelAncestor().getSize().getHeight() / 2 - listingDialog.getHeight() / 2);

        listingDialog.setLocation(centerX, centerY);
        
        listingDialog.setVisible(true);
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
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(panelItem1);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Group 13.png"))); // NOI18N
        jLabel1.setText("My Account");
        jLabel1.setIconTextGap(10);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Group 14.png"))); // NOI18N
        jLabel2.setText("Favourites");
        jLabel2.setIconTextGap(10);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Group 15.png"))); // NOI18N
        jLabel3.setText("Cart");
        jLabel3.setIconTextGap(10);

        styledSearchField1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        styledSearchField1.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/application/customer/image/Frame 15.png"))); // NOI18N

        navigationBar1.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Sort by");

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiles", "Content" }));
        jComboBox1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(navigationBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(styledSearchField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel2)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(42, 42, 42)
                        .addComponent(styledSearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(110, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(navigationBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                float xOffset = 0.830f;
                float yOffset = 0.124f;

                return "pos " + xOffset + "al " + yOffset + "al";
            }
        });
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        EchoMartRunner.openFavForm();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        navigationBar1.show(2);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        navigationBar1.show(1);
    }//GEN-LAST:event_jLabel4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private application.customer.design.NavigationBar navigationBar1;
    private application.customer.design.PanelItem panelItem1;
    private application.customer.design.StyledSearchField styledSearchField1;
    // End of variables declaration//GEN-END:variables
}
