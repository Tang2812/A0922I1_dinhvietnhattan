package models;

import type.TrinhDo;
import type.ViTri;

public class Employee extends Person {
    TrinhDo trinhDo;
    ViTri viTri;
    long luong;

    public Employee(String hoVaTen, String ngaySinh, String gioiTinh, String cMND, String sDT, String eMail, TrinhDo trinhDo, ViTri viTri, long luong) {
        super(hoVaTen, ngaySinh, gioiTinh, cMND, sDT, eMail);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public TrinhDo getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(TrinhDo trinhDo) {
        this.trinhDo = trinhDo;
    }

    public ViTri getViTri() {
        return viTri;
    }

    public void setViTri(ViTri viTri) {
        this.viTri = viTri;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }
}
