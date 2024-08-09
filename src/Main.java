public class Main {
    public static void main(String[] args) {
      CircularQueue circularQueue = new CircularQueue(null);
      circularQueue.enqueue(1);
      circularQueue.enqueue(2);
      circularQueue.enqueue(3);
        System.out.println(circularQueue.peek());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.isEmpty());
        circularQueue.enqueue(4);
        circularQueue.enqueue(5);
        while (!circularQueue.isEmpty()){
            System.out.println(circularQueue.dequeue());
        }
    }

}