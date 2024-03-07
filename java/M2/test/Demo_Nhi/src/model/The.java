package model;


import java.util.Scanner;

public abstract class The {
    private String soThe;
    private String tenChuThe;
    private String cccd;
    private String diaChi;

    public The(String soThe, String tenChuThe, String cccd, String diaChi) {
        this.soThe = soThe;
        this.tenChuThe = tenChuThe;
        this.cccd = cccd;
        this.diaChi = diaChi;
    }

    public The() {
    }

    public The(String[] arr) {
        this.soThe = arr[0];
        this.tenChuThe = arr[1];
        this.cccd = arr[2];
        this.diaChi = arr[3];
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public String getTenChuThe() {
        return tenChuThe;
    }

    public void setTenChuThe(String tenChuThe) {
        this.tenChuThe = tenChuThe;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return this.soThe + "," + this.tenChuThe + "," + this.cccd + "," + this.diaChi;
    }

    public void nhap() {
        final String maThe="\\D{12}";
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so the: ");
        this.soThe = sc.nextLine();
        while (true){
            if (this.soThe.matches(maThe)==false){
                System.out.println("nhap lai so the: ");
                this.soThe = sc.nextLine();
            }else{
                break;
            }
        }

        System.out.println("nhap vao ten chu the: ");
        this.tenChuThe = sc.nextLine();
        System.out.println("nhap vao cccd: ");
        this.cccd = sc.nextLine();
        System.out.println("nhap vao dia chi: ");
        this.diaChi = sc.nextLine();
    }

    public abstract void xuat();
}

