package model;

import services.BookingService;

import java.time.LocalDate;
import java.util.Scanner;

public class Booking implements BookingService {
    private String maBooking;
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;
    private String maKhachHang;
    private String tenDichVu;
    private String loaiDichVu;

    public Booking(String maBooking, LocalDate ngayBatDau, LocalDate ngayKetThuc, String maKhachHang, String tenDichVu, String loaiDichVu) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.tenDichVu = tenDichVu;
        this.loaiDichVu = loaiDichVu;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public LocalDate getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(LocalDate ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public LocalDate getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(LocalDate ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    @Override
    public String toString() {
        return this.maKhachHang+","+","+this.maBooking+this.ngayBatDau+","+this.ngayKetThuc+","+this.loaiDichVu+","+this.tenDichVu;
    }

    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao ma booking: ");
        this.maBooking=sc.nextLine();
        System.out.println("nhap vao ngay bat dau: ");
        this.ngayBatDau=LocalDate.parse(sc.nextLine());
        System.out.println("nhap vao ngay ket thuc: ");
        this.ngayKetThuc=LocalDate.parse(sc.nextLine());
        System.out.println("nhap vao ma khach hang: ");
        this.maKhachHang=sc.nextLine();
        System.out.println("nhap vao ten dich vu: ");
        this.tenDichVu=sc.nextLine();
        System.out.println("nhap vao loai dich vu: ");
    this.loaiDichVu=sc.nextLine();
    }
    public void xuat(){
        System.out.println(this.toString());
    }
}
