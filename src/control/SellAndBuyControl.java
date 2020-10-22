package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.*;

/**
 *
 * @author elmaghraby
 */
public class SellAndBuyControl {

    Connection con;
    Statement st;

    public int getBillNumber() {
        int bill = 0;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from bill";
            String Query1 = "update bill set bill=bill+1";
            ResultSet res = st.executeQuery(Query);

            while (res.next()) {
                bill = res.getInt("bill");
            }
            st.execute(Query1);

            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return bill;
    }

    //combo box data in_item       (search)        
    public ArrayList<Item> getsearchProductIn(String name) {
        ArrayList<Item> items = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from in_item where name like '" + name + "%'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                Item p = new Item();
                p.setId(res.getInt("id"));
                p.setName(res.getString("name"));
                p.setSell_price(res.getDouble("sell_price"));
                p.setBuy_price(res.getDouble("buy_price"));
                p.setSell_big_price(res.getDouble("sell_big_price"));
                p.setNumber(res.getInt("number"));
                p.setColor(res.getString("color"));
                items.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return items;
    }

    //combo box data out_item       (search)        
    public ArrayList<Item> getsearchProductOut(String name) {
        ArrayList<Item> items = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from out_item where name like '" + name + "%'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                Item p = new Item();
                p.setId(res.getInt("id"));
                p.setName(res.getString("name"));
                p.setSell_price(res.getDouble("sell_price"));
                p.setBuy_price(res.getDouble("buy_price"));
                p.setSell_big_price(res.getDouble("sell_big_price"));
                p.setNumber(res.getInt("number"));
                p.setColor(res.getString("color"));

                items.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return items;
    }

    // get selected row
    public Item getselectedProductIn(String name, String color) {
        Item p = null;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from in_item where name = '" + name + "' and color = '" + color + "'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                p = new Item();
                p.setName(res.getString("name"));
                p.setSell_price(res.getDouble("sell_price"));
                p.setBuy_price(res.getDouble("buy_price"));
                p.setSell_big_price(res.getDouble("sell_big_price"));
                p.setNumber(res.getInt("number"));
                p.setId(res.getInt("id"));
                p.setColor(res.getString("color"));
                p.setMin(res.getDouble("min"));

            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return p;
    }

    public Item getselectedProductIn(int id) {
        Item p = null;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from in_item where id = " + id;
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                p = new Item();
                p.setName(res.getString("name"));
                p.setSell_price(res.getDouble("sell_price"));
                p.setBuy_price(res.getDouble("buy_price"));
                p.setSell_big_price(res.getDouble("sell_big_price"));
                p.setNumber(res.getInt("number"));
                p.setId(res.getInt("id"));
                p.setColor(res.getString("color"));
                p.setMin(res.getInt("min"));

            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return p;
    }

    public Item getselectedProductOut(String name, String color) {
        Item p = null;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from out_item where name = '" + name + "' and color = '" + color + "'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                p = new Item();
                p.setName(res.getString("name"));
                p.setSell_price(res.getDouble("sell_price"));
                p.setBuy_price(res.getDouble("buy_price"));
                p.setSell_big_price(res.getDouble("sell_big_price"));
                p.setNumber(res.getInt("number"));
                p.setId(res.getInt("id"));
                p.setColor(res.getString("color"));
                System.out.println(Query);
                p.setMin(res.getDouble("min"));

            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return p;
    }

    public Item getselectedProductOut(int id) {
        Item p = null;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from out_item where id = " + id;
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                p = new Item();
                p.setName(res.getString("name"));
                p.setSell_price(res.getDouble("sell_price"));
                p.setBuy_price(res.getDouble("buy_price"));
                p.setSell_big_price(res.getDouble("sell_big_price"));
                p.setNumber(res.getInt("number"));
                p.setId(res.getInt("id"));
                p.setColor(res.getString("color"));
                p.setMin(res.getDouble("min"));
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return p;
    }

    // sell     id, bill_id_fk, product_id_fk, client_id_fk, amount, gain, uploaded_at, created_at, sell_price
    public Boolean sell_product_in(String name, String sell_price,
            String amount, String product_id,
            double gain, String updated_amount, String allprice, int client_id, int is_paid, String bill, String note) {
        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();

            String Query2 = "UPDATE in_item set number = " + updated_amount + " where id = " + product_id;
            String Query = "INSERT INTO sell_in_item ( in_item_id , number , sell_price , gain , all_price,client_id,is_paid ,bill ,note ) VALUES ( "
                    + product_id + " , "
                    + amount + " , "
                    + sell_price + " , "
                    + gain + " ,"
                    + allprice + ","
                    + client_id + ","
                    + is_paid + ","
                    + bill + ",'"
                    + note + "')";
            if (gain >= 0) {
                st.execute(Query2);
                st.execute(Query);
                if (is_paid == 0) {
                    String Query3 = "UPDATE clients set creditor = creditor+" + allprice + " where id = " + client_id;
                    st.execute(Query3);
                }
                st.close();
                con.close();
            } else {
                JOptionPane.showMessageDialog(null, "لا يوجد مكسب");
                b = false;
            }

        } catch (SQLException ex) {
            System.out.println("error :sell_product_in :  " + ex.getMessage());
            b = false;
        }
        return b;
    }

    public Boolean sell_product_out(String name, String sell_price,
            String amount, String product_id,
            double gain, String updated_amount, String allprice, int client_id, int is_paid, String bill, String note) {
        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();

            String Query2 = "UPDATE out_item set number = " + updated_amount + " where id = " + product_id;
            String Query = "INSERT INTO sell_out_item ( out_item_id , number , sell_price , gain , all_price , client_id,is_paid,bill ,note) VALUES ( "
                    + product_id + " , "
                    + amount + " , "
                    + sell_price + " , "
                    + gain + " ,"
                    + allprice + ","
                    + client_id + ","
                    + is_paid + ","
                    + bill + ",'"
                    + note + "')";

            if (gain >= 0) {
                st.execute(Query2);
                st.execute(Query);
                if (is_paid == 0) {
                    String Query3 = "UPDATE clients set creditor = creditor+" + allprice + " where id = " + client_id;
                    st.execute(Query3);
                }
                st.close();
                con.close();
            } else {
                JOptionPane.showMessageDialog(null, "لا يوجد مكسب");
                b = false;
            }
        } catch (SQLException ex) {
            System.out.println("error :sell_product_out :  " + ex.getMessage());
            b = false;
        }
        return b;
    }

    // buy product  id, number, paid, remainder, all, type, client_id_fk, name
    public Boolean buy_product_in(String name, String price,
            String allprice,
            String amount, String product_id,
            String updated_amount, int client_id, int is_paid) {
        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();

            String Query2 = "UPDATE in_item set  buy_price= " + price + ", number= " + updated_amount + " where id = " + product_id;
            String Query = "INSERT INTO buy_in_item ( in_item_id , number , buy_price , all_price , client_id , is_paid ) VALUES ( "
                    + product_id + " , "
                    + amount + " , "
                    + price + " , "
                    + allprice + " , "
                    + client_id + " , "
                    + is_paid + ")";

            st.execute(Query2);
            st.execute(Query);

            if (is_paid == 0) {
                String Query3 = "UPDATE clients set debtor = debtor+" + allprice + " where id = " + client_id;
                st.execute(Query3);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            b = false;
        }
        return b;
    }

    // buy product  id, number, paid, remainder, all, type, client_id_fk, name
    public Boolean buy_product_out(String name, String price,
            String allprice,
            String amount, String product_id,
            String updated_amount, int client_id, int is_paid) {
        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();

            String Query2 = "UPDATE out_item set buy_price= " + price + ", number= " + updated_amount + " where id = " + product_id;
            String Query = "INSERT INTO buy_out_item ( out_item_id , number , buy_price , all_price , client_id , is_paid ) VALUES ( "
                    + product_id + " , "
                    + amount + " , "
                    + price + " , "
                    + allprice + " , "
                    + client_id + " , "
                    + is_paid + ")";
            st.execute(Query2);

            st.execute(Query);
            if (client_id == 0) {
                String Query3 = "UPDATE clients set debtor = debtor+" + allprice + " where id = " + client_id;
                st.execute(Query3);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            b = false;
        }
        return b;
    }

}
