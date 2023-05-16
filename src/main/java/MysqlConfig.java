import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConfig {
    String database = "develop";
    String user = "root";
    String password = "root";

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/"+database+"?user="+user+"&password="+password;

        return DriverManager.getConnection(url);
    }
}
