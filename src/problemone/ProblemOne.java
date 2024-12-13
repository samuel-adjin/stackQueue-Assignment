package problemone;

public class ProblemOne {
    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        System.out.println("Size: " + queue.size());
        queue.enqueue(10);
        queue.enqueue(101);
        queue.enqueue(16);
        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        queue.enqueue(16);
        queue.enqueue(516);
        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
        queue.enqueue(23);
        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
    }
}
