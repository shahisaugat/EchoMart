package application.customer.dao;

import application.main.database.MySQLConnection;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author shahi
 */
public class ProfileFetchDAO extends MySQLConnection {
    public HashMap<String, Object> fetchCustomerData(String emailAddress) {
       HashMap<String, Object> customerData = new HashMap<>();
    
       try (Connection conn = openConnection()) {
            String selectQuery = "SELECT c.FullName, c.LastName, c.EmailAddress, cp.ProfilePicture " +
                               "FROM customers c " +
                               "JOIN customers_profile cp ON c.EmailAddress = cp.EmailAddress " +
                               "WHERE c.EmailAddress = ?";
        
                try (PreparedStatement ps = conn.prepareStatement(selectQuery)) {
                ps.setString(1, emailAddress);
            
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        customerData.put("FullName", rs.getString("FullName"));
                        customerData.put("LastName", rs.getString("LastName"));
                        customerData.put("EmailAddress", rs.getString("EmailAddress"));
                        customerData.put("ProfilePicture", rs.getBytes("ProfilePicture"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerData;
    }

}
