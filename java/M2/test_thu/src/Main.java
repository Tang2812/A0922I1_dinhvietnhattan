import chucNang.Chuc_nang_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Chuc_nang_1 Chuc_nang =new Chuc_nang_1();
        int chon=0;

        do {
            System.out.println("nhap vao lua chon:\r\n1.Dang ki the\r\n2.Xuat man hinh\r\n3.Doc danh sach\r\n4.Ghi file\r\n5.Thanh toan bang the\r\n6.Nop tien vao the\r\n7.Tim card\r\n8.Xoa the\r\n9.Chuyen khoan\r\n10.Thoat");
       try{
           chon=Integer.parseInt(sc.nextLine());
       }catch (Exception e){
           System.out.println("nhap cho dung dinh dang so");
       }
            switch (chon){
                case 1:
                    Chuc_nang.dangKi();
                    break;
                case 2:
                    Chuc_nang.xuat();
                    break;
//                case 3:
//                    chucNang.docFile();
//                    break;
//                case 4:
//                    chucNang.ghiFile(true);
//                    break;
                case 5:
                    Chuc_nang.thanhToan();
                    break;
                case 6:
                    Chuc_nang.nopTien();
                    break;
//                case 7:
//                    chucNang.tim();
//                    break;
//                case 8:
//                    chucNang.huyThe();
//                    break;
            }
        }while (chon!=10);
    }
}