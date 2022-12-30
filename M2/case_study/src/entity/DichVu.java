package entity;

import type.KieuThue;

public abstract class DichVu {
    String tenDichVu;
    float dienTichSuDung;
    long chiPhiThue;
    int soLuongNguoiToiDa;
    KieuThue kieuThue;

    public DichVu(String tenDichVu, float dienTichSuDung, long chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }
}
