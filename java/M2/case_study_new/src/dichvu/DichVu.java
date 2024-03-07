package dichvu;

import services.FacilityService;

import java.util.Scanner;

public class DichVu implements FacilityService {
    private String tenDichVu;
    private float dienTich;
    private int soLuongNguoiToiDa;
    private int chiPhithue;
    private String kieuThue;
public DichVu(){};
    public DichVu(String tenDichVu, float dienTich, int soLuongNguoiToiDa, int chiPhithue, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.chiPhithue = chiPhithue;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(int soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public int getChiPhithue() {
        return chiPhithue;
    }

    public void setChiPhithue(int chiPhithue) {
        this.chiPhithue = chiPhithue;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return this.tenDichVu + "," + this.kieuThue + "," + this.dienTich + "," + this.soLuongNguoiToiDa + "," + this.chiPhithue;

    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao ten dich vu: ");
        this.tenDichVu=sc.nextLine();
        int chon=0;
        while(chon<=0||chon>4){
            System.out.println("chon kieu thue: \r\n1.nam\r\n2.thang\r\n3.ngay\r\n4.gio");
            chon=Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    this.kieuThue="nam";
                    break;
                case 2:
                    this.kieuThue="thang";
                    break;
                case 3:
                    this.kieuThue="ngay";
                    break;
                case 4:
                    this.kieuThue="gio";
                    break;
                default:
                    System.out.println("nhap sai nhap lai!");
            }
        }
        System.out.println("nhapp vao dien tich: ");
        this.dienTich=Float.parseFloat(sc.nextLine());
        System.out.println("nhap vao so luong nguoi toi da: ");
        this.soLuongNguoiToiDa=Integer.parseInt(sc.nextLine());
        System.out.println("nhap vao chi phi thue: ");
        this.chiPhithue=Integer.parseInt(sc.nextLine());
    }

    @Override
    public void xuat() {
        FacilityService.super.xuat();
    }
}
