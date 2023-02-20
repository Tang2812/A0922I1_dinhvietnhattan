import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path="C:\\codeGym\\A0922I1_dinhvietnhattan\\M2\\binariFile\\src\\test.dat";
        List<product> list=new ArrayList<product>();
        product a=new product("1","a","aa",10);
        product b=new product("2","b","bb",20);
        product c=new product("3","c","cc",30);
        list.add(a);
        list.add(b);
        list.add(c);
        file.write(path,list);
        List<product> l=new ArrayList<product>();
        file.read(path,l);
        for(product d:l){
            System.out.println(d.toString());
        }
    }

}