package jdbc1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class TableInformation {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/world";
            String username = "root";
            String password = "root";

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            DatabaseMetaData meta = con.getMetaData();

            String catalog = "world";

            ResultSet tables = meta.getTables(catalog, null, "%", new String[] {"TABLE"});
 
            System.out.println("Tables in database: " + catalog);

            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                System.out.println(tableName);
            }

            con.close();

        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
