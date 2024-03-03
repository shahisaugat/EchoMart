package application.customer.dao;

import application.main.database.MySQLConnection;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author shahi
 */
public class ProductDescDAO extends MySQLConnection {
    public int fetchProductId(String productName, BigDecimal price) {
    int productId = -1;
    
    try (Connection conn = openConnection()) {
        String selectQuery = "SELECT product_id FROM products WHERE product_name = ? AND price = ? AND seller_email = ?";
        
        try (PreparedStatement ps = conn.prepareStatement(selectQuery)) {
            ps.setString(1, productName);
            ps.setBigDecimal(2, price);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    productId = rs.getInt("product_id");
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return productId;
}
    public HashMap<String, Object> fetchProductData(String productName, int productId) {
    HashMap<String, Object> productData = new HashMap<>();
    
    try (Connection conn = openConnection()) {
        String selectQuery = "SELECT p.product_name, p.location, p.description, p.price, p.delivery_status_id, p.pcondition, " +
                             "i.primary_image, i.secondary_image, i.tertiary_image, " +
                             "p.seller_email, p.category_id, p.upload_date " +
                             "FROM products p " +
                             "JOIN images i ON p.product_id = i.product_id " +
                             "WHERE p.product_name = ? AND p.product_id = ?";
        
        try (PreparedStatement ps = conn.prepareStatement(selectQuery)) {
            ps.setString(1, productName);
            ps.setInt(2, productId);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    productData.put("product_name", rs.getString("product_name"));
                    productData.put("description", rs.getString("description"));
                    productData.put("price", rs.getBigDecimal("price"));
                    productData.put("location", rs.getString("location"));
                    productData.put("delivery_status_id", rs.getInt("delivery_status_id"));
                    productData.put("pcondition", rs.getString("pcondition"));
                    productData.put("primary_image", rs.getBytes("primary_image"));
                    productData.put("secondary_image", rs.getBytes("secondary_image"));
                    productData.put("tertiary_image", rs.getBytes("tertiary_image"));
                    productData.put("seller_email", rs.getString("seller_email"));
                    productData.put("category_id", rs.getInt("category_id"));
                    productData.put("upload_date", rs.getString("upload_date"));
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return productData;
}
}
