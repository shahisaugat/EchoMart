package application.customer.dao;

import application.customer.model.CatalogModel;
import application.main.database.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductDataDAO extends MySQLConnection {

    public boolean saveProductData(CatalogModel product) {
    try (Connection conn = openConnection()) {
        conn.setAutoCommit(false);
        
        String insertProductQuery = "INSERT INTO products (seller_email, category_id, product_name, description, price, delivery_status_id, upload_date, pcondition, availability_status, location) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement psProduct = conn.prepareStatement(insertProductQuery, PreparedStatement.RETURN_GENERATED_KEYS)) {
            psProduct.setString(1, product.getEmail());
            psProduct.setInt(2, product.getpCategory());
            psProduct.setString(3, product.getpTitle());
            psProduct.setString(4, product.getpDesc());
            psProduct.setBigDecimal(5, product.getpPrice());
            psProduct.setInt(6, product.getdStatus());
            psProduct.setString(7, product.getDate());
            psProduct.setString(8, product.getpCondition());
            psProduct.setString(9, "Available");
            psProduct.setString(10, product.getLocation());
            
            int resultProduct = psProduct.executeUpdate();
            if (resultProduct > 0) {
                int productId = -1;
                try (ResultSet generatedKeys = psProduct.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        productId = generatedKeys.getInt(1);
                    }
                }
                
                if (productId != -1) {
                    String insertImagesQuery = "INSERT INTO images (product_id, primary_image, secondary_image, tertiary_image) VALUES (?, ?, ?, ?)";
                    try (PreparedStatement psImages = conn.prepareStatement(insertImagesQuery)) {
                        psImages.setInt(1, productId);
                        psImages.setBytes(2, product.getImg1());
                        psImages.setBytes(3, product.getImg2());
                        psImages.setBytes(4, product.getImg3());
                        
                        int resultImages = psImages.executeUpdate();
                        if (resultImages > 0) {
                            conn.commit();
                            return true;
                        }
                    }
                }
            }
        } catch (SQLException e) {
            conn.rollback(); 
            System.out.println(e + " Transaction rolled back.");
            return false;
        }
    } catch (SQLException e) {
        System.out.println(e + " Database Connection Failed!");
        return false;
    }
    return false;
}
    
    public List<HashMap<String, Object>> fetchAllProductData() {
    List<HashMap<String, Object>> allProductData = new ArrayList<>();
    
    try (Connection conn = openConnection()) {
        String selectQuery = "SELECT p.product_name, p.location, p.description, p.price, p.delivery_status_id, p.pcondition, i.primary_image " +
                             "FROM products p " +
                             "JOIN images i ON p.product_id = i.product_id";
        
        try (PreparedStatement ps = conn.prepareStatement(selectQuery)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    HashMap<String, Object> productData = new HashMap<>();
                    productData.put("product_name", rs.getString("product_name"));
                    productData.put("description", rs.getString("description"));
                    productData.put("price", rs.getBigDecimal("price"));
                    productData.put("location", rs.getString("location"));
                    productData.put("delivery_status_id", rs.getInt("delivery_status_id"));
                    productData.put("pcondition", rs.getString("pcondition"));
                    productData.put("primary_image", rs.getBytes("primary_image"));
                    
                    allProductData.add(productData);
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return allProductData;
}

}
