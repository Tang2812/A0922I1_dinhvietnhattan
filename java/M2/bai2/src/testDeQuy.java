
public class testDeQuy {
    public static int deQuy(int n, int k) {
        int s = 0;
        if(k>0) {
            for (int i = 1; i <= n; i++) {
                s = s + i * i;
            }
            return s+deQuy(n,k-1);
        }else{
            return 0;
        }
    }
    public static int check(int n,int[] arr){
        int t=arr[1]-arr[0];
        for (int i = 0; i <n-1 ; i++) {
            if((arr[i+1]-arr[i])!=t){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr= {1,4,7};
        System.out.println(testDeQuy.check(arr.length, arr));
//        System.out.println(testDeQuy.deQuy(3,1));
    }
}
