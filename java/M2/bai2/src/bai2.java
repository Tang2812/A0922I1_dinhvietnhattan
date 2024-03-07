public class bai2 {
    public static void main(String[] args) {
        int dem=0;
        int num=2;
        while(dem<20){
            boolean check=true;
            if(num<2){
                check=false;
            }else{
                for (int i=2;i<num;i++){
                    if(num%i==0){
                        check=false;
                    }
                }
            }
            if(check==true){
                System.out.println(num+" ");
                dem++;
            }
            num++;
        }
    }
}
