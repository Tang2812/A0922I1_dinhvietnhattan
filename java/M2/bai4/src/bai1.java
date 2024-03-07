import java.util.Scanner;

class QuadraticEquation{
    private float a;
    private float b;
    private float c;

    public QuadraticEquation() {
    }
    public QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }
    float getDiscriminant(){
        float delta=b*b-4*a*c;
        return delta;
    }
    double getRoot1(){
        double r1= ((-b)+Math.sqrt(getDiscriminant()))/(2*a);
        return r1;
    }
    double getRoot2(){
        double r2= ((-b)-Math.sqrt(getDiscriminant()))/(2*a);
        return r2;
    }
    void result(){
        if(getDiscriminant()>=0){
            System.out.println("the root1 is: "+getRoot1());
            System.out.println("the root2 is: "+getRoot2());
        }else{
            System.out.println("no root");
        }
    }
}
public class bai1{
    public static void main(String[] args) {
        float a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("input a: ");
        a=Float.parseFloat(sc.nextLine());
        System.out.println("input b: ");
        b=Float.parseFloat(sc.nextLine());
        System.out.println("input c: ");
        c=Float.parseFloat(sc.nextLine());
        QuadraticEquation quad=new QuadraticEquation(a,b,c);
        quad.result();
    }
}
