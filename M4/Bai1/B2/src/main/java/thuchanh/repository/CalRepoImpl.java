package thuchanh.repository;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CalRepoImpl implements CalRepo{
    public static ArrayList anh= new ArrayList();
    public static ArrayList viet=new ArrayList();
    static {
        anh.add("hello");
        anh.add("hi");
        anh.add("eat");
        anh.add("book");
        anh.add("school");
        viet.add("xin chao");
        viet.add("xin chao");
        viet.add("an");
        viet.add("sach");
        viet.add("truong");
    }

    @Override
    public String trans(String str) {
        int vt=-1;
        for (int i = 0; i <anh.size() ; i++) {
            if(str.equals(anh.get(i))==true){
                vt=i;
                break;
            }
        }
        if(vt>-1){
            return (String) viet.get(vt);
        }else{
            return "khong tim thay";
        }
    }
}
