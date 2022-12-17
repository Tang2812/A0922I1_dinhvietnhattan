import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        String str;
        String a;
        Scanner sc=new Scanner(System.in);
        System.out.println("input string: ");
        str=sc.nextLine();
        System.out.println("input char: ");
        a=sc.nextLine();
        int dem=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == a.charAt(0)){
                dem++;
            }
        }
        System.out.println(dem);
    }
}
