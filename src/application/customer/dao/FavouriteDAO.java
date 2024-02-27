package application.customer.dao;

import application.main.database.MySQLConnection;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FavouriteDAO extends MySQLConnection {
    
    public int getProductId(String productTitle, BigDecimal price, String condition) {
        int productId = -1; // Default value if product is not found
        
        try (Connection conn = openConnection()) {
            String selectQuery = "SELECT product_id FROM products WHERE product_name = ? AND price = ? AND pcondition = ?";
            
            try (PreparedStatement ps = conn.prepareStatement(selectQuery)) {
                ps.setString(1, productTitle);
                ps.setBigDecimal(2, price);
                ps.setString(3, condition);
                
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
    
    public boolean addFavorite(String customerEmail, int productId) {
        try (Connection conn = openConnection()) {
            String insertQuery = "INSERT INTO favorites (customer_email, product_id) VALUES (?, ?)";
            
            try (PreparedStatement ps = conn.prepareStatement(insertQuery)) {
                ps.setString(1, customerEmail);
                ps.setInt(2, productId);
                
                int rowsAffected = ps.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<HashMap<String, Object>> fetchFavoritesByCustomer(String customerEmail) {
        List<HashMap<String, Object>> customerFavorites = new ArrayList<>();
        
        try (Connection conn = openConnection()) {
            String selectQuery = "SELECT p.product_name, p.price, p.delivery_status_id, p.pcondition, i.primary_image " +
                                 "FROM favorites f " +
                                 "JOIN products p ON f.product_id = p.product_id " +
                                 "JOIN images i ON p.product_id = i.product_id " +
                                 "WHERE f.customer_email = ?";
            
            try (PreparedStatement ps = conn.prepareStatement(selectQuery)) {
                ps.setString(1, customerEmail);
                
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        HashMap<String, Object> favoriteData = new HashMap<>();
                        favoriteData.put("product_name", rs.getString("product_name"));
                        favoriteData.put("price", rs.getBigDecimal("price"));
                        favoriteData.put("delivery_status_id", rs.getInt("delivery_status_id"));
                        favoriteData.put("pcondition", rs.getString("pcondition"));
                        favoriteData.put("primary_image", rs.getBytes("primary_image"));
                        
                        customerFavorites.add(favoriteData);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return customerFavorites;
    }
}
