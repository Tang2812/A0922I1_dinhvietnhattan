package nguoi;

import java.time.LocalDate;
import java.util.Scanner;

public class Nguoi {
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private String cMND;
    private String sDT;
    private String eMail;
public Nguoi(){};
    public Nguoi(String ten, String ngaySinh, String gioiTinh, String cMND, String sDT, String eMail) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
        this.sDT = sDT;
        this.eMail = eMail;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getcMND() {
        return cMND;
    }

    public void setcMND(String cMND) {
        this.cMND = cMND;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ten: ");
        this.ten=sc.nextLine();
        System.out.println("nhap ngay sinh ");
        this.ngaySinh= sc.nextLine();
        int chon=0;
        while (chon<=0||chon>2){
            System.out.println("chon gioi tinh: \r\n1.nam\r\n2.nu");
            chon=Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    this.gioiTinh="nam";
                    break;
                case 2:
                    this.gioiTinh="nu";
                    break;
                default:
                    System.out.println("nhap sai, no be de a may :) ???");
            }
        }
        System.out.println("nhap vao CMND: ");
        this.cMND=sc.nextLine();
        System.out.println("nhap vao SDT: ");
        this.sDT=sc.nextLine();
        System.out.println("nhap vao email: ");
        this.eMail=sc.nextLine();
    }
public void edit(){
    Scanner sc=new Scanner(System.in);
    System.out.println("nhap ten: ");
    this.ten=sc.nextLine();
    System.out.println("nhap ngay sinh ");
    this.ngaySinh= sc.nextLine();
    int chon=0;
    while (chon<=0||chon>2) {
        System.out.println("chon gioi tinh: \r\n1.nam\r\n2.nu");
        chon = Integer.parseInt(sc.nextLine());
        switch (chon) {
            case 1:
                this.gioiTinh = "nam";
                break;
            case 2:
                this.gioiTinh = "nu";
                break;
            default:
                System.out.println("nhap sai");
        }
    }
}
    @Override
    public String toString() {
        return this.ten+","+this.ngaySinh+","+this.sDT+","+this.gioiTinh+","+this.cMND+","+this.eMail;
    }
}
