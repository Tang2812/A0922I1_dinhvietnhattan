package Danh_ba;

import java.util.Scanner;

public class Danh_ba {
    private String soDienThoai;
    private String nhomCuaDanhBa;
    private String hoTen;
    private String gioiTinh;
    private String diaChi;
    private String ngaySinh;
    private String email;

    public Danh_ba(String soDienThoai, String nhomCuaDanhBa, String hoTen, String gioiTinh, String diaChi, String ngaySinh, String email) {
        this.soDienThoai = soDienThoai;
        this.nhomCuaDanhBa = nhomCuaDanhBa;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public Danh_ba() {
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNhomCuaDanhBa() {
        return nhomCuaDanhBa;
    }

    public void setNhomCuaDanhBa(String nhomCuaDanhBa) {
        this.nhomCuaDanhBa = nhomCuaDanhBa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Danh_ba(String[] arr) {
        this.soDienThoai = arr[0];
        this.nhomCuaDanhBa =  arr[1];
        this.hoTen =  arr[2];
        this.gioiTinh =  arr[3];
        this.diaChi =  arr[4];
        this.ngaySinh =  arr[5];
        this.email =  arr[6];
    }


    @Override
    public String toString() {
        return this.soDienThoai+","+this.nhomCuaDanhBa+","+this.hoTen+","+this.gioiTinh+","+this.diaChi+","+this.ngaySinh+","+this.email;
    }
    public String toString1() {
        return "Them moi"+this.soDienThoai+","+this.nhomCuaDanhBa+","+this.hoTen+","+this.gioiTinh+","+this.diaChi+","+this.ngaySinh;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        String sdtbb = "0\\d{9}";
        System.out.println("nhap vao so dien thoai: ");
        this.soDienThoai = sc.nextLine();
        while (true) {
            if (this.soDienThoai.matches(sdtbb) == false){
                System.out.println("nhap sai dinh dang,nhap lai");
                this.soDienThoai = sc.nextLine();
            }else{
                break;
            }
        }
        System.out.println("nhap vao Nhom cua danh ba: ");
        this.nhomCuaDanhBa=sc.nextLine();
        System.out.println("nhap vao  ho ten: ");
        this.hoTen=sc.nextLine();
        System.out.println("nhap vao gioi tinh: ");
        this.gioiTinh=sc.nextLine();
        System.out.println("nhap vao Dia chi: ");
        this.diaChi=sc.nextLine();
        System.out.println("nhap vao ngay sinh: ");
        this.ngaySinh=sc.nextLine();

        System.out.println("nhap vao email: ");
        this.email = sc.nextLine();

        }

    public void capnhat(){
        Scanner sc = new Scanner(System.in);
        String sdtbb = ".0\\D{10}";

        System.out.println("nhap vao Nhom cua danh ba: ");
        this.nhomCuaDanhBa=sc.nextLine();
        System.out.println("nhap vao  ho ten: ");
        this.hoTen=sc.nextLine();
        System.out.println("nhap vao gioi tinh: ");
        this.gioiTinh=sc.nextLine();
        System.out.println("nhap vao Dia chi: ");
        this.diaChi=sc.nextLine();
        System.out.println("nhap vao ngay sinh: ");
        this.ngaySinh=sc.nextLine();
        System.out.println("nhap vao email: ");
        this.email = sc.nextLine();

    }
    public void xuat(){
        System.out.println(this.toString());
    }
    public void xuat1(){
        System.out.println(this.toString1());
    }
}
