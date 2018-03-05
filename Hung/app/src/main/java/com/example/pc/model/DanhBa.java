package com.example.pc.model;

import java.io.Serializable;

/**
 * Created by PC on 3/5/2018.
 */

public class DanhBa implements Serializable{
    private int ma;
    private String ten;
    private String phone;

    public DanhBa() {
    }

    public DanhBa(int ma, String ten, String phone) {
        this.ma = ma;
        this.ten = ten;
        this.phone = phone;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
