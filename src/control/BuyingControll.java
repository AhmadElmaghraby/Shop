package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.SalesM;

public class BuyingControll {

    Connection con;
    Statement st;
    //ملئ الجدول  ببيانات             
    public ArrayList<SalesM> getSalesDate_in(String date1, String date2) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM buy_in_item , in_item ,clients where( buy_in_item.in_item_id = in_item.id and buy_in_item.client_id=clients.id) "
                    + "and (buy_in_item.created_at between '" + date1 + "' and '" + date2 + "' ) order by buy_in_item.id";
            ResultSet res = st.executeQuery(Query);
            System.out.println(Query);
            while (res.next()) {

                SalesM p = new SalesM();
                p.setId(res.getInt("buy_in_item.id"));
                p.setAmount(res.getInt("buy_in_item.number"));
                p.setSell_price(res.getDouble("buy_in_item.buy_price"));
                p.setProduct_name(res.getString("in_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("buy_in_item.all_price"));
                p.setCreated_at(res.getString("buy_in_item.created_at"));
                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getSalesDate_in : " + ex.getMessage());
        }

        return products;
    }

    public ArrayList<SalesM> getSalesDate_out(String date1, String date2) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM buy_out_item , out_item ,clients where( buy_out_item.out_item_id = out_item.id and buy_out_item.client_id=clients.id) "
                    + "and (buy_out_item.created_at between '" + date1 + "' and '" + date2 + "' ) order by buy_out_item.id";
            ResultSet res = st.executeQuery(Query);
            System.out.println(Query);
            while (res.next()) {

                SalesM p = new SalesM();
                p.setId(res.getInt("buy_out_item.id"));
                p.setAmount(res.getInt("buy_out_item.number"));
                p.setSell_price(res.getDouble("buy_out_item.buy_price"));
                p.setProduct_name(res.getString("out_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("buy_out_item.all_price"));
                p.setCreated_at(res.getString("buy_out_item.created_at"));
                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getSalesDate_out : " + ex.getMessage());
        }

        return products;
    }

    //ملئ الجدول  ببيانات       (search  name)        
    public ArrayList<SalesM> getSalesName_in(String name) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM buy_in_item , in_item,clients where (buy_in_item.in_item_id = in_item.id and in_item.name like '" + name + "') and buy_in_item.client_id=clients.id";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("buy_in_item.id"));
                p.setAmount(res.getInt("buy_in_item.number"));
//                p.setGain(res.getInt("buy_in_item.gain"));
                p.setSell_price(res.getDouble("buy_in_item.buy_price"));
                p.setProduct_name(res.getString("in_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("buy_in_item.all_price"));
                p.setCreated_at(res.getString("buy_in_item.created_at"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getSalesName_in : " + ex.getMessage());
        }

        return products;
    }

    public ArrayList<SalesM> getSalesName_out(String name) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM buy_out_item , out_item,clients where (buy_out_item.out_item_id = out_item.id and out_item.name like '" + name + "') and buy_out_item.client_id=clients.id";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("buy_out_item.id"));
                p.setAmount(res.getInt("buy_out_item.number"));
                p.setSell_price(res.getDouble("buy_out_item.buy_price"));
                p.setProduct_name(res.getString("out_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("buy_out_item.all_price"));
                p.setCreated_at(res.getString("buy_out_item.created_at"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getSalesName_out : " + ex.getMessage());
        }

        return products;
    }

}
