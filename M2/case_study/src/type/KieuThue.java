package type;

import java.util.Scanner;

public enum KieuThue {
    nam,
    thang,
    ngay,
    gio;
    public KieuThue nhap ()
    {
        Scanner sc= new Scanner(System.in);
        int chon=0;

        while(chon<1||chon>4){
            System.out.println("\t1.nam\n" +
                    "\t2.thang\n" +
                    "\t3.ngay\n" +
                    "\t4.gio\n");
            System.out.println("Input your choice: ");
            chon= Integer.parseInt(sc.next());
            switch (chon){
                case 1:
                    return KieuThue.nam;
                case 2:
                    return KieuThue.thang;
                case 3:
                    return KieuThue.ngay;
                case 4:
                    return KieuThue.gio;

            }
        }
        return null;
    }
}
