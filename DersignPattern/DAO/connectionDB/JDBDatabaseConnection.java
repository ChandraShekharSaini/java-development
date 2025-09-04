package Patterns.DAO.connectionDB;
import java.sql.DriverManager;
import java.sql.Connection;


public class JDBDatabaseConnection {

    public  Connection getConnection() {

        Connection con=null;
        try {
            if (con == null) {
                // Load the JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Establish the connection
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dao", "root", "root");
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        return con;
    }

}

