import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class chuoiDX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String str=sc.nextLine();
        Queue queue= new LinkedList();
        Stack stack=new Stack<>();
        for (int i = 0; i < str.length() ; i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i <str.length() ; i++) {
            queue.add(str.charAt(i));
        }
        boolean kt=true;
        while (!queue.isEmpty()){
            if(queue.remove().equals(stack.pop())){
                continue;
            }else{
                kt=false;
                break;
            }
        }
        if (kt){
            System.out.println("la chuoi doi xung");
        }else{
            System.out.println("khong doi xung");
        }

    }
}
