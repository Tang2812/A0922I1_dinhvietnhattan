import java.util.Scanner;
import java.util.Stack;

public class dauNgoac {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String s=sc.nextLine();
        boolean kt=true;
        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i)=='('){
                if (stack.isEmpty()){
                    stack.push(String.valueOf(s.charAt(i)));
                } else if (s.charAt(i)==')') {
                    if (stack.isEmpty()){
                        kt=false;
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }
        }
        if (!stack.isEmpty()){
            kt=false;
        }
        if (kt==true){
            System.out.println("Well");
        }else{
            System.out.println("????");
        }
    }
}
