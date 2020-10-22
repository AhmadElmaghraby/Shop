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
public class Payment {

    private int id;
    private String clientName;
    private double payment;
    private String createdAt;
    private String Client_name;
    private double creditor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getClient_name() {
        return Client_name;
    }

    public void setClient_name(String Client_name) {
        this.Client_name = Client_name;
    }

    public double getCreditor() {
        return creditor;
    }

    public void setCreditor(double creditor) {
        this.creditor = creditor;
    }

}
