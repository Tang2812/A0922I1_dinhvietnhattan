package dichvu;

import services.FacilityService;

import java.util.Scanner;

public class Villa extends DichVu implements FacilityService {
    private String tieuChuanPhong;
    private float dienTichHoBoi;
    private int soTang;
    public Villa(){};
    public Villa(String tenDichVu, float dienTich, int soLuongNguoiToiDa, int chiPhithue, String kieuThue, String tieuChuanPhong, float dienTichHoBoi, int soTang) {
        super(tenDichVu, dienTich, soLuongNguoiToiDa, chiPhithue, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }
    public String toString(){
        return super.toString()+","+this.tieuChuanPhong+","+this.soTang+","+this.dienTichHoBoi;

    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public float getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(float dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao tieu chuan phong: ");
        this.tieuChuanPhong=sc.nextLine();
        System.out.println("nhap vao dien tich ho boi: ");
        this.dienTichHoBoi=Float.parseFloat(sc.nextLine());
        System.out.println("nhap vao so tang: ");
        this.soTang=Integer.parseInt(sc.nextLine());
    }
    public void xuat(){
        System.out.println(this.toString());
    }
}
