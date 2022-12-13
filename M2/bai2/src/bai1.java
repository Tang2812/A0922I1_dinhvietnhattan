import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int chon;
        Scanner sc= new Scanner(System.in);
        boolean check=true;
        while(check==true){
            System.out.println("Menu:\n" +
                    "\n" +
                    "Print the rectangle\n" +
                    "\n" +
                    "Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                    "\n" +
                    "Print isosceles triangle\n" +
                    "\n" +
                    "Exit\n");
            System.out.println("input your choice: ");
            chon=Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    for (int w = 1; w <= 4; w++)
                    {
                        for (int h = 1; h <= 6; h++)
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for(int i=0; i<5; i++)
                    {
                        for(int j=0; j<=i; j++)
                        {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    ///////////////////////////////
                    for (int i=0; i<5; i++)
                    {
                        for (int j=2*(5-i); j>=0; j--)
                        {

                            System.out.print(" ");
                        }
                        for (int j=0; j<=i; j++ )
                        {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    /////////////////////////////////////
                    int row=5;
                    for (int i= row; i>= 1; i--)
                    {
                        for (int j=row; j>i;j--)
                        {
                            System.out.print(" ");
                        }
                        for (int k=1;k<=i;k++)
                        {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    ///////////////////////////////
                    break;
                case 3:
                    int rows=5;
                    for (int i = 1; i <= rows; i++) {

                        // loop to print the number of spaces before the star
                        for (int j = rows; j >= i; j--) {
                            System.out.print(" ");
                        }

                        // loop to print the number of stars in each row
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }

                        // for new line after printing each row
                        System.out.println();
                    }
                    break;
                case 4:
                    check= false;
                    break;
                default:
                    System.out.println("error!");
                    break;
            }
        }
    }
}

