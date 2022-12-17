import java.util.Arrays;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
    int[] arr;
    arr= new int[]{1, 2, 3, 4, 5, 6,0,0};
    int num;
        System.out.println("input number: ");
        Scanner sc= new Scanner(System.in);
        num=Integer.parseInt(sc.nextLine());
        int vt=-1;
        for (int i = 0; i <arr.length; i++) {
            if(num==arr[i]){
                vt=i;
            }
        }
        if(vt>-1){
            for (int i = vt; i <arr.length-1 ; i++) {
                arr[i]=arr[i+1];
            }
        }else{
            System.out.println("number not found");
        }
        System.out.println(Arrays.toString(arr));
    }
}
