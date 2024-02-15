package application.customer.dao;

import application.customer.model.CustomerData;
import application.main.database.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author shahi
 */
public class CustomerDAO extends MySQLConnection {
    public boolean saveCustomerData(CustomerData customer) {
        try (Connection conn = openConnection()) {
            
            String insertQuery = "INSERT INTO customers " +
                    "(FullName, LastName, EmailAddress, Password) " + " VALUES (?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(insertQuery)) {
                ps.setString(1, customer.getFullName());
                ps.setString(2, customer.getLastName());
                ps.setString(3, customer.getEmailAddress());
                ps.setString(4, customer.getPassword());
                
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
    
    public boolean isAccountExists(String emailAddress) {
    try (Connection conn = openConnection()) {
        String checkQuery = "SELECT COUNT(*) FROM customers WHERE EmailAddress = ?";
        try (PreparedStatement checkPs = conn.prepareStatement(checkQuery)) {
            checkPs.setString(1, emailAddress);
            try (ResultSet resultSet = checkPs.executeQuery()) {
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0;
                }
            }
        }
        return false;
    } catch (SQLException e) {
        e.printStackTrace();
        throw new RuntimeException("Error occurred while checking account existence", e);
    }
}
    
    public LoginStatus validateLogin(String emailAddress, String enteredPassword) {
        try (Connection conn = openConnection()) {
            String query = "SELECT EmailAddress, Password FROM customers WHERE EmailAddress = ?";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ps.setString(1, emailAddress);
                try (ResultSet resultSet = ps.executeQuery()) {
                    if (resultSet.next()) {
                        String storedPassword = resultSet.getString("Password");
                        if (enteredPassword.equals(storedPassword)) {
                            return LoginStatus.SUCCESS;
                        } else {
                            return LoginStatus.INVALID_PASSWORD;
                        }
                    } else {
                        return LoginStatus.USER_NOT_FOUND;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return LoginStatus.ERROR;
        }
    }

    public enum LoginStatus {
        SUCCESS,
        INVALID_PASSWORD,
        USER_NOT_FOUND,
        ERROR
    }

    
}
