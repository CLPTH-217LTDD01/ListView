package com.example.pavilion.linh;

/**
 * Created by PAVILION on 3/6/2018.
 */

public class Traicay {
    private String ten;
    private int hinh;

    public Traicay(String ten, int hinh) {
        this.ten = ten;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public int getHinh() {
        return hinh;

    }
}
