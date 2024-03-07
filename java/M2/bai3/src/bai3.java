import java.util.Arrays;

public class bai3 {
    public static void main(String[] args) {
        int arr1[];
        arr1=new int[]{1,2,3,4};
        int arr2[];
        arr2=new int[]{5,6,7};
        int[] arr3=new int[arr1.length+ arr2.length];
        for (int i = 0; i <arr1.length ; i++) {
            arr3[i]=arr1[i];
        }
        int j=0;
        for (int i =arr1.length ; i <arr3.length ; i++) {
            arr3[i]=arr2[j];
            j++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
