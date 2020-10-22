package model;

public class SalesM {

    private int id;
    private int bill_id;
    private String product_name;
    private String product_color;
    private String client_name;
    private double amount;
    private double gain;
    private double sell_price;
    private String created_at;
    private double all_price;
    private int is_paid = 1;
    private String note;
    private double creditor;
    private double debtor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_color() {
        return product_color;
    }

    public void setProduct_color(String product_color) {
        this.product_color = product_color;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getGain() {
        return gain;
    }

    public void setGain(double gain) {
        this.gain = gain;
    }

    public double getSell_price() {
        return sell_price;
    }

    public void setSell_price(double sell_price) {
        this.sell_price = sell_price;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public double getAll_price() {
        return all_price;
    }

    public void setAll_price(double all_price) {
        this.all_price = all_price;
    }

    public int getIs_paid() {
        return is_paid;
    }

    public void setIs_paid(int is_paid) {
        this.is_paid = is_paid;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getCreditor() {
        return creditor;
    }

    public void setCreditor(double creditor) {
        this.creditor = creditor;
    }

    public double getDebtor() {
        return debtor;
    }

    public void setDebtor(double debtor) {
        this.debtor = debtor;
    }

}
