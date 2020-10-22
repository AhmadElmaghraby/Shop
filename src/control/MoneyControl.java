package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MoneyControl {

    Connection con;
    Statement st;
    // get all Gain  

    public Double getExpenses() {
        double gain = 0;
        Boolean b = false;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query2 = "select price from other";
            ResultSet res = st.executeQuery(Query2);
            while (res.next()) {
                gain += res.getDouble("price");
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return gain;
    }

    public double getGain_in() {
        double gain = 0;
        Boolean b = false;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select gain from sell_in_item";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                gain += res.getDouble("gain");
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return gain;
    }

    public double getGain_out() {
        double gain = 0;
        Boolean b = false;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select gain from sell_out_item";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                gain += res.getDouble("gain");
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return gain;
    }

    public double getExpensesDate(String date1, String date2) {
        double gain = 0;
        Boolean b = false;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query2 = "select price from other  where created_at between '" + date1 + "' and '" + date2 + "'";
            ResultSet res = st.executeQuery(Query2);
            while (res.next()) {
                gain += res.getDouble("gain");
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return gain;
    }

    public double getGainDate_in(String date1, String date2) {
        double gain = 0;
        Boolean b = false;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select gain from sell_in_item where created_at between '" + date1 + "' and '" + date2 + "'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                gain += res.getDouble("gain");
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return gain;
    }

    public double getGainDate_out(String date1, String date2) {
        double gain = 0;
        Boolean b = false;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select gain from sell_out_item where created_at between '" + date1 + "' and '" + date2 + "'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                gain += res.getDouble("gain");
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return gain;
    }

    ////////////////////////////
    public double getCorrupt_in() {
        double gain = 0;
        Boolean b = false;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query2 = "select money from corrupts_in";
            ResultSet res = st.executeQuery(Query2);
            while (res.next()) {
                gain += res.getDouble("money");
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return gain;
    }

    public double getCorrupt_out() {
        double gain = 0;
        Boolean b = false;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query2 = "select money from corrupts_out";
            ResultSet res = st.executeQuery(Query2);
            while (res.next()) {
                gain += res.getDouble("money");
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return gain;
    }

        public double getCorruptDate_In(String date1, String date2) {
        double gain = 0;
        Boolean b = false;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select money from corrupts_in  where created_at between '" + date1 + "' and '" + date2 + "'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                gain += res.getDouble("money");
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return gain;
    }
    
    public double getCorruptDate_out(String date1, String date2) {
        double gain = 0;
        Boolean b = false;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select money from corrupts_out where created_at between '" + date1 + "' and '" + date2 + "'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                gain += res.getDouble("money");
            }

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return gain;
    }

}
