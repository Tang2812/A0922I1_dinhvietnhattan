package type;

import java.util.Scanner;

public enum TrinhDo {
    TrungCap,
    CaoDang,
    SauDaiHoc;
public TrinhDo input(){
    Scanner sc= new Scanner(System.in);
    int chon=0;
    while(chon<1||chon>4){
        System.out.println("\t1.Trung cap\n" +
                "\t2.Cao dang\n" +
                "\t3.Sau dai hoc\n");
        System.out.println("Input your choice: ");
        chon= Integer.parseInt(sc.next());
        switch (chon) {
            case 1:
                return TrinhDo.TrungCap;
            case 2:
                return TrinhDo.CaoDang;
            case 3:
                return TrinhDo.SauDaiHoc;
        }
    }
    return null;
}
}
