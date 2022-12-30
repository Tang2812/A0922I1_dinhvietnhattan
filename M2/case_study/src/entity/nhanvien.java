package entity;

import type.TrinhDo;
import type.ViTri;

public class nhanvien extends Nguoi {
    TrinhDo trinhDo;
    ViTri viTri;
    long luong;

    public nhanvien(String hoVaTen, String ngaySinh, String gioiTinh, String cMND, String sDT, String eMail, TrinhDo trinhDo, ViTri viTri, long luong) {
        super(hoVaTen, ngaySinh, gioiTinh, cMND, sDT, eMail);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }
}
