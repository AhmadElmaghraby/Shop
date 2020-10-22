package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    private static Connection con;
    private static String unicode = "?useUnicode=yes&characterEncoding=UTF-8";

    public static Connection getConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/shop" + unicode, "root", "root");
        } catch (ClassNotFoundException | SQLException ex) {

            ex.printStackTrace();
        }
        return con;
    }

    public static void connect() {
        if (con == null) {
            getConnect();
            System.out.println("connection success");
        }

    }

    public static void disconnect() {

        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
