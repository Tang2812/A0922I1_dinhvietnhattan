package model;

import java.util.Scanner;

public class Credit extends The {
    private int duNo;
    private int hanMuc;
    public Credit(){
        this.duNo=0;
    }

    public int getDuNo() {
        return duNo;
    }

    public void setDuNo(int duNo) {
        this.duNo = duNo;
    }

    public int getHanMuc() {
        return hanMuc;
    }

    public void setHanMuc(int hanMuc) {
        this.hanMuc = hanMuc;
    }

    public Credit(String soThe, String tenChuThe, String cccd, String diaChi) {
        super(soThe, tenChuThe, cccd, diaChi);
        this.duNo=0;
    }

    public Credit(String[] arr) {
        super(arr);
        this.duNo = Integer.parseInt(arr[4]);
        this.hanMuc = Integer.parseInt(arr[5]);
    }

    @Override
    public String toString() {
        return super.toString()+","+this.duNo+","+this.hanMuc;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao han muc: ");
        this.hanMuc=Integer.parseInt(sc.nextLine());
    }

    @Override
    public void xuat() {
        System.out.println(this.toString());
    }
}
