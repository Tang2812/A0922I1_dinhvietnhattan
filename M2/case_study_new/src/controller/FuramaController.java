package controller;

import CustoomerManagement.CustomerManagement;
import EmployeeManagement.EmployeeServiceImpl;
import FacilityService.FacilityService;
import dichvu.DichVu;
import nguoi.Khachhang;
import nguoi.Nhanvien;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;
public class FuramaController {
    public void EmployeeManagement(ArrayList<Nhanvien> arrL) {
        int chon = 0;
        Scanner sc=new Scanner(System.in);
        EmployeeServiceImpl emp= new EmployeeServiceImpl();
        do{
        System.out.println("1\tAdd new employee\n" +
                "2\tDisplay list employees\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n");
        chon=Integer.parseInt(sc.nextLine());
        switch (chon){
            case 1:
                emp.nhap(arrL);
                break;
            case 2:
                emp.xuat(arrL);
                break;
            case 3:
                emp.edit(arrL);
                break;
            default:
                System.out.println("nhap lai");
        }

        }while (chon!=4);
    }

    public void CustomerManagement(LinkedList<Khachhang> lkL) {

        int chon = 0;
        Scanner sc=new Scanner(System.in);
        CustomerManagement ctm= new CustomerManagement();
        do{
            System.out.println("1.\tAdd new customer\n" +
                    "2.\tDisplay list customers\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
        chon=Integer.parseInt(sc.nextLine());
        switch (chon){
            case 1:
                ctm.nhap(lkL);
                break;
            case 2:
                ctm.xuat(lkL);
                break;
            case 3:
                ctm.edit(lkL);
                break;
            default:
                System.out.println("nhap lai");
        }

    }while (chon!=4);
    }
    public void FacilityManagement(LinkedHashMap<DichVu,Integer> lkHM){
        FacilityService fS=new FacilityService();
        int chon=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            chon=Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                   fS.xuat();
                   break;
                case 2:
                    fS.nhap(lkHM);
            break;
                case 3:
                    fS.displayMaintenance(lkHM);
                    break;
            }
        }while (chon!=4);
    }
    public void BookingManagement() {
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new constracts\n" +
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu\n");
    }

    public void PromotionManagement() {
        System.out.println("1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
    }

    public void displayMainMenu(ArrayList<Nhanvien> arrLE, LinkedList<Khachhang> lkL,LinkedHashMap<DichVu, Integer> lkHM) {
        int chon = 0;
        Scanner sc=new Scanner(System.in);
        while (chon != 6) {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            chon=Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    EmployeeManagement(arrLE);
                    break;
                case 2:
                    CustomerManagement( lkL);
                    break;
                case 3:
                    FacilityManagement(lkHM);
                    break;
                case 4:
                    BookingManagement();
                    break;
                case 5:
                    PromotionManagement();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Error!");
            }
        }
    }
}
