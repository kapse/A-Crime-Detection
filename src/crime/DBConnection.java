package crime;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {

    Statement stt;
    public static final String USERNAME = "root";
    public static final String PASSWORD = "1234@vaibhav";
    public static final String HOSTNAME = "jdbc:mysql://localhost:3306/";
    public static final String DBNAME = "db_crime";

    DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:odbc:LocalDB", "", "");
            Connection con = DriverManager.getConnection(HOSTNAME + DBNAME, USERNAME, PASSWORD);
            System.out.println("hello ");
            stt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        new DBConnection();
    }
}
