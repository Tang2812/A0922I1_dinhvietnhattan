import java.util.Scanner;
import java.util.TreeMap;

public class Map_CoutStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input String: ");
        String str=sc.nextLine();
        String[] arr= str.split(" ");
        TreeMap<String, Integer> treeMapstr = new TreeMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if(treeMapstr.containsKey(arr[i])){
                Integer value=treeMapstr.get(arr[i]);
                value++;
                treeMapstr.replace(arr[i],value);
            }else{
                treeMapstr.put(arr[i],1);
            }
        }
        System.out.println(treeMapstr.toString());
    }
}
