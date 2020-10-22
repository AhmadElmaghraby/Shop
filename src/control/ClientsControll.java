package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ClientsM;
import model.Payment;
import model.SalesM;

/**
 *
 * @author elmaghraby
 */
public class ClientsControll {

    Connection con;
    Statement st;

    // full table by date
    public ArrayList<ClientsM> getClientsByDate(String date1, String date2) {
        ArrayList<ClientsM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from clients where created_at between '" + date1 + "' and '" + date2 + "'";
            System.out.println(Query);
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                ClientsM p = new ClientsM();
                p.setName(res.getString("name"));
                p.setId(res.getInt("id"));
                p.setCreditor(res.getDouble("creditor"));
                p.setDebtor(res.getDouble("debtor"));
                p.setAddress(res.getString("address"));
                p.setPhone(res.getString("phone"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return products;
    }

    // full table with name of clients
    public ArrayList<ClientsM> getClients() {
        ArrayList<ClientsM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from clients  ";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                ClientsM p = new ClientsM();
                p.setName(res.getString("name"));
                p.setId(res.getInt("id"));
                p.setCreditor(res.getDouble("creditor"));
                p.setDebtor(res.getDouble("debtor"));
                p.setAddress(res.getString("address"));
                p.setPhone(res.getString("phone"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return products;
    }

// full combobox with name of clients
    public ArrayList<ClientsM> getClients_name(String name) {
        ArrayList<ClientsM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from clients  where name like '" + name + "%'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                ClientsM p = new ClientsM();
                p.setName(res.getString("name"));
                p.setId(res.getInt("id"));
                p.setCreditor(res.getDouble("creditor"));
                p.setDebtor(res.getDouble("debtor"));
                p.setAddress(res.getString("address"));
                p.setPhone(res.getString("phone"));
                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return products;
    }

    public ClientsM getselectedClient(String name) {
        ClientsM p = null;

        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "select  * from clients where name = '" + name + "'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                p = new ClientsM();
                p.setName(res.getString("name"));
                p.setId(res.getInt("id"));
                p.setCreditor(res.getDouble("creditor"));
                p.setDebtor(res.getDouble("debtor"));
                p.setAddress(res.getString("address"));
                p.setPhone(res.getString("phone"));
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return p;
    }

    // Add Client     id, name, creditor, debtor, address, phone
    public Boolean AddClient(String name, String creditor, String debtor, String address, String phone) {

        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "INSERT INTO clients (name, creditor, debtor, address, phone )  VALUES "
                    + " ( '" + name + "'," + creditor + "," + debtor + ",'" + address + "','" + phone + "' );";

            st.execute(Query);
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            b = false;
        }
        return b;
    }

    // Update Client
    public Boolean updateClients(int id, String name, String creditor, String debtor, String address, String phone) {
        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "UPDATE Clients set name = '" + name
                    + "' , creditor = " + creditor
                    + " , debtor = " + debtor
                    + " , address = '" + address
                    + "' , phone = '" + phone
                    + "' where id =" + id;
            st.execute(Query);
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            b = false;
        }
        return b;
    }

    // D clients
    public Boolean deleteClients(int id) {
        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "delete from clients  where id =" + id;
            st.execute(Query);
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            b = false;
        }
        return b;
    }

    //كشف حساب عميل
    public ArrayList<SalesM> checkClientSell_in(int id) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM sell_in_item , in_item ,clients "
                    + "where( sell_in_item.in_item_id = in_item.id and sell_in_item.client_id = " + id + "  and clients.id = " + id + " and sell_in_item.is_paid=0 )"
                    + " order by sell_in_item.created_at";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("sell_in_item.id"));
                p.setAmount(res.getInt("sell_in_item.number"));
                p.setGain(res.getDouble("sell_in_item.gain"));
                p.setProduct_name(res.getString("in_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("sell_in_item.all_price"));
                p.setCreated_at(res.getString("sell_in_item.created_at"));
                p.setSell_price(res.getDouble("sell_in_item.sell_price"));
                p.setNote(res.getString("sell_in_item.note"));
                p.setBill_id(res.getInt("sell_in_item.bill"));
                p.setCreditor(res.getDouble("clients.creditor"));
                p.setDebtor(res.getDouble("clients.debtor"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return products;
    }

    //كشف حساب عميل
    public ArrayList<SalesM> checkClientSell_out(int id) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM sell_out_item , out_item ,clients "
                    + "where( sell_out_item.out_item_id = out_item.id and sell_out_item.client_id = " + id + "  and clients.id = " + id + " and sell_out_item.is_paid=0 )"
                    + " order by sell_out_item.created_at";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("sell_out_item.id"));
                p.setAmount(res.getInt("sell_out_item.number"));
                p.setGain(res.getDouble("sell_out_item.gain"));
                p.setProduct_name(res.getString("out_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("sell_out_item.all_price"));
                p.setCreated_at(res.getString("sell_out_item.created_at"));
                p.setSell_price(res.getDouble("sell_out_item.sell_price"));
                p.setNote(res.getString("sell_out_item.note"));
                p.setBill_id(res.getInt("sell_out_item.bill"));
                p.setCreditor(res.getDouble("clients.creditor"));
                p.setDebtor(res.getDouble("clients.debtor"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return products;
    }

    ////////////////////////////////////////////////////////////
    //كشف حساب عميل
    public ArrayList<SalesM> checkClientBuy_in(int id) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM buy_in_item , in_item ,clients "
                    + "where( buy_in_item.in_item_id = in_item.id and buy_in_item.client_id = " + id + "  and clients.id = " + id + " and buy_in_item.is_paid=0 )"
                    + " order by buy_in_item.created_at";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("buy_in_item.id"));
                p.setAmount(res.getInt("buy_in_item.number"));
                p.setProduct_name(res.getString("in_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("buy_in_item.all_price"));
                p.setCreated_at(res.getString("buy_in_item.created_at"));
                p.setCreditor(res.getDouble("clients.creditor"));
                p.setDebtor(res.getDouble("clients.debtor"));
                p.setSell_price(res.getDouble("buy_in_item.buy_price"));
                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return products;
    }

    //كشف حساب عميل
    public ArrayList<SalesM> checkClientBuy_out(int id) {
        ArrayList<SalesM> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM buy_out_item , out_item ,clients "
                    + "where( buy_out_item.out_item_id = out_item.id and buy_out_item.client_id = " + id + "  and clients.id = " + id + " and buy_out_item.is_paid=0 )"
                    + " order by buy_out_item.created_at";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                SalesM p = new SalesM();
                p.setId(res.getInt("buy_out_item.id"));
                p.setAmount(res.getInt("buy_out_item.number"));
                p.setProduct_name(res.getString("out_item.name"));
                p.setClient_name(res.getString("clients.name"));
                p.setAll_price(res.getDouble("buy_out_item.all_price"));
                p.setCreated_at(res.getString("buy_out_item.created_at"));
                p.setCreditor(res.getDouble("clients.creditor"));
                p.setDebtor(res.getDouble("clients.debtor"));
                p.setSell_price(res.getDouble("buy_out_item.buy_price"));
                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return products;
    }

    /////////////////////////////
    public ArrayList<Payment> getPayments() {
        ArrayList<Payment> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM payment,clients where payment.client_id=clients.id ";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                Payment p = new Payment();

                p.setId(res.getInt("payment.id"));
                p.setClientName(res.getString("clients.name"));
                p.setPayment(res.getDouble("payment.money"));
                p.setCreatedAt(res.getString("payment.created_at"));

                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return products;
    }

    public ArrayList<Payment> getClientPayments(int id) {
        ArrayList<Payment> products = new ArrayList<>();
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "SELECT * FROM payment,clients where payment.client_id=clients.id and payment.client_id = " + id;
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                Payment p = new Payment();
                p.setId(res.getInt("payment.id"));
                p.setClientName(res.getString("clients.name"));
                p.setPayment(res.getDouble("payment.money"));
                p.setCreatedAt(res.getString("payment.created_at"));
                products.add(p);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return products;
    }

    public Boolean addPayment(int client_id, String money) {

        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query = "INSERT INTO payment ( client_id , money )  VALUES "
                    + " ( " + client_id + "," + money + " );";
            String Query3 = "UPDATE clients set creditor = creditor - " + money + " where id = " + client_id;
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

    public Boolean closeAccount(int client_id) {

        Boolean b = true;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            String Query5 = "UPDATE buy_in_item set is_paid =  1   where client_id = " + client_id;
            String Query4 = "UPDATE buy_out_item set is_paid =  1   where client_id = " + client_id;

            String Query3 = "UPDATE clients set creditor =  0 , debtor =0  where id = " + client_id;
            String Query1 = "UPDATE sell_in_item set is_paid =  1   where client_id = " + client_id;
            String Query2 = "UPDATE sell_out_item set is_paid =  1   where client_id = " + client_id;
            String Query0 = "delete from payment  where client_id = " + client_id;
            st.execute(Query0);
            st.execute(Query1);
            st.execute(Query2);
            st.execute(Query3);
            st.execute(Query4);
            st.execute(Query5);

            st.close();
            con.close();
            System.out.println("done");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error : " + ex.getMessage());
            b = false;
        }
        return b;
    }

}
