package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    public static Connection getConnection() { 
        Connection connection = null;
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://MSI:1433; databaseName=Product";
            String user = "sa";
            String pass = "1234";
            connection = DriverManager.getConnection(url, user, pass);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return connection;
    }
    public static void closeConnection(Connection con) {
        if(con!= null) {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
