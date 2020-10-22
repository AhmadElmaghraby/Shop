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
public class BillsM {

    private String name;
    private double paid;
    private double remainder;
    private double all;
    private int id;
    private int number;
    private int type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public double getRemainder() {
        return remainder;
    }

    public void setRemainder(double remainder) {
        this.remainder = remainder;
    }

    public double getAll() {
        return all;
    }

    public void setAll(double all) {
        this.all = all;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getClient_id_fk() {
        return client_id_fk;
    }

    public void setClient_id_fk(int client_id_fk) {
        this.client_id_fk = client_id_fk;
    }
    int client_id_fk;
}
