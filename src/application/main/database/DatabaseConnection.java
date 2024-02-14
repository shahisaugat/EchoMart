package application.main.database;

import java.sql.*;
/**
 *@author shahi
**/

public interface DatabaseConnection {
    Connection openConnection();
    void closeConnection(Connection conn);
    ResultSet runQuery(Connection conn, String query);
    int executeUpdate(Connection conn, String query);
}