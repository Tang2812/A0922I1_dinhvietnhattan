import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        final long rate=23000;
        long USD;
        System.out.println("input USD to change: ");
        Scanner sc=new Scanner(System.in);
        USD=Integer.parseInt(sc.nextLine());
    long VND=USD*rate;
        System.out.println("Result: "+VND+" VND");
    }
}
