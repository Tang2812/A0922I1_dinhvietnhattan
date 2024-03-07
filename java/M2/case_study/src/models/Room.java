package models;

import type.KieuThue;

public class Room extends Facility {
    String dichVuMienPhi;

    public Room(String tenDichVu, float dienTichSuDung, long chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue,String dichVuMienPhi) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuMienPhi=dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }
}
