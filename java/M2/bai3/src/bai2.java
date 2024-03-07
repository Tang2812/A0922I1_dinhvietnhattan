import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int arr[];
        arr=new int[] {1,2,3,5,6,7,8,0,0};
        int index;
        int num;
        System.out.println("input index: ");
        Scanner sc=new Scanner(System.in);
        index=Integer.parseInt(sc.nextLine());
        System.out.println("input num");
        num=Integer.parseInt(sc.nextLine());
        for (int i = index; i < arr.length-1; i++) {
            arr[i+1]=arr[i];
        }
        arr[index]=num;
        System.out.println(Arrays.toString(arr));
    }
}
