package com.example.sheredpreferece;
public class Thucdon {
    private String tenmon;
    private String gia;
    private int hinh;

    public Thucdon(String tenmon, String gia, int hinh) {
        this.tenmon = tenmon;
        this.gia = gia;
        this.hinh = hinh;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
