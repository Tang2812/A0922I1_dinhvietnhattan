import java.util.Arrays;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int[] arr;
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("input n:");
        n=Integer.parseInt(sc.nextLine());
        arr=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("input number: ");
            arr[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("Array: "+ Arrays.toString(arr));
        int min=arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]<min){
                min=arr[i]  ;

            }
        }
        System.out.println("min value in array is: "+min);
    }
}
