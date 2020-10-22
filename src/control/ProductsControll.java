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
import model.Item;

/**
 *
 * @author elmaghraby
 */
public class ProductsControll {

    Connection con;
    Statement st;

    //ملئ الجدول  ببيانات             
    public ArrayList<Item> getProductsMin_in() {
        ArrayList<Item> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from in_item where number < min ";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                Item p = new Item();
                p.setName(res.getString("name"));
                p.setSell_price(res.getDouble("sell_price"));
                p.setBuy_price(res.getDouble("buy_price"));
                p.setSell_big_price(res.getDouble("sell_big_price"));
                p.setNumber(res.getInt("number"));
                p.setId(res.getInt("id"));
                p.setColor(res.getString("color"));
                p.setMin(res.getDouble("min"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error : " + ex.getMessage());
        }
        return products;
    }

    public ArrayList<Item> getProductsMin_out() {
        ArrayList<Item> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from out_item where number < min ";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                Item p = new Item();
                p.setName(res.getString("name"));
                p.setSell_price(res.getDouble("sell_price"));
                p.setBuy_price(res.getDouble("buy_price"));
                p.setSell_big_price(res.getDouble("sell_big_price"));
                p.setNumber(res.getInt("number"));
                p.setId(res.getInt("id"));
                p.setColor(res.getString("color"));
                p.setMin(res.getDouble("min"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error : " + ex.getMessage());
        }
        return products;
    }

    //ملئ الجدول  ببيانات             
    public ArrayList<Item> getProducts_in() {
        ArrayList<Item> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from in_item ";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                Item p = new Item();
                p.setName(res.getString("name"));
                p.setSell_price(res.getDouble("sell_price"));
                p.setBuy_price(res.getDouble("buy_price"));
                p.setSell_big_price(res.getDouble("sell_big_price"));
                p.setNumber(res.getInt("number"));
                p.setId(res.getInt("id"));
                p.setColor(res.getString("color"));
                p.setMin(res.getDouble("min"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error : " + ex.getMessage());
        }
        return products;
    }
    //ملئ الجدول  ببيانات             

    public ArrayList<Item> getProducts_out() {
        ArrayList<Item> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from out_item ";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                Item p = new Item();
                p.setName(res.getString("name"));
                p.setSell_price(res.getDouble("sell_price"));
                p.setBuy_price(res.getDouble("buy_price"));
                p.setSell_big_price(res.getDouble("sell_big_price"));
                p.setNumber(res.getInt("number"));
                p.setId(res.getInt("id"));
                p.setColor(res.getString("color"));
                p.setMin(res.getDouble("min"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error : " + ex.getMessage());
        }
        return products;
    }

    //get colors by name
    public ArrayList<Item> getColorProducts_in(String name) {
        ArrayList<Item> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from in_item where name = '" + name + "'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                Item p = new Item();
                p.setName(res.getString("name"));
                p.setSell_price(res.getDouble("sell_price"));
                p.setBuy_price(res.getDouble("buy_price"));
                p.setSell_big_price(res.getDouble("sell_big_price"));
                p.setNumber(res.getInt("number"));
                p.setId(res.getInt("id"));
                p.setColor(res.getString("color"));
                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error : " + ex.getMessage());
        }
        return products;
    }

    //ملئ الجدول  ببيانات       (search  name)        
    public ArrayList<Item> getProductName_in(String name) {
        ArrayList<Item> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from in_item where name like '" + name + "%'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                Item p = new Item();
                p.setName(res.getString("name"));
                p.setSell_price(res.getDouble("sell_price"));
                p.setBuy_price(res.getDouble("buy_price"));
                p.setSell_big_price(res.getDouble("sell_big_price"));
                p.setNumber(res.getInt("number"));
                p.setId(res.getInt("id"));
                p.setColor(res.getString("color"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error : " + ex.getMessage());
        }
        return products;
    }

    //ملئ الجدول  ببيانات       (search  name)        
    public ArrayList<Item> getProductName_out(String name) {
        ArrayList<Item> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from out_item where name like '" + name + "%'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                Item p = new Item();
                p.setName(res.getString("name"));
                p.setSell_price(res.getDouble("sell_price"));
                p.setBuy_price(res.getDouble("buy_price"));
                p.setSell_big_price(res.getDouble("sell_big_price"));
                p.setNumber(res.getInt("number"));
                p.setId(res.getInt("id"));
                p.setColor(res.getString("color"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error : " + ex.getMessage());
        }
        return products;
    }

    //ملئ الجدول  ببيانات       (search  date)        
    public ArrayList<Item> getProductDate_in(String date1, String date2) {
        ArrayList<Item> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM shop.in_item p where created_at between '" + date1 + "' and '" + date2 + "'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                Item p = new Item();
                p.setName(res.getString("name"));
                p.setSell_price(res.getDouble("sell_price"));
                p.setBuy_price(res.getDouble("buy_price"));
                p.setSell_big_price(res.getDouble("sell_big_price"));
                p.setNumber(res.getInt("number"));
                p.setId(res.getInt("id"));
                p.setColor(res.getString("color"));

                products.add(p);
            }
            st.close();
            con.close();
            System.out.println(Query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error : " + ex.getMessage());
        }

        return products;
    }

    public ArrayList<Item> getProductDate_out(String date1, String date2) {
        ArrayList<Item> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM shop.out_item p where created_at between '" + date1 + "' and '" + date2 + "'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                Item p = new Item();
                p.setName(res.getString("name"));
                p.setSell_price(res.getDouble("sell_price"));
                p.setBuy_price(res.getDouble("buy_price"));
                p.setSell_big_price(res.getDouble("sell_big_price"));
                p.setNumber(res.getInt("number"));
                p.setId(res.getInt("id"));
                p.setColor(res.getString("color"));

                products.add(p);
            }
            st.close();
            con.close();
            System.out.println(Query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error : " + ex.getMessage());
        }

        return products;
    }

    // Add product
    public Boolean AddProduct_in(String name, String buy_price, String sell_price, String sell_price_g, String amount, String color, String min) {

        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "INSERT INTO in_item (name, buy_price, sell_price, sell_big_price, number ,color ,min )  VALUES "
                    + " ( '" + name + "'," + buy_price + "," + sell_price + "," + sell_price_g + "," + amount + ",'" + color + "'," + min + " );";
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
    public Boolean AddProduct_out(String name, String buy_price, String sell_price, String sell_price_g, String amount, String color, String min) {

        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "INSERT INTO out_item (name, buy_price, sell_price, sell_big_price, number,color,min )  VALUES "
                    + " ( '" + name + "'," + buy_price + "," + sell_price + "," + sell_price_g + "," + amount + ",'" + color + "'," + min + " );";
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
    public Boolean updateProduct_in(int id, String name, String buy_price, String sell_price, String sell_price_g, String amount, String color, String min) {
        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "UPDATE in_item set name = '" + name
                    + "' , buy_price = " + buy_price
                    + " , sell_price = " + sell_price
                    + " , sell_big_price = " + sell_price_g
                    + " , number = " + amount
                    + " , color ='" + color
                    + "', min = " + min
                    + "  where id =" + id;
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
    public Boolean updateProduct_out(int id, String name, String buy_price, String sell_price, String sell_price_g, String amount, String color, String min) {
        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "UPDATE out_item set name = '" + name
                    + "' , buy_price = " + buy_price
                    + " , sell_price = " + sell_price
                    + " , sell_big_price = " + sell_price_g
                    + " , number = " + amount
                    + " , color ='" + color
                    + "', min = " + min
                    + " where id = " + id;
            st.execute(Query);
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error : " + ex.getMessage());
            b = false;
        }
        return b;
    }

    // D product
    public Boolean deleteProduct_in(int id) {
        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "delete from in_item  where id =" + id;
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

    public Boolean deleteProduct_out(int id) {
        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "delete from out_item  where id =" + id;
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

    //تالف
    public Boolean corrpet_Product_in(int id, double money, String note, int number) {
        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "update in_item set number=number-" + number + " where id = " + id;
            String Query2 = "INSERT INTO corrupts_in (in_item_id, note, money )  VALUES ("
                    + id + ",'" + note + "'," + money + ")";
            st.execute(Query2);
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

    //تالف
    public Boolean corrpet_Product_out(int id, double money, String note, int number) {
        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "update out_item set number=number-" + number + " where id = " + id;
            String Query2 = "INSERT INTO corrupt_out (out_item_id, note, money )  VALUES ("
                    + id + ",'" + note + "'," + money + ")";
            st.execute(Query2);
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
