import java.util.Scanner;
import java.util.Stack;

public class thapphan_nhiphan {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        int thapPhan=Integer.parseInt(sc.nextLine());
        int tmp=thapPhan;
        int dem=0;
        while(tmp>0){
            int nhiPhan=tmp%2;
            dem++;
            tmp=tmp/2;
            stack.push(nhiPhan);
        }
        String str=new String();
        for (int i = 0; i <dem ; i++) {
            str= String.format("%s%s", str, stack.pop());
        }
        System.out.println("ket qua la: "+str);
    }
}
