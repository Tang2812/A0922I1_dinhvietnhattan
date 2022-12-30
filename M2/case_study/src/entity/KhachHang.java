package entity;

import type.LoaiKhach;

public class KhachHang extends  Nguoi {
    String maKhachHang;
    LoaiKhach loaiKhachHang;
    String diaChi;

    public KhachHang(String hoVaTen, String ngaySinh, String gioiTinh, String cMND, String sDT, String eMail, String maKhachHang, LoaiKhach loaiKhachHang, String diaChi) {
        super(hoVaTen, ngaySinh, gioiTinh, cMND, sDT, eMail);
        this.maKhachHang = maKhachHang;
        this.loaiKhachHang = loaiKhachHang;
        this.diaChi = diaChi;
    }
}
