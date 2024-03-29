package application.main.database;

import java.sql.*;
/**
 *@author shahi
**/

public class MySQLConnection implements DatabaseConnection {

    @Override
    public Connection openConnection() { 
        try{
            String username = "root";
            String password = "SaugatSHELL196$!";
            String database = "echomart";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection;
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/" + database, username, password
            );
            if(connection == null){
                System.out.println("Database connection fail");
            }else{
                System.out.println("Database connection success");
            }
            return connection;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    @Override
    public void closeConnection(Connection conn) {
        try{
            if(conn !=null && !conn.isClosed()){
                conn.close();
                System.out.println("Connection close");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    @Override
    public ResultSet runQuery(Connection conn, String query) {
        try{
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(query);
            return result;
        }catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }

    @Override
    public int executeUpdate(Connection conn, String query) {
        try{
            Statement stmt = conn.createStatement();
            int result = stmt.executeUpdate(query);
            return result;
        }catch(SQLException e){
            System.out.println(e);
            return -1;
        }
    }
    
}