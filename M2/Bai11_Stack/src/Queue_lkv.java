public class Queue_lkv {
    class Node{
        int data;
        Node link;
        public  Node(int key){
            this.data=key;
            this.link=null;
        }
    }
    class Queue{
        Node front;
        Node rear;
        void enQueue(int key){
            Node tmp=new Node(key);
            if(this.rear==null){
                this.front=this.rear=tmp;
            }else{
                this.rear=tmp;
            }
            this.rear.link=tmp;

        }
        Node deQueue(){
            if(this.front==null){
             return null;
            }
            Node tmp=this.front;
            this.front=this.front.link;
            if(this.front==null){
                this.rear = null;
            }
            return  tmp;
        }
        void display(){
            Node tmp=this.front;
            while (tmp!= this.rear){
                System.out.println(tmp.data);
            }
            System.out.println(this.rear.data);
        }
    }

    public void main(String[] args) {
        Queue queue=new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.display();
        queue.deQueue();
        queue.display();
    }
}
