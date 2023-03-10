package dichvu;

import services.FacilityService;

import java.util.Scanner;

public class Room extends DichVu implements FacilityService {
    private String dichVuMienPhiDiKem;
public Room(){};
    public Room(String tenDichVu, float dienTich, int soLuongNguoiToiDa, int chiPhithue, String kieuThue, String dichVuMienPhiDiKem) {
        super(tenDichVu, dienTich, soLuongNguoiToiDa, chiPhithue, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }
    public String toString(){
        return super.toString()+","+this.dichVuMienPhiDiKem;
    }
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap dich vu mien phi di kem: ");
        this.dichVuMienPhiDiKem=sc.nextLine();
    }
    public void xuat(){
        System.out.println(this.toString());
    }
}
