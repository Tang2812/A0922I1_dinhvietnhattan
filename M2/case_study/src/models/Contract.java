package models;

public class Contract {
    String maBooking;
    String soHopDong;
    Long tienCoc;
    Long tienThanhToan;
    String maKhachHang;

    public Contract(String maBooking, String soHopDong, Long tienCoc, Long tienThanhToan, String maKhachHang) {
        this.maBooking = maBooking;
        this.soHopDong = soHopDong;
        this.tienCoc = tienCoc;
        this.tienThanhToan = tienThanhToan;
        this.maKhachHang = maKhachHang;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public Long getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(Long tienCoc) {
        this.tienCoc = tienCoc;
    }

    public Long getTienThanhToan() {
        return tienThanhToan;
    }

    public void setTienThanhToan(Long tienThanhToan) {
        this.tienThanhToan = tienThanhToan;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
}
