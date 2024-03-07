package models;

import type.LoaiKhach;

public class Customer extends Person {
    String maKhachHang;
    LoaiKhach loaiKhachHang;
    String diaChi;

    public Customer(String hoVaTen, String ngaySinh, String gioiTinh, String cMND, String sDT, String eMail, String maKhachHang, LoaiKhach loaiKhachHang, String diaChi) {
        super(hoVaTen, ngaySinh, gioiTinh, cMND, sDT, eMail);
        this.maKhachHang = maKhachHang;
        this.loaiKhachHang = loaiKhachHang;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public LoaiKhach getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(LoaiKhach loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
