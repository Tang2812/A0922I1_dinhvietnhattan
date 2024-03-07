import java.util.Scanner;

public class Main {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int kt=0;
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    System.out.println("Swap: "+arr[j]+" and "+arr[j-1]);
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    kt++;
                } else {
                    break;
                }
                if(kt==0){
                    System.out.println("sorted! ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input size of array: ");
        int size=Integer.parseInt(sc.nextLine());
        int[] arr=new int[size];
        for (int i = 0; i < size ; i++) {
            System.out.println("input: ");
            arr[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("array before sorting: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-----Sort-----");
        Main.insertionSort(arr);
        System.out.println("array after sorting: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}