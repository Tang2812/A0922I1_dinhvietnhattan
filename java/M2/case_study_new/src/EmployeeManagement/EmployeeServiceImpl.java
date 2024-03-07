package EmployeeManagement;

import nguoi.Nhanvien;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl {
    public void nhap(ArrayList<Nhanvien> arrL){
        Nhanvien a= new Nhanvien();
        a.nhap();
        arrL.add(a);
    }
    public void xuat(ArrayList<Nhanvien> arrL){
        for(Nhanvien a:arrL){
            a.xuat();
        }
    }
    public void edit(ArrayList<Nhanvien> arrL){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap ma nha vien muon chinh sua: ");
        String ma=sc.nextLine();
        int kt=0;
        for(Nhanvien a:arrL){
            if(a.getMaNhanVien().equals(ma)==true) {
                a.edit();
            kt++;
            }
        }
        if(kt==0){
            System.out.println("khong tim thay! ");
        }
    }

}
