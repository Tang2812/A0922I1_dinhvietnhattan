import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao 3 canh tam giac:  ");
        try {

            a = Integer.parseInt(sc.nextLine());
            b = Integer.parseInt(sc.nextLine());
            c = Integer.parseInt(sc.nextLine());
        if(a<=0 || b<=0 || c<=0){
            throw new NegativeArraySizeException("nhap so lon hon 0");
        }
        if(a+b<=c || a+c<=b || b+c<=a  ){
            throw  new NegativeArraySizeException("nhap cho dung dinh dang cua tam giac!");
        }
        }catch (NegativeArraySizeException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("khong nhap chu vao day");
        }
    }

}