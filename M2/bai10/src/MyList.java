import java.util.Objects;

public class MyList<E> {

    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    void add(int index, E element) {
        Objects[] newElements;
        this.size = this.size +1;
        if (this.size+1 > this.elements.length) {
            newElements = (Objects[]) new Object[(int) (this.elements.length * 1.5)];
            this.elements = newElements;
        }
        for (int i = index; i < this.size; i++) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[index] = element;
    }
   void  reMove(int index){
        for (int i = index; i <this.size ; i++) {
            this.elements[i]=this.elements[i+1];
        }
        this.elements[--size]=null;
       // return (Objects[]) this.elements;
    }
    int size(){
        return size;
    }
     Object[] clone1(){
        return this.elements;
    }
    boolean contain(E o){
        for (int i = 0; i < this.size; i++) {
            if(this.elements[i]==o){
                return true;
            }
        }
        return false;
    }
    int indexOf(E o){
        for (int i = 0; i < this.size; i++) {
            if(this.elements[i]==o){
                return i;
            }
        }
        return -1;
    }
    void ensureCapacity(){
        Objects[] newElement= (Objects[]) new Object[(int) (this.elements.length*1.5)];
    }
    E get(int i){
        return (E) this.elements[i];
    }
    void clear(){
        for (int i = 0; i <this.size ; i++) {
            this.elements[i]=null;
        }
        this.size=0;
    }
}
