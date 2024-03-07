package The;

import java.util.Scanner;

public class ATM extends The{
    private int soDu;
    public ATM(){
        this.soDu= 0;
    };

    public ATM(String soThe, String tenChuThe, String cccd, String diaChi, int soDu) {
        super(soThe, tenChuThe, cccd, diaChi);
        this.soDu = soDu;
    }

    public ATM(String[] arr) {
        super(arr);
        this.soDu = Integer.parseInt(arr[4]);
    }

    public int getSoDu() {
        return soDu;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }

    @Override
    public String toString() {
        return super.toString()+","+this.soDu;
    }

    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        super.nhap();
    }

    @Override
    public void xuat() {
        System.out.println(this.toString());
    }
}
