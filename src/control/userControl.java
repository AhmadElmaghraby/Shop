package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.UserM;

public class userControl {

    Connection con;
    DBconnection db;
    Statement st;

    public boolean isUser(String user, String pass) {
        boolean found = false;

        try {

            con = db.getConnect();
            st = con.createStatement();
            String Query = "select * from users where name='" + user + "' and password='" + pass + "'";
            ResultSet res = st.executeQuery(Query);
            if (res.next()) {
                found = true;
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return found;
    }

    public UserM getUser(String name) {
        int is_admin = 0;
        UserM user = new UserM();
        try {
            con = db.getConnect();
            st = con.createStatement();
            String Query = "select * from users where name='" + name + "'";
            ResultSet res = st.executeQuery(Query);
            if (res.next()) {
                if (!res.getString("name").equals("")) {
                    is_admin = res.getInt("is_admin");
                    user.setUsername(res.getString("name"));
                    user.setCreated_at(res.getString("created_at"));
                    if (is_admin == 0) {
                        user.setIs_Admin(false);
                    } else {
                        user.setIs_Admin(true);
                    }
                }
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return user;
    }

    // 2020-04-20 23:24:03
    public Boolean delete() {
        Boolean b = true;
        try {
            
            
            String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "DELETE FROM shop.users WHERE created_at < '"+date+"'";

            st.execute(Query);
            st.close();
            con.close();
            System.out.println(Query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error : " + ex.getMessage());
            b = false;
        }
        return b;
    }

}
