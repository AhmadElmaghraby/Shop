/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author elmaghraby
 */
public class ClientsM {

    private int id;
    private String name;
    private double creditor;
    private double debtor;
    private String address;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
