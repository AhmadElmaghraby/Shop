package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ExpensesM;

/**
 *
 * @author elmaghraby
 */
public class ExpensesControll {

    Connection con;
    Statement st;

    //ملئ الجدول  ببيانات       
    public ArrayList<ExpensesM> getExpences(String date1, String date2) {
        ArrayList<ExpensesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM shop.other  where created_at between '" + date1 + "' and '" + date2 + "'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                ExpensesM p = new ExpensesM();
                p.setPrice(res.getDouble("price"));
                p.setNote(res.getString("note"));
                p.setCreated_at(res.getString("created_at"));
                products.add(p);
            }
            st.close();
            con.close();
            System.out.println(Query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return products;
    }

    // Add expenses     id, price, note, created_at, uploaded_at
    public Boolean Addexpenses(String price, String note) {
        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "INSERT INTO other ( price, note )  VALUES (" + price + " , '" + note + "')";
            b = st.execute(Query);
            st.close();
            con.close();
            JOptionPane.showMessageDialog(null, "تمت الاضافة");
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "خطا");

            b = false;
        }

        return b;
    }
}
