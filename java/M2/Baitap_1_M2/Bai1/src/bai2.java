import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int num1;
        System.out.println("Input number: ");
        Scanner sc= new Scanner(System.in);
        num1=Integer.parseInt(sc.nextLine());
        int num=num1;
        int a=num/100;
        num=num%100;
        int b=num/10;
        int c=num%10;
        String str="";
        String tr="";
        String ch="";
        String dv="";
        switch (a){
            case 1:
                tr="One hundred";
                break;
            case 2:
                tr="Two hundred";
                break;
            case 3:
                tr="Three hundred";
                break;
            case 4:
                tr="Four hundred";
                break;
            case 5:
                tr="Five hundred";
                break;
            case 6:
                tr="Six hundred";
                break;
            case 7:
                tr="Seven hundred";
                break;
            case 8:
                tr="Eight hundred";
                break;
            case 9:
                tr="Nine hundred";
                break;
            default:
                tr="";
                break;
        }
        if(b==1){
            switch (c){
                case 1:
                    ch="Eleven";
                    break;
                case 2:
                    ch="Twelve";
                    break;
                case 3:
                    ch="thirteen";
                    break;
                case 4:
                    ch="fourteen";
                    break;
                case 5:
                    ch="fifteen";
                    break;
                case 6:
                    ch="sixteen";
                    break;
                case 7:
                    ch="seventeen";
                    break;
                case 8:
                    ch="eighteen";
                    break;
                case 9:
                    ch="nineteen";
                    break;
                default:
                    ch="ten";
                break;
            }
        }else{
            switch (b){
                case 2:
                    ch="twenty";
                    break;
                case 3:
                    ch="thirty";
                    break;
                case 4:
                    ch="forty";
                    break;
                case 5:
                    ch="fifty";
                    break;
                case 6:
                    ch="sixty";
                    break;
                case 7:
                    ch="seventy";
                    break;
                case 8:
                    ch="eighty";
                    break;
                case 9:
                    ch="ninety";
                    break;
                default:
                    ch="";
                    break;
            }
            switch (c){
                case 1:
                    dv="one";
                    break;
                case 2:
                    dv="two";
                    break;
                case 3:
                    dv="three";
                    break;
                case 4:
                    dv="four";
                    break;
                case 5:
                    dv="five";
                    break;
                case 6:
                    dv="six";
                    break;
                case 7:
                    dv="seven";
                    break;
                case 8:
                    dv="eight";
                    break;
                case 9:
                    dv="nine";
                    break;
            }
        }
        if(b==0 && c==0){
            str=tr;
        }else{
            str=tr+" and "+ch+" "+dv;
        }
        System.out.println(str);
    }
}
