package model;

public class HoKhau {
    private int id;
    private  String maHoKhau;
    private String tenChuHo;
    private int soLuongThanhVien;
    private String ngayLapHoKhau;
    private String diaChiNha;

    public HoKhau() {
    }

    public HoKhau(String maHoKhau, String tenChuHo, int soLuongThanhVien, String ngayLapHoKhau, String diaChiNha) {
        this.maHoKhau = maHoKhau;
        this.tenChuHo = tenChuHo;
        this.soLuongThanhVien = soLuongThanhVien;
        this.ngayLapHoKhau = ngayLapHoKhau;
        this.diaChiNha = diaChiNha;
    }

    public HoKhau(int id, String maHoKhau, String tenChuHo, int soLuongThanhVien, String ngayLapHoKhau, String diaChiNha) {
        this.id = id;
        this.maHoKhau = maHoKhau;
        this.tenChuHo = tenChuHo;
        this.soLuongThanhVien = soLuongThanhVien;
        this.ngayLapHoKhau = ngayLapHoKhau;
        this.diaChiNha = diaChiNha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaHoKhau() {
        return maHoKhau;
    }

    public void setMaHoKhau(String maHoKhau) {
        this.maHoKhau = maHoKhau;
    }

    public String getTenChuHo() {
        return tenChuHo;
    }

    public void setTenChuHo(String tenChuHo) {
        this.tenChuHo = tenChuHo;
    }

    public int getSoLuongThanhVien() {
        return soLuongThanhVien;
    }

    public void setSoLuongThanhVien(int soLuongThanhVien) {
        this.soLuongThanhVien = soLuongThanhVien;
    }

    public String getNgayLapHoKhau() {
        return ngayLapHoKhau;
    }

    public void setNgayLapHoKhau(String ngayLapHoKhau) {
        this.ngayLapHoKhau = ngayLapHoKhau;
    }

    public String getDiaChiNha() {
        return diaChiNha;
    }

    public void setDiaChiNha(String diaChiNha) {
        this.diaChiNha = diaChiNha;
    }
}
