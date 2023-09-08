package codegym.vn.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Integer id_khach_hang;
    private String ten_khach_hang;
    private String soDienThoai;
    private String gioiTinh;

    public KhachHang(Integer id_khach_hang, String ten_khach_hang, String soDienThoai, String gioiTinh) {
        this.id_khach_hang = id_khach_hang;
        this.ten_khach_hang = ten_khach_hang;
        this.soDienThoai = soDienThoai;
        this.gioiTinh = gioiTinh;
    }

    public KhachHang() {
    }

    public Integer getId_khach_hang() {
        return id_khach_hang;
    }

    public void setId_khach_hang(Integer id_khach_hang) {
        this.id_khach_hang = id_khach_hang;
    }

    public String getTen_khach_hang() {
        return ten_khach_hang;
    }

    public void setTen_khach_hang(String ten_khach_hang) {
        this.ten_khach_hang = ten_khach_hang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
