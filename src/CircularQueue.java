import java.util.NoSuchElementException;

public class CircularQueue {
    Node rear;
    public CircularQueue(Node rear){
        this.rear = rear;
        if(this.rear != null){
            this.rear.next = this.rear;
        }
    }
    public void enqueue(int data){
        Node n = new Node(data);
        if(rear == null){
            n.next = n;
        }
        else{
            n.next = rear.next;
            rear.next = n;
        }
        rear = n;
    }
    public  int dequeue(){
        if(rear == null)
            throw new NoSuchElementException();
        int temp = rear.next.data;
        if(rear.next == rear)
            rear = null;
        else
            rear.next = rear.next.next;
        return  temp;
    }
    public int peek(){
        if(rear == null)
             throw new NoSuchElementException();
        return  rear.next.data;
    }
    public boolean isEmpty(){
        return rear == null;
    }
}




