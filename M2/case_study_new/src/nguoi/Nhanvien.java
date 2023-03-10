package nguoi;

import services.EmployeeService;

import java.time.LocalDate;
import java.util.Scanner;

public class Nhanvien extends Nguoi implements EmployeeService {
    private String maNhanVien;
    private String trinhDo;
    private String viTri;
    private int luong;
public Nhanvien(){
    };
    public Nhanvien(String ten, String ngaySinh, String gioiTinh, String cMND, String sDT, String eMail, String maNhanVien) {
        super(ten, ngaySinh, gioiTinh, cMND, sDT, eMail);
        this.maNhanVien = maNhanVien;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
    public String toString(){
        return this.maNhanVien+","+super.toString()+","+this.trinhDo+","+this.viTri+","+this.luong;
    }

    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao ma nhan vien: ");
        this.maNhanVien=sc.nextLine();
        super.nhap();
        int chon=0;
        while(chon<=0||chon>4){
            System.out.println("chon trinh do nhan vien:\r\n1.Trung cap\r\n2.Cao dang\r\n3.Dai hoc\r\n4.Sau dai hoc ");
            chon=Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    this.trinhDo="Trung cap";
                    break;
                case 2:
                    this.trinhDo="Cao dang";
                    break;
                case 3:
                    this.trinhDo="Dai hoc";
                    break;
                case 4:
                    this.trinhDo="Sau dai hoc";
                    break;
                default:
                    System.out.println("nhap sai!");
            }
        }
            chon=0;
            while (chon<=0||chon>6){
                System.out.println("chon vi tri nhan vien:\r\n1.Le tan\r\n2.Phuc vu\r\n3.Chuyen vien\r\n4.Giam sat\r\n5.Quan li\r\n6.Giam doc");
                chon=Integer.parseInt(sc.nextLine());
                switch (chon){
                    case 1:
                        this.viTri="Le tan";
                        break;
                    case 2:
                        this.viTri="Phuc vu";
                        break;
                    case 3:
                        this.viTri="Chuyen vien";
                        break;
                    case 4:
                        this.viTri="Giam sat";
                        break;
                    case 5:
                        this.viTri="Quan li";
                        break;
                    case 6:
                        this.viTri="Giam doc";
                        break;
                    default:
                        System.out.println("nhap sai, nhap lai");
                }
            }

        System.out.println("nhap luong: ");
        this.luong=Integer.parseInt(sc.nextLine());
    }

    @Override
    public void edit() {
        Scanner sc=new Scanner(System.in);
        super.edit();
        int chon=0;
        while(chon<=0||chon>4){
            System.out.println("chon trinh do nhan vien:\r\n1.Trung cap\r\n2.Cao dang\r\n3.Dai hoc\r\n4.Sau dai hoc ");
            chon=Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    this.trinhDo="Trung cap";
                    break;
                case 2:
                    this.trinhDo="Cao dang";
                    break;
                case 3:
                    this.trinhDo="Dai hoc";
                    break;
                case 4:
                    this.trinhDo="Sau dai hoc";
                    break;
                default:
                    System.out.println("nhap sai!");
            }
            chon=0;
            while (chon<=0||chon>6){
                System.out.println("chon vi tri nhan vien:\r\n1.Le tan\r\n2.Phuc vu\r\n3.Chuyen vien\r\n4.Giam sat\r\n5.Quan li\r\n6.Giam doc");
                chon=Integer.parseInt(sc.nextLine());
                switch (chon){
                    case 1:
                        this.viTri="Le tan";
                        break;
                    case 2:
                        this.viTri="Phuc vu";
                        break;
                    case 3:
                        this.viTri="Chuyen vien";
                        break;
                    case 4:
                        this.viTri="Giam sat";
                        break;
                    case 5:
                        this.viTri="Quan li";
                        break;
                    case 6:
                        this.viTri="Giam doc";
                        break;
                    default:
                        System.out.println("nhap sai, nhap lai");
                }
            }
        }
        System.out.println("nhap luong: ");
        this.luong=Integer.parseInt(sc.nextLine());
    }

    public void xuat(){
        System.out.println(this.toString());
    }
}
