package controllers;

import java.util.Scanner;

public class FuramaController {
    public void EmployeeManagement() {
        System.out.println("1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n");
    }

    public void CustomerManagement() {
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n");
    }
public void FacilityManagement(){
    System.out.println("1\tDisplay list facility\n" +
            "2\tAdd new facility\n" +
            "3\tDisplay list facility maintenance\n" +
            "4\tReturn main menu\n");
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

    public void displayMainMenu() {
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
                    EmployeeManagement();
                    break;
                case 2:
                    CustomerManagement();
                    break;
                case 3:
                    FacilityManagement();
                    break;
                case 4:
                BookingManagement();
                break;
                case 5:
                    PromotionManagement();
                    break;
                default:
                    System.out.println("Error!");
            }
        }
    }
}
