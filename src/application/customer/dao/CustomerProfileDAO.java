package application.customer.dao;

import application.customer.model.CustomerProfile;
import application.main.database.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author shahi
 */
public class CustomerProfileDAO extends MySQLConnection {
    public boolean saveCustomerProfile(CustomerProfile customerProfile) {
        try (Connection conn = openConnection()) {
            
            String insertQuery = "INSERT INTO customers_profile " +
                    "(EmailAddress, ProfilePicture, DateOfBirth, ContactNumber, Province, ShippingAddress) " 
                    + " VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(insertQuery)) {
                ps.setString(1, customerProfile.getEmailAddress());
                ps.setBytes(2, customerProfile.getImageData());
                ps.setString(3, customerProfile.getDateOfBirth());
                ps.setString(4, customerProfile.getContactNumber());
                ps.setString(5, customerProfile.getProvince());
                ps.setString(6, customerProfile.getShippingAddress());
                
                int result = ps.executeUpdate();
                if (result > 0) {
                    return true;
                }
            }
        } catch (SQLException e) {
            System.out.println(e + "Database Connection Failed!");
        }
        return false;
    }
    
    public boolean changePassword(String newPassword, String emailAddress) {
    String query = "UPDATE customers SET Password = ? WHERE EmailAddress = ?";

    try (Connection conn = openConnection();
         PreparedStatement statement = conn.prepareStatement(query)) {
        
        statement.setString(1, newPassword);
        statement.setString(2, emailAddress);
        
        int rowsUpdated = statement.executeUpdate();
        
        return rowsUpdated > 0;
    } catch (SQLException ex) {
        return false; 
    }
}
}
