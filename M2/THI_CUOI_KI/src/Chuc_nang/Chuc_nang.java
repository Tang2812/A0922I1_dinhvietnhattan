package Chuc_nang;

import Danh_ba.Danh_ba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Chuc_nang {
    public ArrayList<Danh_ba> listDanhBa = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public String path = "C:\\codeGym\\A0922I1_dinhvietnhattan\\M2\\THI_CUOI_KI\\src\\test";
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
                Danh_ba tmp = new Danh_ba(result);
                listDanhBa.add(tmp);
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
            for (Danh_ba tmp : listDanhBa) {
                pw.write(tmp.toString());
                pw.write("\r\n");
            }
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void themMoi() {
        ArrayList<Danh_ba> tmp1 = new ArrayList<>();
        this.listDanhBa = tmp1;
        this.docFile();
        Danh_ba tmp = new Danh_ba();
        tmp.nhap();
        listDanhBa.add(tmp);
        this.ghiFile(false);
    }

    public void xuat() {
        ArrayList<Danh_ba> tmp = new ArrayList<>();
        this.listDanhBa = tmp;
        this.docFile();
        int dem = 0;
        for (Danh_ba danh_ba : listDanhBa) {
            dem++;
            if (dem <= 5) {

                danh_ba.xuat1();
            } else {
                System.out.println("nhan enter de tiep tuc: ");
                sc.nextLine();
                dem = 0;
            }
        }
    }

    public void sua() {
        ArrayList<Danh_ba> tmp = new ArrayList<>();
        this.listDanhBa = tmp;
        this.docFile();
        String number;
        System.out.println("nhap vao so dien thoai can sua");
        String sdtbb = "0\\d{9}";
        number = sc.nextLine();
        while (true) {
            if (!number.matches(sdtbb)) {
                System.out.println("nhap sai dinh dang,nhap lai");
                number = sc.nextLine();
            } else {
                break;
            }
        }
        int kt = 0;
        for (Danh_ba danh_ba : listDanhBa) {
            if (danh_ba.getSoDienThoai().equals(number) == true) {
                kt++;
                danh_ba.capnhat();
            }
        }
        if (kt == 0) {
            System.out.println("khong tim thay so dien thoai!");
        }
        this.ghiFile(false);
    }

    public void xoa() {
        ArrayList<Danh_ba> tmp = new ArrayList<>();
        this.listDanhBa = tmp;
        this.docFile();
        String number;
        System.out.println("nhap vao so dien thoai can xoa");
        String sdtbb = "0\\d{9}";
        number = sc.nextLine();
        while (true) {
            if (number.matches(sdtbb) == false) {
                System.out.println("nhap sai dinh dang,nhap lai");
                number = sc.nextLine();
            } else {
                break;
            }
        }
        int kt = 0;
        int vt = 0;
        for (Danh_ba danh_ba : listDanhBa) {
            if (danh_ba.getSoDienThoai().equals(number) == true) {
                kt++;
                vt = listDanhBa.indexOf(danh_ba);
            }
        }

        if (kt == 0) {
            System.out.println("khong tim thay so dien thoai!");
        } else {
            System.out.println("xoa thanh cong");
            listDanhBa.remove(vt);
        }
        this.ghiFile(false);
    }

    public void tim_kiem_sdt() {
        ArrayList<Danh_ba> tmp = new ArrayList<>();
        this.listDanhBa = tmp;
        this.docFile();
        String number;
        System.out.println("nhap vao so dien thoai can tim ");
        String sdtbb = "0\\d{9}";
        number = sc.nextLine();
        while (true) {
            if (number.matches(sdtbb) == false) {
                System.out.println("nhap sai dinh dang,nhap lai");
                number = sc.nextLine();
            } else {
                break;
            }
        }
        int kt = 0;

        for (Danh_ba danh_ba : listDanhBa) {
            if (danh_ba.getSoDienThoai().equals(number) == true) {
                danh_ba.xuat();
                kt++;
            }
        }

        if (kt == 0) {
            System.out.println("khong tim thay so dien thoai!");
        }
    }

    public void tim_kiem_ten() {
        ArrayList<Danh_ba> tmp = new ArrayList<>();
        this.listDanhBa = tmp;
        this.docFile();
        String ten;
        System.out.println("nhap vao ho va ten can tim ");
        ten = sc.nextLine().toLowerCase();
        int kt = 0;

        for (Danh_ba danh_ba : listDanhBa) {
            if (danh_ba.getHoTen().toLowerCase().equals(ten) == true) {
                danh_ba.xuat();
                kt++;
            }
        }

        if (kt == 0) {
            System.out.println("khong tim thay ten nguoi dung!");
        }
    }

    public void tim_kiem() {
        int chon = 0;
        do {
            System.out.println("moi ban chon cach tim kiem: \r\n1.sdt\r\n2.ten\r\n3.thoat");
            try {
                chon = Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("nhap cho dung dinh dang");
            }
            switch (chon) {
                case 1:
                    this.tim_kiem_sdt();
                    break;
                case 2:
                    this.tim_kiem_ten();
                    break;
                default:
                    System.out.println("nhap sai!");
                case 3:
                    break;
            }
        } while (chon != 3);
    }

    public void doc_tu_file() {
        ArrayList<Danh_ba> tmp = new ArrayList<>();
        this.listDanhBa = tmp;
        this.docFile();
        for (Danh_ba danh_ba : listDanhBa) {
            danh_ba.xuat();
        }
    }

    public void viet_vao_file() {
        int chon=0;
            System.out.println("ban co chac chu?\r\n1.Chac chan\r\n2.Khong");
            try {
                chon= Integer.parseInt(sc.nextLine());

            }catch (Exception e){
                System.out.println("nhap dung dinh dang di");

            }
            switch (chon){
                case 1:
                    this.ghiFile(false);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("nhap sai!");
            }
        }
    }

