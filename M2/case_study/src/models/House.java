package models;

import type.KieuThue;

public class House extends Facility{
    int soTang;
    String tieuChuanPhong;

    public House(String tenDichVu, float dienTichSuDung, long chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue, int soTang, String tieuChuanPhong) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.soTang = soTang;
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }
}
