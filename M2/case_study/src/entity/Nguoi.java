package entity;

public abstract class Nguoi {
String hoVaTen;
String ngaySinh;
String gioiTinh;
String cMND;
String sDT;
String eMail;

    public Nguoi(String hoVaTen, String ngaySinh, String gioiTinh, String cMND, String sDT, String eMail) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
        this.sDT = sDT;
        this.eMail = eMail;
    }
}
