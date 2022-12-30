package entity;

import type.KieuThue;

public class Villa extends DichVu{
String tieuChuanPhong;
float dienTichHoBoi;
int soTang;

    public Villa(String tieuChuanPhong,float dienTichHoBoi,int soTang,String tenDichVu, float dienTichSuDung, long chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong=tieuChuanPhong;
        this.dienTichHoBoi=dienTichHoBoi;
        this.soTang=soTang;
    }
}
