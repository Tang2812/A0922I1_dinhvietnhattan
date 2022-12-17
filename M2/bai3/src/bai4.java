import java.util.Arrays;
import java.util.Scanner;

public class bai4 {
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
        int max=arr[0][0];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Max value in array is: "+max);
    }
}
