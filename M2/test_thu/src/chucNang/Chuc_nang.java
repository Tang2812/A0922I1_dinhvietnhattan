package chucNang;

import The.ATM;
import The.Credit;
import The.The;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Chuc_nang {
  public   ArrayList<ATM> atms=new ArrayList<>();
   public ArrayList<Credit> credits=new ArrayList<>();
   public String path="C:\\codeGym\\A0922I1_dinhvietnhattan\\M2\\test_thu\\src\\test";
    Scanner sc=new Scanner(System.in);
    public static final String BLANK = "";
    public static final String DELIMITER = ",";

    public void docFile(){
        File file=new File(this.path);
        String str=null;
        ArrayList<ATM> tmp1=new ArrayList<>();
        ArrayList<Credit> tmp2=new ArrayList<>();

        try {
            BufferedReader br= Files.newBufferedReader(file.toPath());
            while (true){
                str=br.readLine();
                if(str==null){
                    break;
                }
                if(str.trim().equals(BLANK)){
                    continue;
                }
                String[] result = str.split(DELIMITER);
                if(result.length==5){

                    ATM object=new ATM(result);
                    tmp1.add(object);
                }
                if(result.length==6){
                Credit object=new Credit(result);
                tmp2.add(object);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        atms=tmp1;
        credits=tmp2;
    }
  public   void ghiFile(Boolean type){
        File file=new File(this.path);
        try{
            FileWriter pw= new FileWriter(path,type);
            for (ATM tmp:atms){
                pw.write(tmp.toString());
                pw.write("\r\n");
            }
            for (Credit tmp:credits){
                pw.write(tmp.toString());
                pw.write("\r\n");
            }
            pw.flush();
            pw.close();
    }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void thanhToanAtm(){
        String maThe;
        System.out.println("nhap so the: ");
        maThe=sc.nextLine();
        int kt=0;
        for(ATM the:atms){
            if(the.getSoThe().equals(maThe)==true) {
                kt++;
                int soDu;
                int tienThanhToan;
                System.out.println("nhap so tien thanh toan: ");
                tienThanhToan=Integer.parseInt(sc.nextLine());
                soDu = the.getSoDu() - tienThanhToan;
                if (the.getSoDu() > 0) {
                    the.setSoDu(soDu);
                }else{
                    System.out.println("the khong du so du");
                    break;
                }
            }
        }
        if(kt==0){
            System.out.println("khong tim thay so the!");
        }
    }
    public void thanhToanCREDIT(){
        String maThe;
        System.out.println("nhap so the: ");
        maThe=sc.nextLine();
        int kt=0;
        for(Credit the:credits){
            if(the.getSoThe().equals(maThe)==true) {
                kt++;
                int noMoi;
                int tienThanhToan;
                System.out.println("nhap so tien thanh toan: ");
                tienThanhToan=Integer.parseInt(sc.nextLine());
                noMoi = the.getDuNo() + tienThanhToan;
                System.out.println("no: "+noMoi);
                if (the.getDuNo() < the.getHanMuc()) {
                    System.out.println("here");
                    the.setDuNo(noMoi);
                }else{
                    System.out.println("the da qua so Du");
                    break;
                }
            }
        }
        if(kt==0){
            System.out.println("khong tim thay so the!");
        }
    }
    public void thanhToan(){
        this.docFile();
        int chon=0;
        do {
            System.out.println("Moi ban chon loai the:\r\n1.ATM\r\nn2.CREDIT\r\n3.Thoat");
           try {
               chon=Integer.parseInt(sc.nextLine());
           }catch (Exception e){
               System.out.println("nhap cho dung dinh dang!");
           }
            switch (chon){
                case 1:
                    thanhToanAtm();
                    break;
                case 2:
                    thanhToanCREDIT();
                    break;
                case 3:
                    break;
            }
        }while(chon!=3);
        this.ghiFile(false);
    }
    public void nopTienATM(){
        String maThe;
        System.out.println("nhap so the: ");
        maThe=sc.nextLine();
        int kt=0;
        int soTien;
        for(ATM the:atms){
            if(the.getSoThe().equals(maThe)==true){
                kt++;
                System.out.println("nhap so tien: ");
                soTien=Integer.parseInt(sc.nextLine());
                the.setSoDu(soTien+ the.getSoDu());
            }
        }
    if(kt==0){
        System.out.println("khong tim thay the!");
    }
    }
    public void nopTienCREDIT(){
        String maThe;
        System.out.println("nhap so the: ");
        maThe=sc.nextLine();
        int kt=0;
        int soTien;
        for(Credit the:credits){
            if(the.getSoThe().equals(maThe)==true){
                kt++;
                System.out.println("nhap so tien: ");
                soTien=Integer.parseInt(sc.nextLine());
                the.setDuNo(the.getDuNo()-soTien);
            }
        }
        if(kt==0){
            System.out.println("khong tim thay the!");
        }
    }
    public  void nopTien(){
        this.docFile();
        int chon=0;
        do {
            System.out.println("Moi ban chon loai the:\r\n1.ATM\r\nn2.CREDIT\r\n3.Thoat");
            try {
                chon=Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("nhap cho dung dinh dang!");
            }
            switch (chon){
                case 1:
                    nopTienATM();
                    break;
                case 2:
                   nopTienCREDIT();
                    break;
                case 3:
                    break;
            }
        }while(chon!=3);
        this.ghiFile(false);
    }
    public void timATM(){
            String maThe;
        System.out.println("nhap so the: ");
    maThe=sc.nextLine();
    int kt=0;
        for(ATM the:atms){
        if(the.getSoThe().equals(maThe)==true) {
            kt++;
            System.out.println("tim thay; thong tin: ");
            System.out.println(the.toString());
        }
    }
        if(kt==0){
        System.out.println("khong tim thay so the!");
    }
}
    public void timCREDIT(){
        String maThe;
        System.out.println("nhap so the: ");
        maThe=sc.nextLine();
        int kt=0;
        for(Credit the:credits){
            if(the.getSoThe().equals(maThe)==true) {
                kt++;
                System.out.println("tim thay; thong tin: ");
                System.out.println(the.toString());
            }
        }
        if(kt==0){
            System.out.println("khong tim thay so the!");
        }
    }


    public void tim(){
        this.docFile();
        int chon=0;
        do {
            System.out.println("Moi ban chon loai the:\r\n1.ATM\r\nn2.CREDIT\r\n3.Thoat");
            try {
                chon=Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("nhap cho dung dinh dang!");
            }
            switch (chon){
                case 1:
                    timATM();
                    break;
                case 2:
                    timCREDIT();
                    break;
                case 3:
                    break;
            }
        }while(chon!=3);
    }
    public void huyTheATM(){
        String maThe;
        System.out.println("nhap so the: ");
        int vt=0;
        maThe=sc.nextLine();
        int kt=0;
        for(ATM the:atms){
            if(the.getSoThe().equals(maThe)==true) {
                kt++;
                System.out.println("Da huy the: ");
               vt=atms.indexOf(the);
            }
        }
        atms.remove(vt);
        if(kt==0){
            System.out.println("khong tim thay so the!");
        }
        this.ghiFile(false);
    }
    public void huyTheCREDIT(){
        String maThe;
        System.out.println("nhap so the: ");
        int vt=0;
        maThe=sc.nextLine();
        int kt=0;
        for(Credit the:credits){
            if(the.getSoThe().equals(maThe)==true) {
                kt++;
                System.out.println("Da huy the: ");
                vt=atms.indexOf(the);
            }
        }
        atms.remove(vt);
        if(kt==0){
            System.out.println("khong tim thay so the!");
        }
        this.ghiFile(false);
    }
    public void huyThe(){
        this.docFile();
        int chon=0;
        do {
            System.out.println("Moi ban chon loai the:\r\n1.ATM\r\nn2.CREDIT\r\n3.Thoat");
            try {
                chon=Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("nhap cho dung dinh dang!");
            }
            switch (chon){
                case 1:
                    huyTheATM();
                    break;
                case 2:
                    huyTheCREDIT();
                    break;
                case 3:
                    break;
            }
        }while(chon!=3);
    }
    public void chuyenKhoanATM(ATM the){
        String maThe;
        System.out.println("nhap so the ban muon chuyen den: ");
        maThe=sc.nextLine();
        for(ATM tmp:atms){

        }
    }
    public void chuyenKhoan(){
        this.docFile();
        String maThe;
        System.out.println("Nhap ma the chuyen di: ");
        maThe=sc.nextLine();
        for (ATM the:atms){
            if(the.getSoThe().equals(maThe)==true){
                int chon=0;
                do {
                    System.out.println("Moi ban chon loai the muon chuyen den::\r\n1.ATM\r\n2.CREDIT\r\n3.Thoat");
                    try {
                        chon=Integer.parseInt(sc.nextLine());
                    }catch (Exception e){
                        System.out.println("nhap cho dung dinh dang!");
                    }
                    switch (chon){
                        case 1:
                            huyTheATM();
                            break;
                        case 2:
                            huyTheCREDIT();
                            break;
                        case 3:
                            break;
                    }
                }while(chon!=3);
            }else{
                System.out.println("Khong tim thay the");
            }
            }
        }

}

