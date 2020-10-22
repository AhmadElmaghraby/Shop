/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ItemTwo;

/**
 *
 * @author elmaghraby
 */
public class InventoryTwoControll {

    Connection con;
    Statement st;

    public ItemTwo getProduct_id_in(int id) {
        ItemTwo p = new ItemTwo();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from in_item , in_item_two where in_item_two.in_item_id =  " + id + " and in_item_two.in_item_id = in_item.id";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                p.setName(res.getString("in_item.name"));
                p.setBuy_price(res.getDouble("in_item_two.buy_price"));
                p.setId(res.getInt("in_item_two.in_item_id"));
                p.setColor(res.getString("in_item.color"));
                p.setNumber(res.getString("in_item_two.number"));
                p.setCreated_at(res.getString("in_item_two.created_at"));

            }
            System.out.println(Query);
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return p;
    }

    public ItemTwo getProduct_id_out(int id) {
        ItemTwo p = new ItemTwo();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from out_item , out_item_two where out_item_two.out_item_id =  " + id + " and out_item_two.out_item_id = out_item.id";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                p.setName(res.getString("out_item.name"));
                p.setBuy_price(res.getDouble("out_item_two.buy_price"));
                p.setId(res.getInt("out_item_two.out_item_id"));
                p.setColor(res.getString("out_item.color"));
                p.setNumber(res.getString("out_item_two.number"));
                p.setCreated_at(res.getString("out_item_two.created_at"));

            }
            System.out.println(Query);
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return p;
    }

    //ملئ الجدول  ببيانات             
    public ArrayList<ItemTwo> getProducts_in() {
        ArrayList<ItemTwo> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from in_item , in_item_two where in_item_two.in_item_id = in_item.id";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                ItemTwo p = new ItemTwo();
                p.setName(res.getString("in_item.name"));
                p.setBuy_price(res.getDouble("in_item_two.buy_price"));
                p.setId(res.getInt("in_item_two.in_item_id"));
                p.setColor(res.getString("in_item.color"));
                p.setNumber(res.getString("in_item_two.number"));
                p.setCreated_at(res.getString("in_item_two.created_at"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return products;
    }
    //ملئ الجدول  ببيانات             

    public ArrayList<ItemTwo> getProducts_out() {
        ArrayList<ItemTwo> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from out_item , out_item_two where out_item_two.out_item_id = out_item.id";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                ItemTwo p = new ItemTwo();
                p.setName(res.getString("out_item.name"));
                p.setBuy_price(res.getDouble("out_item_two.buy_price"));
                p.setId(res.getInt("in_item_two.in_item_id"));
                p.setColor(res.getString("out_item.color"));
                p.setNumber(res.getString("out_item_two.number"));
                p.setCreated_at(res.getString("out_item_two.created_at"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return products;
    }

    //ملئ الجدول  ببيانات       (search  name)        
    public ArrayList<ItemTwo> getProductName_in(String name) {
        ArrayList<ItemTwo> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from in_item , in_item_two where in_item_two.in_item_id = in_item.id and in_item.name like '" + name + "%'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                ItemTwo p = new ItemTwo();
                p.setName(res.getString("in_item.name"));
                p.setBuy_price(res.getDouble("in_item_two.buy_price"));
                p.setId(res.getInt("in_item_two.in_item_id"));
                p.setColor(res.getString("in_item.color"));
                p.setNumber(res.getString("in_item_two.number"));
                p.setCreated_at(res.getString("in_item_two.created_at"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return products;
    }

    //ملئ الجدول  ببيانات       (search  name)        
    public ArrayList<ItemTwo> getProductName_out(String name) {
        ArrayList<ItemTwo> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from out_item , out_item_two where out_item_two.out_item_id = out_item.id and out_item.name like '" + name + "%'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                ItemTwo p = new ItemTwo();
                p.setName(res.getString("out_item.name"));
                p.setBuy_price(res.getDouble("out_item_two.buy_price"));
                p.setId(res.getInt("out_item_two.out_item_id"));
                p.setColor(res.getString("out_item.color"));
                p.setNumber(res.getString("out_item_two.number"));
                p.setCreated_at(res.getString("out_item_two.created_at"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return products;
    }

    //ملئ الجدول  ببيانات       (search  date)        
    public ArrayList<ItemTwo> getProductDate_in(String date1, String date2) {
        ArrayList<ItemTwo> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from in_item , in_item_two where in_item_two.in_item_id = in_item.id and in_item_two.created_at between '" + date1 + "' and '" + date2 + "'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                ItemTwo p = new ItemTwo();
                p.setName(res.getString("in_item.name"));
                p.setBuy_price(res.getDouble("in_item_two.buy_price"));
                p.setId(res.getInt("in_item_two.in_item_id"));
                p.setColor(res.getString("in_item.color"));
                p.setNumber(res.getString("in_item_two.number"));
                p.setCreated_at(res.getString("in_item_two.created_at"));
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

    public ArrayList<ItemTwo> getProductDate_out(String date1, String date2) {
        ArrayList<ItemTwo> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from out_item , out_item_two where out_item_two.out_item_id = out_item.id and out_item_two.created_at between '" + date1 + "' and '" + date2 + "'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                ItemTwo p = new ItemTwo();
                p.setName(res.getString("out_item.name"));
                p.setBuy_price(res.getDouble("out_item_two.buy_price"));
                p.setId(res.getInt("out_item_two.out_item_id"));
                p.setColor(res.getString("out_item.color"));
                p.setNumber(res.getString("out_item_two.number"));
                p.setCreated_at(res.getString("out_item_two.created_at"));

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

    // Add product
    public Boolean AddProduct_in(int in_item_id, String buy_price, String amount) {

        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "INSERT INTO in_item_two ( buy_price, number ,in_item_id )  VALUES "
                    + " ( " + buy_price + "," + amount + "," + in_item_id + " );";
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

    // Add product
    public Boolean AddProduct_out(int in_item_id, String buy_price, String amount) {

        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "INSERT INTO out_item_two ( buy_price, number ,out_item_id )  VALUES "
                    + " ( " + buy_price + "," + amount + "," + in_item_id + " );";
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

    // Update product
    public Boolean updateProduct_in(int id, String buy_price, String amount) {
        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "UPDATE in_item_two set buy_price ="
                    + buy_price
                    + " , number = " + amount
                    + " where in_item_id = " + id;
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

    // Update product
    public Boolean updateProduct_out(int id, String buy_price, String amount) {
        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "UPDATE out_item_two set buy_price ="
                    + buy_price
                    + " , number = " + amount
                    + " where out_item_id =" + id;
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
