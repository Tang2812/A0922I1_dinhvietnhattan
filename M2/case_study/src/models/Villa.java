package models;

import type.KieuThue;

public class Villa extends Facility {
String tieuChuanPhong;
float dienTichHoBoi;
int soTang;

    public Villa(String tieuChuanPhong,float dienTichHoBoi,int soTang,String tenDichVu, float dienTichSuDung, long chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong=tieuChuanPhong;
        this.dienTichHoBoi=dienTichHoBoi;
        this.soTang=soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public float getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(float dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }
}
