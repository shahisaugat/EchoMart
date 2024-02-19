package application.customer.dao;

import application.main.database.MySQLConnection;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author shahi
 */
public class RecoveryCodesDAO extends MySQLConnection {
    
    public boolean saveRecoveryCodes(String emailAddress, String[] recoveryCodes, Timestamp expirationTime) {
    try (Connection conn = openConnection()) {
        String insertQuery = "INSERT INTO RecoveryCodes " +
                             "(EmailAddress, RecoveryCode1, RecoveryCode2, RecoveryCode3, " +
                             "RecoveryCode4, RecoveryCode5, RecoveryCode6, " +
                             "ExpirationTime) " +
                             "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement ps = conn.prepareStatement(insertQuery)) {
            ps.setString(1, emailAddress);
            
            // Insert recovery codes into respective columns
            for (int i = 0; i < 6; i++) {
                ps.setString(i + 2, recoveryCodes[i]); // Bind recovery code values starting from index 2
            }
            
            ps.setTimestamp(8, expirationTime); // Bind expiration time value
            
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Database Connection Failed!");
    }
    return false;
}

    public HashMap<String, HashMap<String, Object>> fetchRecoveryCodes(String email) {
    HashMap<String, HashMap<String, Object>> recoveryCodes = new HashMap<>();

    try (Connection conn = openConnection()) {
        String selectQuery = "SELECT RecoveryCode1, RecoveryCode2, RecoveryCode3, " +
                             "RecoveryCode4, RecoveryCode5, RecoveryCode6, " +
                             "ExpirationTime, CreationTime " +
                             "FROM RecoveryCodes " +
                             "WHERE EmailAddress = ?";

        try (PreparedStatement ps = conn.prepareStatement(selectQuery)) {
            ps.setString(1, email);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    for (int i = 1; i <= 6; i++) {
                        String recoveryCode = rs.getString("RecoveryCode" + i);
                        if (recoveryCode != null) {
                            HashMap<String, Object> recoveryCodeData = new HashMap<>();
                            recoveryCodeData.put("RecoveryCode", recoveryCode);
                            recoveryCodeData.put("ExpirationTime", rs.getTimestamp("ExpirationTime"));
                            recoveryCodeData.put("CreationTime", rs.getTimestamp("CreationTime"));
                            
                            recoveryCodes.put(recoveryCode, recoveryCodeData);
                        }
                    }
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return recoveryCodes;
}
}
