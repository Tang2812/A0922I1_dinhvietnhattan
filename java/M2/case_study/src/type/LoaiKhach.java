package type;

import java.util.Scanner;

public enum LoaiKhach {
    Diamond,
    Platinum,
    Gold,
    Silver,
    Member;
    public LoaiKhach input(){
        Scanner sc= new Scanner(System.in);
        int chon=0;
        while(chon<1||chon>4){
            System.out.println("\t1.Diamond\n" +
                    "\t2.Platinum\n" +
                    "\t3.Gold\n" +
                    "\t4.Silver\n" +
                    "\t5.Member\n");
            System.out.println("Input your choice: ");
            chon= Integer.parseInt(sc.next());
            switch (chon){
                case 1:
                    return LoaiKhach.Diamond;
                case 2:
                    return LoaiKhach.Platinum;
                case 3:
                    return LoaiKhach.Gold;
                case 4:
                    return LoaiKhach.Silver;
                case 5:
                    return LoaiKhach.Member;

            }
        }
        return null;
    }
}
