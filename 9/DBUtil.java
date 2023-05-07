package Assignment_9;
import java.sql.*;
public class DBUtil {
    private static Connection connection = null;

    private DBUtil() {} // Constructor

    public static Connection getConnection() throws SQLException
    {
        if (connection == null)
        {
            String username = "root";
            String password = "Trendy@123";
            String url = "jdbc:mysql://localhost:3306/cricketmanagement";
            // Creating the connection
            connection = DriverManager.getConnection(url, username, password);

        }
        return connection;
    }
}
