package application.customer.dao;

import application.customer.model.CustomerData;
import application.main.database.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
}
