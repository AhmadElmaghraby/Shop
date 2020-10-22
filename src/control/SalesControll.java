package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.SalesM;

public class SalesControll {

    Connection con;
    Statement st;
    //ملئ الجدول  ببيانات             
    public ArrayList<SalesM> getSales_in() {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM sell_in_item , in_item ,clients where( sell_in_item.in_item_id = in_item.id and sell_in_item.client_id=clients.id)\n"
                    + " order by sell_in_item.created_at";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("sell_in_item.id"));
                p.setAmount(res.getInt("sell_in_item.number"));
                p.setGain(res.getDouble("sell_in_item.gain"));
                p.setSell_price(res.getDouble("sell_in_item.sell_price"));
                p.setProduct_name(res.getString("in_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("sell_in_item.all_price"));
                p.setCreated_at(res.getString("sell_in_item.created_at"));
                p.setIs_paid(res.getInt("is_paid"));
                p.setNote(res.getString("sell_in_item.note"));
                p.setBill_id(res.getInt("sell_in_item.bill"));
                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getSales in : " + ex.getMessage());
        }

        return products;
    }

    //ملئ الجدول  ببيانات             
    public ArrayList<SalesM> getSales_out() {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM sell_out_item , out_item ,clients "
                    + "where( sell_out_item.out_item_id = out_item.id and sell_out_item.client_id=clients.id)"
                    + " order by sell_out_item.created_at";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("sell_out_item.id"));
                p.setAmount(res.getInt("sell_out_item.number"));
                p.setGain(res.getDouble("sell_out_item.gain"));
                p.setSell_price(res.getDouble("sell_out_item.sell_price"));
                p.setProduct_name(res.getString("out_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("sell_out_item.all_price"));
                p.setCreated_at(res.getString("sell_out_item.created_at"));
                p.setIs_paid(res.getInt("is_paid"));
                p.setNote(res.getString("sell_out_item.note"));
                p.setBill_id(res.getInt("sell_out_item.bill"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getSales out : " + ex.getMessage());
        }

        return products;
    }

    public ArrayList<SalesM> getSalesDate_in(String date1, String date2) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM sell_in_item , in_item ,clients where( sell_in_item.in_item_id = in_item.id and sell_in_item.client_id=clients.id) "
                    + "and (sell_in_item.created_at between '" + date1 + "' and '" + date2 + "' ) order by sell_in_item.created_at";
            ResultSet res = st.executeQuery(Query);
            System.out.println(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("sell_in_item.id"));
                p.setAmount(res.getInt("sell_in_item.number"));
                p.setGain(res.getDouble("sell_in_item.gain"));
                p.setSell_price(res.getDouble("sell_in_item.sell_price"));
                p.setProduct_name(res.getString("in_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("sell_in_item.all_price"));
                p.setCreated_at(res.getString("sell_in_item.created_at"));
                p.setIs_paid(res.getInt("is_paid"));
                p.setNote(res.getString("sell_in_item.note"));
                p.setBill_id(res.getInt("sell_in_item.bill"));
                p.setProduct_color(res.getString("in_item.color"));
                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getSales : " + ex.getMessage());
        }

        return products;
    }

    public ArrayList<SalesM> getSalesDate_out(String date1, String date2) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM sell_out_item , out_item ,clients where( sell_out_item.out_item_id = out_item.id and sell_out_item.client_id=clients.id) "
                    + "and (sell_out_item.created_at between '" + date1 + "' and '" + date2 + "' ) order by sell_out_item.created_at";
            ResultSet res = st.executeQuery(Query);
            System.out.println(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("sell_out_item.id"));
                p.setAmount(res.getInt("sell_out_item.number"));
                p.setGain(res.getDouble("sell_out_item.gain"));
                p.setSell_price(res.getDouble("sell_out_item.sell_price"));
                p.setProduct_name(res.getString("out_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("sell_out_item.all_price"));
                p.setCreated_at(res.getString("sell_out_item.created_at"));
                p.setIs_paid(res.getInt("is_paid"));
                p.setNote(res.getString("sell_out_item.note"));
                p.setBill_id(res.getInt("sell_out_item.bill"));
                p.setProduct_color(res.getString("out_item.color"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getSales : " + ex.getMessage());
        }

        return products;
    }

    public ArrayList<SalesM> getSalesName_in(String name) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM sell_in_item , in_item,clients where "+ "(sell_in_item.in_item_id = in_item.id and in_item.name like '" + name + "') and sell_in_item.client_id=clients.id";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("sell_in_item.id"));
                p.setAmount(res.getInt("sell_in_item.number"));
                p.setGain(res.getDouble("sell_in_item.gain"));
                p.setSell_price(res.getDouble("sell_in_item.sell_price"));
                p.setProduct_name(res.getString("in_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("sell_in_item.all_price"));
                p.setCreated_at(res.getString("sell_in_item.created_at"));
                p.setIs_paid(res.getInt("is_paid"));
                p.setNote(res.getString("sell_in_item.note"));
                p.setBill_id(res.getInt("sell_in_item.bill"));
                p.setProduct_color(res.getString("in_item.color"));
                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getProductName : " + ex.getMessage());
        }
        return products;
    }

    public ArrayList<SalesM> getSalesName_out(String name) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM sell_out_item , out_item,clients where "
                    + "(sell_out_item.out_item_id = out_item.id and out_item.name like '" + name + "') and sell_out_item.client_id=clients.id";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("sell_out_item.id"));
                p.setAmount(res.getInt("sell_out_item.number"));
                p.setGain(res.getDouble("sell_out_item.gain"));
                p.setSell_price(res.getDouble("sell_out_item.sell_price"));
                p.setProduct_name(res.getString("out_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("sell_out_item.all_price"));
                p.setCreated_at(res.getString("sell_out_item.created_at"));
                p.setIs_paid(res.getInt("is_paid"));
                p.setNote(res.getString("sell_out_item.note"));
                p.setBill_id(res.getInt("sell_out_item.bill"));
                p.setProduct_color(res.getString("out_item.color"));
                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getProductName : " + ex.getMessage());
        }
        return products;
    }

    public ArrayList<SalesM> getBuyClient_out(int  id) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM buy_out_item , out_item,clients where "+
                    "(buy_out_item.out_item_id = out_item.id and buy_out_item.client_id = " + id + ")and clients.id = "+id;
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("buy_out_item.id"));
                p.setAmount(res.getInt("buy_out_item.number"));
//                p.setGain(res.getDouble("buy_out_item.gain"));
                p.setSell_price(res.getDouble("buy_out_item.buy_price"));
                p.setProduct_name(res.getString("out_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("buy_out_item.all_price"));
                p.setCreated_at(res.getString("buy_out_item.created_at"));
                p.setIs_paid(res.getInt("is_paid"));
//                p.setNote(res.getString("buy_out_item.note"));
//                p.setBill_id(res.getInt("buy_out_item.bill"));
                p.setProduct_color(res.getString("out_item.color"));
                products.add(p);
            }
            System.out.println(Query);
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getProductName : " + ex.getMessage());
        }
        return products;
    }

    public ArrayList<SalesM> getBuyClient_in(int  id) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM buy_in_item , in_item,clients where "+
                    "(buy_in_item.in_item_id = in_item.id and buy_in_item.client_id = " + id + ")and clients.id = "+id;
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("buy_in_item.id"));
                p.setAmount(res.getInt("buy_in_item.number"));
//                p.setGain(res.getDouble("buy_in_item.gain"));
                p.setSell_price(res.getDouble("buy_in_item.buy_price"));
                p.setProduct_name(res.getString("in_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("buy_in_item.all_price"));
                p.setCreated_at(res.getString("buy_in_item.created_at"));
                p.setIs_paid(res.getInt("is_paid"));
//                p.setNote(res.getString("buy_in_item.note"));
//                p.setBill_id(res.getInt("buy_in_item.bill"));
                p.setProduct_color(res.getString("in_item.color"));
                products.add(p);
            }
            System.out.println(Query);
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getProductName : " + ex.getMessage());
        }
        return products;
    }

    public ArrayList<SalesM> getSalesClient_out(int  id) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM sell_out_item , out_item,clients where "+
                    "(sell_out_item.out_item_id = out_item.id and sell_out_item.client_id = " + id + ")and clients.id = "+id;
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("sell_out_item.id"));
                p.setAmount(res.getInt("sell_out_item.number"));
                p.setGain(res.getDouble("sell_out_item.gain"));
                p.setSell_price(res.getDouble("sell_out_item.sell_price"));
                p.setProduct_name(res.getString("out_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("sell_out_item.all_price"));
                p.setCreated_at(res.getString("sell_out_item.created_at"));
                p.setIs_paid(res.getInt("is_paid"));
                p.setNote(res.getString("sell_out_item.note"));
                p.setBill_id(res.getInt("sell_out_item.bill"));
                p.setProduct_color(res.getString("out_item.color"));
                products.add(p);
            }
            System.out.println(Query);
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getProductName : " + ex.getMessage());
        }
        return products;
    }
    
    public ArrayList<SalesM> getSalesClient_in(int  id) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM sell_in_item , in_item,clients where "+
                    "(sell_in_item.in_item_id = in_item.id and sell_in_item.client_id = " + id + ")and clients.id = "+id;
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("sell_in_item.id"));
                p.setAmount(res.getInt("sell_in_item.number"));
                p.setGain(res.getDouble("sell_in_item.gain"));
                p.setSell_price(res.getDouble("sell_in_item.sell_price"));
                p.setProduct_name(res.getString("in_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("sell_in_item.all_price"));
                p.setCreated_at(res.getString("sell_in_item.created_at"));
                p.setIs_paid(res.getInt("is_paid"));
                p.setNote(res.getString("sell_in_item.note"));
                p.setBill_id(res.getInt("sell_in_item.bill"));
                p.setProduct_color(res.getString("in_item.color"));
                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getProductName : " + ex.getMessage());
        }
        return products;
    }

    public ArrayList<SalesM> getSalesBill_in(String bill) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM sell_in_item , in_item ,clients where( sell_in_item.in_item_id = in_item.id and sell_in_item.client_id=clients.id)\n"
                    + " and bill = " + bill + " order by sell_in_item.created_at";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("sell_in_item.id"));
                p.setAmount(res.getInt("sell_in_item.number"));
                p.setGain(res.getDouble("sell_in_item.gain"));
                p.setSell_price(res.getDouble("sell_in_item.sell_price"));
                p.setProduct_name(res.getString("in_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("sell_in_item.all_price"));
                p.setCreated_at(res.getString("sell_in_item.created_at"));
                p.setProduct_color(res.getString("in_item.color"));
                p.setIs_paid(res.getInt("is_paid"));
                p.setNote(res.getString("sell_in_item.note"));
                p.setBill_id(res.getInt("sell_in_item.bill"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getSales in : " + ex.getMessage());
        }

        return products;
    }

    public ArrayList<SalesM> getSalesBill_out(String bill) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM sell_out_item , out_item ,clients where( sell_out_item.out_item_id = out_item.id and sell_out_item.client_id=clients.id)\n"
                    + " and bill = " + bill + " order by sell_out_item.created_at";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("sell_out_item.id"));
                p.setAmount(res.getInt("sell_out_item.number"));
                p.setGain(res.getDouble("sell_out_item.gain"));
                p.setSell_price(res.getDouble("sell_out_item.sell_price"));
                p.setProduct_name(res.getString("out_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("sell_out_item.all_price"));
                p.setCreated_at(res.getString("sell_out_item.created_at"));
                p.setProduct_color(res.getString("out_item.color"));
                p.setIs_paid(res.getInt("is_paid"));
                p.setNote(res.getString("sell_out_item.note"));
                p.setBill_id(res.getInt("sell_out_item.bill"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getSales in : " + ex.getMessage());
        }

        return products;
    }

    public SalesM getSelectedSell_in(String id) {
        SalesM p = null;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM sell_in_item , in_item ,clients where( sell_in_item.in_item_id = in_item.id and sell_in_item.client_id=clients.id)\n"
                    + " and sell_in_item.id = " + id + " order by sell_in_item.created_at";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                p = new SalesM();
                p.setId(res.getInt("sell_in_item.id"));
                p.setAmount(res.getInt("sell_in_item.number"));
                p.setGain(res.getDouble("sell_in_item.gain"));
                p.setSell_price(res.getDouble("sell_in_item.sell_price"));
                p.setProduct_name(res.getString("in_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("sell_in_item.all_price"));
                p.setCreated_at(res.getString("sell_in_item.created_at"));
                p.setProduct_color(res.getString("in_item.color"));
                p.setIs_paid(res.getInt("is_paid"));
                p.setNote(res.getString("sell_in_item.note"));
                p.setBill_id(res.getInt("sell_in_item.bill"));

            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getSales in : " + ex.getMessage());
        }

        return p;
    }

    public SalesM getSelectedSell_out(String id) {
        SalesM p = new SalesM();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM sell_out_item , out_item ,clients where( sell_out_item.out_item_id = out_item.id and sell_out_item.client_id=clients.id)\n"
                    + " and sell_out_item.id = " + id + " order by sell_out_item.created_at";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                p = new SalesM();
                p.setId(res.getInt("sell_out_item.id"));
                p.setAmount(res.getInt("sell_out_item.number"));
                p.setGain(res.getDouble("sell_out_item.gain"));
                p.setSell_price(res.getDouble("sell_out_item.sell_price"));
                p.setProduct_name(res.getString("out_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("sell_out_item.all_price"));
                p.setCreated_at(res.getString("sell_out_item.created_at"));
                p.setProduct_color(res.getString("out_item.color"));
                p.setIs_paid(res.getInt("is_paid"));
                p.setNote(res.getString("sell_out_item.note"));
                p.setBill_id(res.getInt("sell_out_item.bill"));

            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("getSales in : " + ex.getMessage());
        }
        return p;
    }

    public Boolean deleteSell_in(int id) {
        Boolean b = true;
        SalesM p = new SalesM();

        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query2 = "select *  from sell_in_item  where id =" + id;
            ResultSet res = st.executeQuery(Query2);
            int item_id = 0;
            int number = 0;
            int is_paid = 0;
            int client_id = 0;
            double all_price = 0;

            while (res.next()) {
                item_id = res.getInt("in_item_id");
                number = res.getInt("number");
                is_paid = res.getInt("is_paid");
                client_id = res.getInt("client_id");
                all_price = res.getDouble("all_price");
            }
            String Query3 = "update in_item set number =number + " + number + " where id =" + item_id;
            String Query4 = "update clients set creditor =creditor - " + all_price + " where id =" + client_id;
            if (is_paid == 0) {
                st.execute(Query4);
            }
            String Query = "delete from sell_in_item  where id =" + id;
            st.execute(Query3);
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

    public Boolean deleteSell_out(int id) {
        Boolean b = true;
        SalesM p = new SalesM();

        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query2 = "select *  from sell_out_item  where id =" + id;
            ResultSet res = st.executeQuery(Query2);
            int item_id = 0;
            int number = 0;
            int is_paid = 0;
            int client_id = 0;
            double all_price = 0;

            while (res.next()) {
                item_id = res.getInt("out_item_id");
                number = res.getInt("number");
                is_paid = res.getInt("is_paid");
                client_id = res.getInt("client_id");
                all_price = res.getDouble("all_price");
            }

            String Query3 = "update out_item set number =number + " + number + " where id =" + item_id;
            String Query4 = "update clients set creditor =creditor - " + all_price + " where id =" + client_id;
            if (is_paid == 0) {
                st.execute(Query4);
            }

            String Query = "delete from sell_out_item  where id =" + id;
            st.execute(Query3);

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
