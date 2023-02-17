import java.util.Scanner;

public class setting {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input size of array: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("input: ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("array after sorting: ");
        setting.insertionSort(arr);
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
