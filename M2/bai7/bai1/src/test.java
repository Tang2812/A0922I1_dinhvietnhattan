public class test {
    public static void main(String[] args) {
        Shape[] arr=new Shape[2];
        arr[0]=new Circle(3);
        arr[1]=new Rectangle(2,4);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("New: ");
        arr[0].resize(50);
        arr[1].resize(50);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
