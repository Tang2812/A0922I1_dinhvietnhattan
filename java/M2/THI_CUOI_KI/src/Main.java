import Chuc_nang.Chuc_nang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        Chuc_nang chuc_nang = new Chuc_nang();

        do {
            System.out.println("----CHUONG TRINH QUAN LI DANH BA----");
            System.out.println("Chon chuc nang theo so (de tiep tuc):");
            System.out.println("1.Xem danh sach\r\n2.Them moi\r\n3.Cap Nhat\r\n4.Xoa\r\n5.Tim kiem\r\n6.Doc tu File\r\n7.Ghi vao File\r\n8.Thoat");
            System.out.println("Chon chuc nang: ");
            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("nhap cho dung dinh dang so");
            }
            switch (chon) {
                case 1:
                    chuc_nang.xuat();
                    break;
                case 2:
                    chuc_nang.themMoi();
                    break;
                case 3:
                    chuc_nang.sua();
break;
                case 4:
                    chuc_nang.xoa();
                    break;
                case 5:
                    chuc_nang.tim_kiem();
                    break;
                case 6:
                    chuc_nang.doc_tu_file();
                    break;
                case 7:
                    chuc_nang.viet_vao_file();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Nhap sai, nhap lai");
            }
        } while (chon != 8);
    }
}

