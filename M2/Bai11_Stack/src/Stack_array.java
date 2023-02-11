import java.util.Stack;

public class Stack_array {
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<Integer>();
        int[] arr=new int[5];
        for (int i = 0; i <=4 ; i++) {
            arr[i]=i;
        }
        for (int i = 0; i <5 ; i++) {
            s.push(arr[i]);
        }
        for (int i = 0; i <5 ; i++) {
            arr[i]=s.pop();
        }
        System.out.println("Sau khi dao chieu: ");
        for (int i = 0; i <5 ; i++) {
            System.out.println(arr[i]+"\r");
        }
    }
}
