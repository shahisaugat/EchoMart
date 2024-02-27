package application.customer.forms;

import application.customer.catalog.ContentViewCatalogue;
import application.customer.dao.FavouriteDAO;
import application.customer.design.WrapLayout;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author shahi
 */
public class FavouritesForm extends javax.swing.JPanel {

    private final List<HashMap<String, Object>> favorites;
    
    public FavouritesForm() {
        
        initComponents();
        
        removeAll();
        
        FavouriteDAO favDAO = new FavouriteDAO();
        
        String email = LoginForm.getStoredUserEmail();
        favorites = favDAO.fetchFavoritesByCustomer(email);
        
        for (HashMap<String, Object> favs : favorites) {
            
            panelItem1.setLayout(new WrapLayout(WrapLayout.LEFT, 18, 18));
            
            ImageIcon imageIcon = new ImageIcon((byte[]) favs.get("primary_image"));
            String productName = (String) favs.get("product_name");
            BigDecimal price = (BigDecimal) favs.get("price");
            int deliveryStatusId = (int) favs.get("delivery_status_id");
            String deliveryStatus = (deliveryStatusId == 1) ? "Free Delivery" : "No Delivery";
            String pCondition = (String) favs.get("pcondition");
        
            panelItem1.add(new ContentViewCatalogue(
                    imageIcon, productName, "NRs. " + price, deliveryStatus, pCondition
            ));
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 97, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private application.customer.design.PanelItem panelItem1;
    // End of variables declaration//GEN-END:variables
}
