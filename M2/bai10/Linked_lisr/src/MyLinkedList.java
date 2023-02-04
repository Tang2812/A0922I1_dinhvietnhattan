public class MyLinkedList<E> {
    private Node head;
    private  int numNodes;
    public MyLinkedList(E data){
        this.head=new Node(data);
    }
    public void add(int index, E element){
        Node temp=head;
        Node holder;
        for(int i=0;i<index-1 && temp.next != null;i++){
            temp=temp.next;
        }
        holder=temp.next;
        temp.next=new Node(element);
        temp.next.next=holder;
        numNodes++;
    }
    public void addFirst(E e){
        Node temp=head;
        head = new Node(e);
        head.next=temp;
        numNodes++;
    }
    public  void addLast(E e){
        Node temp=head;
        Node hoder;
        for (int i = 0; i < numNodes-1 && temp.next!= null ; i++) {
            temp=temp.next;
        }
        temp.next=new Node(e);
        numNodes++;
    }
//    public E remove(int index){
//
//    }
    public int size(){
        return this.numNodes;
    }
//    public E clone(){
//        return this.head;
//    }
    boolean contains (E o){
        Node temp=head;
        for (int i = 0; i <this.numNodes ; i++) {
            if(temp.data==o){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public int indexOf(E o){
        Node temp=head;
        for (int i = 0; i <this.numNodes ; i++) {
            if(temp.data==o){
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }
    public E get(int index){
        Node temp=head;
        for (int i = 0; i <index ; i++) {
            temp=temp.next;
        }
        return (E) temp.data;
    }
    public  E getFirst(){
        return (E) head.data;
    }
    public  E getLast(){
        Node temp=head;
        for (int i = 0; i < this.numNodes; i++) {
            temp=temp.next;
        }
        return (E) temp;
    }
}
