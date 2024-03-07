import java.util.Arrays;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int [][] arr;
        int n,m;
        Scanner sc= new Scanner(System.in);
        System.out.println("input n: ");
        n=Integer.parseInt(sc.nextLine());
        System.out.println("input m: ");
        m=Integer.parseInt(sc.nextLine());
        arr=new int[n][m];
        for (int i =0 ; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.println("input number: ");
                arr[i][j]=Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Array: "+ Arrays.deepToString(arr));
        int col;
        System.out.println("input colum : ");
        col=Integer.parseInt(sc.nextLine());
        int sum=0;
        for (int i = 0; i <n ; i++) {
            sum=sum+arr[i][col];
        }
        System.out.println("Sum of colum: "+sum);
    }
}
