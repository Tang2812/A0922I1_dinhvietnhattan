public class Main {
    public static void main(String[] args) {
        MyList<Integer> a = new MyList<>();
        a.add(0,1);
        a.add(1,3);
        System.out.println(a.size());
        a.reMove(1);
        System.out.println(a.size());
        System.out.println(a.get(1));
    }
}