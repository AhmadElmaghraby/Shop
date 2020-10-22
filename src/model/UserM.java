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
public class UserM {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean getIs_Admin() {
        return is_Admin;
    }

    public void setIs_Admin(boolean is_Admin) {
        this.is_Admin = is_Admin;
    }
    
    private String username;
    private boolean is_Admin;
    private String created_at;

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    
}
