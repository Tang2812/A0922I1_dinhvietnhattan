import controller.FuramaController;
import dichvu.DichVu;
import nguoi.Khachhang;
import nguoi.Nhanvien;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        ArrayList<Nhanvien> arrLe=new ArrayList<Nhanvien>();
        LinkedList<Khachhang> lkL=new LinkedList<>();
        LinkedHashMap<DichVu,Integer> lkHM=new LinkedHashMap<>();

        FuramaController ctll=new FuramaController();
        ctll.displayMainMenu(arrLe,lkL,lkHM);
    }
}
