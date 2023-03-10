package nguoi;

import services.CustomerService;

import java.time.LocalDate;
import java.util.Scanner;

public class Khachhang extends Nguoi implements CustomerService {
   private String maKhachHang;
    private String loaiKhach;
    private String diaChi;
public  Khachhang(){};
    public Khachhang(String ten, String ngaySinh, String gioiTinh, String cMND, String sDT, String eMail, String maKhachHang, String loaiKhach, String diaChi) {
        super(ten, ngaySinh, gioiTinh, cMND, sDT, eMail);
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return this.maKhachHang+","+super.toString()+this.loaiKhach+","+this.diaChi;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao ma khach hang: ");
        this.maKhachHang=sc.nextLine();
        super.nhap();
        int chon=0;
        while(chon<=0||chon>5){
            System.out.println("Moi chon loai khach hang:\r\n1.Diamond\r\n2.Platinum\r\n3.Gold\r\n4.Silver\r\n5.Member");
            chon=Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    this.loaiKhach="Diamond";
                    break;
                case 2:
                    this.loaiKhach="Platinum";
                    break;
                case 3:
                    this.loaiKhach="Gold";
                    break;
                case 4:
                    this.loaiKhach="Silver";
                    break;
                case 5:
                    this.loaiKhach="Member";
                    break;
                default:
                    System.out.println("nhap sai, nhap lai!");
            }

        }
        System.out.println("nhap dia chi khach hang: ");
        this.diaChi=sc.nextLine();
    }
    public void edit(){
        super.edit();
        Scanner sc=new Scanner(System.in);
        int chon=0;
        while(chon<=0||chon>5){
            System.out.println("Moi chon loai khach hang:\r\n1.Diamond\r\n2.Platinum\r\n3.Gold\r\n4.Silver\r\n5.Member");
            chon=Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    this.loaiKhach="Diamond";
                    break;
                case 2:
                    this.loaiKhach="Platinum";
                    break;
                case 3:
                    this.loaiKhach="Gold";
                    break;
                case 4:
                    this.loaiKhach="Silver";
                    break;
                case 5:
                    this.loaiKhach="Member";
                    break;
                default:
                    System.out.println("nhap sai, nhap lai!");
            }

        }
        System.out.println("nhap dia chi khach hang: ");
        this.diaChi=sc.nextLine();
    }
    public void xuat(){
        System.out.println(this.toString());
    }
}
