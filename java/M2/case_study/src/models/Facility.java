package models;

import type.KieuThue;

public abstract class Facility {
    String tenDichVu;
    float dienTichSuDung;
    long chiPhiThue;
    int soLuongNguoiToiDa;
    KieuThue kieuThue;

    public Facility(String tenDichVu, float dienTichSuDung, long chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public float getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(float dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public long getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(long chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(int soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public KieuThue getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(KieuThue kieuThue) {
        this.kieuThue = kieuThue;
    }
}
