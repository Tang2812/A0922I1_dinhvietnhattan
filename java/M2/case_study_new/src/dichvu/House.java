package dichvu;

import services.FacilityService;

import java.util.Scanner;

public class House extends DichVu implements FacilityService {
    private String tieuChuanPhong;
    private int soTang;
public House(){};
    public House(String tenDichVu, float dienTich, int soLuongNguoiToiDa, int chiPhithue, String kieuThue, String tieuChuanPhong, int soTang) {
        super(tenDichVu, dienTich, soLuongNguoiToiDa, chiPhithue, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }
    public String toString(){
        return super.toString()+","+this.tieuChuanPhong+","+this.soTang;
    }
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao tieu chuan phong: ");
        this.tieuChuanPhong=sc.nextLine();
        System.out.println("nhap vao so tang:");
        this.soTang=Integer.parseInt(sc.nextLine());
    }
    public void xuat(){
        System.out.println(this.toString());
    }
}
