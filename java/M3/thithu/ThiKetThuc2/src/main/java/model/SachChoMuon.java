package model;

public class SachChoMuon {
    private int maMuonSach;
    private String tenSach;
    private String tacGia;
    private  String hoTen;
    private String lop;
    private String ngayMuon;
    private String ngayTra;

    public SachChoMuon(String tenSach, String tacGia, String hoTen, String lop, String ngayMuon, String ngayTra) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
    }

    public SachChoMuon() {
    }

    public SachChoMuon(int maMuonSach, String tenSach, String tacGia, String hoTen, String lop, String ngayMuon, String ngayTra) {
        this.maMuonSach = maMuonSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
    }

    public int getMaMuonSach() {
        return maMuonSach;
    }

    public void setMaMuonSach(int maMuonSach) {
        this.maMuonSach = maMuonSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }
}
