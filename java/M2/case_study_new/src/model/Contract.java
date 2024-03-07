package model;

import services.ContactService;

import java.util.Scanner;

public class Contract implements ContactService {
    private  String soHopDong;
    private String maBoking;
    private int soTienCoc;
    private int tongTien;
    private String maKhachHang;

    public Contract(String soHopDong, String maBoking, int soTienCoc, int tongTien, String maKhachHang) {
        this.soHopDong = soHopDong;
        this.maBoking = maBoking;
        this.soTienCoc = soTienCoc;
        this.tongTien = tongTien;
        this.maKhachHang = maKhachHang;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getMaBoking() {
        return maBoking;
    }

    public void setMaBoking(String maBoking) {
        this.maBoking = maBoking;
    }

    public int getSoTienCoc() {
        return soTienCoc;
    }

    public void setSoTienCoc(int soTienCoc) {
        this.soTienCoc = soTienCoc;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public String toString(){
        return this.soHopDong+","+this.maBoking+","+this.maKhachHang+","+this.soTienCoc+","+this.tongTien;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao so hop dong: ");
        this.soHopDong=sc.nextLine();
        System.out.println("nhap vao ma booking: ");
        this.maBoking=sc.nextLine();
        System.out.println("nhap vao ma khach hang: ");
        this.maKhachHang=sc.nextLine();
        System.out.println("nhap vao so tien dat truoc: ");
        this.soTienCoc=Integer.parseInt(sc.nextLine());
        System.out.println("nhap vao tong tien: ");
        this.tongTien=Integer.parseInt(sc.nextLine());
    }
    public void edit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao ma booking: ");
        this.maBoking=sc.nextLine();
        System.out.println("nhap vao ma khach hang: ");
        this.maKhachHang=sc.nextLine();
        System.out.println("nhap vao so tien dat truoc: ");
        this.soTienCoc=Integer.parseInt(sc.nextLine());
        System.out.println("nhap vao tong tien: ");
        this.tongTien=Integer.parseInt(sc.nextLine());
    }
    public void xuat(){
        System.out.println(this.toString());
    }
}
