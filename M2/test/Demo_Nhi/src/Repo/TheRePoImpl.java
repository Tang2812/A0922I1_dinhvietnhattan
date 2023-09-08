package Repo;

import model.ATM;
import model.Credit;
import model.The;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheRePoImpl implements TheRepo {
//    List<The> theList = new ArrayList<>();

    void docFile(List<The> theList) throws IOException {
        File file = new File("C:\\codeGym\\A09\\A0922I1_dinhvietnhattan\\M2\\test\\Demo_Nhi\\src\\The");
        String str = null;
        BufferedReader reader = Files.newBufferedReader(file.toPath());
//        while (true) {
//            str = reader.readLine();
//            if (str == null) {
//                break;
//            }
//            String[] tmp = str.split(",");
//            if (tmp.length == 5) {
//                ATM atm=new ATM(tmp);
//                theList.add(atm);
//            }
//            if (tmp.length == 6) {
//                Credit credit=new Credit(tmp);
//                theList.add(credit);
//            }
//        }
        while (true){
            str=reader.readLine();
            if(str==null){
                break;
            }
            String[] tmp=str.split(",");
            if(tmp.length==5){
                ATM atm=new ATM(tmp);
                theList.add(atm);
            }
            if(tmp.length==6){
                Credit credit= new Credit(tmp);
                theList.add(credit);
            }
        }
    }
    public void ghiFile(List<The> theList, boolean type){
        File file = new File("C:\\codeGym\\A09\\A0922I1_dinhvietnhattan\\M2\\test\\Demo_Nhi\\src\\The");
        try {
            FileWriter pw = new FileWriter(file.getPath(), type);
            for (The tmp : theList) {
                pw.write(tmp.toString());
                pw.write("\r\n");
            }
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void timKiem(List<The> list) {

    }

    @Override
    public void chuyenTien(List<The> list) {

    }

    @Override
    public void dangKi(List<The> list) throws IOException {
    docFile(list);
        System.out.println("nhap atm hay credit");
        Scanner sc=new Scanner(System.in);
        int chon= sc.nextInt();
        switch (chon){
            case 1:
                ATM atm=new ATM();
                atm.nhap();
                list.add(atm);
        ghiFile(list,false);
        break;
            case 2:
                Credit credit=new Credit();
                credit.nhap();
                list.add(credit);
                ghiFile(list,false);
        break;
        }

    }
}
