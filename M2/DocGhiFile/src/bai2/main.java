package bai2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        String path="C:\\codeGym\\A0922I1_dinhvietnhattan\\M2\\DocGhiFile\\src\\bai2\\list";
        List<Country> cList=new ArrayList<>();
        ReadWriteFile.readToFile(path,cList);
        for(Country c: cList){
            System.out.println(c.toString());
        }
    }
}
