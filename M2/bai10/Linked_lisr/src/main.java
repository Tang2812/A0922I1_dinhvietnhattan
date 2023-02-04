public class main {
    public static void main(String[] args) {
        MyLinkedList<Integer> l=new MyLinkedList<>(2);
        l.add(0,1);
        l.addFirst(3);
        l.addLast(6);

        System.out.println(l.getFirst());
    }
}
