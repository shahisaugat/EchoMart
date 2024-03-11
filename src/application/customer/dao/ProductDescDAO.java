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
        String selectQuery = "SELECT product_id FROM products WHERE product_name = ? AND price = ?";
        
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
        String selectQuery = "SELECT p.description, " +
                             "i.secondary_image, i.tertiary_image, " +
                             "p.seller_email, c.FullName, c.LastName, " +
                             "p.category_id, p.upload_date, " + // Added comma here
                             "cp.ContactNumber " + // Moved to the same line
                             "FROM products p " +
                             "JOIN images i ON p.product_id = i.product_id " +
                             "JOIN customers c ON p.seller_email = c.EmailAddress " + 
                             "JOIN customers_profile cp ON p.seller_email = cp.EmailAddress " +
                             "WHERE p.product_name = ? AND p.product_id = ?";
        
        System.out.println("SQL Query: " + selectQuery); // Debug
        
        try (PreparedStatement ps = conn.prepareStatement(selectQuery)) {
            ps.setString(1, productName);
            ps.setInt(2, productId);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    productData.put("description", rs.getString("description"));
                    productData.put("secondary_image", rs.getBytes("secondary_image"));
                    productData.put("tertiary_image", rs.getBytes("tertiary_image"));
                    productData.put("seller_email", rs.getString("seller_email"));
                    productData.put("first_name", rs.getString("FullName"));
                    productData.put("last_name", rs.getString("LastName"));
                    productData.put("ContactNumber", rs.getString("ContactNumber"));
                    productData.put("category_id", rs.getInt("category_id"));
                    productData.put("upload_date", rs.getString("upload_date"));
                    
                    System.out.println("Data retrieved successfully."); // Debug
                } else {
                    System.out.println("No data found for the given product name and ID."); // Debug
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return productData;
}
}
