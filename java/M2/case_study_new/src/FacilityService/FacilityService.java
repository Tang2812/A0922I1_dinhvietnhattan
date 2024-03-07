package FacilityService;

import dichvu.DichVu;
import dichvu.House;
import dichvu.Room;
import dichvu.Villa;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class FacilityService {
    public static int vOVilla, vOHouse,vORoom=0;
    public void xuat(){
        System.out.println("List Facility:\r\n1.Villa\r\n2.House\r\n3.Room");
    }
    public void nhap(LinkedHashMap<DichVu, Integer> lkHM){
        Scanner sc=new Scanner(System.in);
         int chon=0;

         while(chon<=0||chon>=4) {
             System.out.println("1.\tAdd New Villa\n" +
                     "2.\tAdd New House\n" +
                     "3.\tAdd New Room\n" +
                     "4.\tBack to menu\n");
             chon = Integer.parseInt(sc.nextLine());
             switch (chon) {
                 case 1:
                     if (vOVilla < 2) {
                         Villa tmp = new Villa();
                         tmp.nhap();
                         vOVilla++;
                         lkHM.put(tmp, vOVilla);
                     } else {
                         System.out.println("he thong dang bao tri Villa");
                     }
                     break;
                 case 2:
                     if (vOHouse < 2) {
                         House tmp = new House();
                         tmp.nhap();
                         vOHouse++;
                         lkHM.put(tmp, vOHouse);
                     } else {
                         System.out.println("he thong dang bao tri House");

                     }
                     break;
                 case 3:
                     if (vORoom < 2) {
                         Room tmp = new Room();
                         tmp.nhap();
                         vORoom++;
                         lkHM.put(tmp, vORoom);
                     } else {
                         System.out.println("he thong dang bao tri Room!");
                     }
                 case 4:
                     break;
                 default:
                     System.out.println("hay chon dung chuc nang!");
             }
         }
    }
    public void displayMaintenance(LinkedHashMap<DichVu, Integer> lkHM) {
        int kt = 0;
        for (DichVu a: lkHM.keySet()) {
            if (lkHM.get(a)>=2){
                a.getTenDichVu();
                System.out.println();
                kt++;
            }
        }
        if (kt==0){
            System.out.println("khong co chuc nang can bao tri! ");
        }
    }
}

