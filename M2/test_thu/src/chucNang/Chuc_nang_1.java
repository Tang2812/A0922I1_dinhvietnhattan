package chucNang;
import The.The;
import The.ATM;
import The.Credit;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Chuc_nang_1 {
    ArrayList<The> arrayList_The = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public String path = "C:\\codeGym\\A0922I1_dinhvietnhattan\\M2\\test_thu\\src\\test";

    public static final String BLANK = "";
    public static final String DELIMITER = ",";

    public void docFile() {
        File file = new File(this.path);
        String str = null;

        try {
            BufferedReader br = Files.newBufferedReader(file.toPath());
            while (true) {
                str = br.readLine();
                if (str == null) {
                    break;
                }
                if (str.trim().equals(BLANK)) {
                    continue;
                }
                String[] result = str.split(DELIMITER);
                if (result.length == 5) {
                    ATM object = new ATM(result);
                    arrayList_The.add(object);
                }
                if (result.length == 6) {
                    Credit object = new Credit(result);
                    arrayList_The.add(object);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void ghiFile(Boolean type) {
        File file = new File(this.path);
        try {
            FileWriter pw = new FileWriter(path, type);
            for (The tmp : arrayList_The) {
                pw.write(tmp.toString());
                pw.write("\r\n");
            }
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dangKi() {
        this.docFile();
        int chon = 0;
        do {
            System.out.println("Moi ban chon:\r\n1.ATM\r\n2.CREDIT\r\n3.Thoat");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    ATM object = new ATM();
                    object.nhap();
                    arrayList_The.add(object);
                    break;
                case 2:
                    Credit object1 = new Credit();
                    object1.nhap();
                    arrayList_The.add(object1);
                    break;
                case 3:
                    break;
            }
        } while (chon != 3);
        this.ghiFile(false);
    }

    public void xuat() {
        this.docFile();
        for (The the : arrayList_The) {
            the.xuat();
        }
    }

    public void thanhToan() {
        this.docFile();
        String ma;
        System.out.println("nhap ma the thanh toan: ");
        ma = sc.nextLine();
        int kt = 0;
        for (The the : arrayList_The) {
            if (the.getSoThe().equals(ma) == true) {
                int tien_thanh_toan;
                System.out.println("nhap vao so tien can thanh toan: ");
                tien_thanh_toan = Integer.parseInt(sc.nextLine());
                kt++;
                if (the instanceof ATM == true) {
                    int tien_du = ((ATM) the).getSoDu() - tien_thanh_toan;
                    if (tien_du > 0) {
                        System.out.println("Thanh toan thanh cong");
                        ((ATM) the).setSoDu(tien_du);
                    } else {
                        System.out.println("so tien trong tai khoan khong du!");
                    }
                }
                if (the instanceof Credit == true) {
                    int du_no = ((Credit) the).getDuNo() + tien_thanh_toan;
                    if (du_no < ((Credit) the).getHanMuc()) {
                        System.out.println("Thanh toan thanh cong!");
                        ((Credit) the).setDuNo(du_no);
                    } else {
                        System.out.println("Da vuot qua han muc!");
                    }
                }
            }
        }
        if (kt == 0) {
            System.out.println("khong tim thay the!");
        }
        this.ghiFile(false);
    }
    public void nopTien() {
        this.docFile();
        String ma;
        System.out.println("nhap ma the thanh toan: ");
        ma = sc.nextLine();
        int kt = 0;
        for (The the : arrayList_The) {
            if (the.getSoThe().equals(ma) == true) {
                int tien_thanh_toan;
                System.out.println("nhap vao so tien can nop: ");
                tien_thanh_toan = Integer.parseInt(sc.nextLine());
                kt++;
                if (the instanceof ATM == true) {
                    int tien_du = ((ATM) the).getSoDu() + tien_thanh_toan;
                    ((ATM) the).setSoDu(tien_du);
                }
                if (the instanceof Credit == true) {
                    int du_no = ((Credit) the).getDuNo() - tien_thanh_toan;

                    System.out.println("Thanh toan thanh cong!");
                    ((Credit) the).setDuNo(du_no);

                }
            }
        }
        if (kt == 0) {
            System.out.println("khong tim thay the!");
        }
        this.ghiFile(false);
    }

    public void tim() {
        this.docFile();
        String ma;
        System.out.println("nhap ma the can tim: ");
        ma = sc.nextLine();
        int kt = 0;
        for (The the : arrayList_The) {
            if (the.getSoThe().equals(ma) == true) {
                        the.xuat();
                        kt++;
            }
        }
        if(kt==0){
            System.out.println("khong tim thay!");
        }
    }
    public void huyThe(){
        this.docFile();
        String ma;
        System.out.println("nhap ma the can huy: ");
        ma = sc.nextLine();
        int kt = 0;
        int vt=0;
        for (The the : arrayList_The) {
            if (the.getSoThe().equals(ma) == true) {
                vt=arrayList_The.indexOf(the);
                kt++;
                System.out.println("xoa thanh cong");
            }
        }
        arrayList_The.remove(vt);
        if(kt==0){
            System.out.println("khong tim thay!");
        }
    }

}

