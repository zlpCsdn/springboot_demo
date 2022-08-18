package com.itcodai.course01.entity;


public class Tuser {
    private int id;
    private String username;
    private String password;
    private int roleid;

    public Tuser() {
    }
    public Tuser(int id, String username, String password, int roleid) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roleid = roleid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }
}
