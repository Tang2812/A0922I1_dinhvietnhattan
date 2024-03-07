package CustoomerManagement;

import nguoi.Khachhang;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerManagement {
public void nhap(LinkedList<Khachhang> lkL){
    Khachhang tmp=new Khachhang();
    tmp.nhap();
    lkL.add(tmp);
}
public void xuat(LinkedList<Khachhang> lkL){
    for(Khachhang a:lkL){
        a.xuat();
    }
}
public void edit(LinkedList<Khachhang> lkL){
    String ma;
    Scanner sc= new Scanner(System.in);
    System.out.println("nhap vao ma Khach hang muon thay doi: ");
    ma=sc.nextLine();
    int kt=0;
    for (Khachhang a:lkL){
        if(a.getMaKhachHang().equals(ma)==true){
            kt++;
        }
    }
    if(kt==0){
        System.out.println("khong tim thay khach hang!");
    }
}
}
