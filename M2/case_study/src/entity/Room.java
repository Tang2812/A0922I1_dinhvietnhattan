package entity;

import type.KieuThue;

public class Room extends DichVu{
    String dichVuMienPhi;

    public Room(String tenDichVu, float dienTichSuDung, long chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue,String dichVuMienPhi) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuMienPhi=dichVuMienPhi;
    }
}
