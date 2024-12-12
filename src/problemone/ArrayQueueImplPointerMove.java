package problemone;

import java.util.Arrays;

public class ArrayQueueImplPointerMove {

    private int[] arr = new int[1];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void enqueue(int obj) {
        if (size() == arr.length) {
            resize();
        }
        if (isEmpty()) {
            front = 0;
            arr[rear] = obj;
            return;
        }
        rear++;
        arr[rear] = obj;

    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int removedElement = arr[front];
        front = front + 1;
        if(front > rear){
            front = -1;
            rear = 0;
        }
        return removedElement;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int size() {
        return isEmpty() ? rear: rear+1 ;
    }

    private void resize() {
        int len = arr.length;// Original array length
        int newLen = 2 * len; // Twice the original length
        arr = Arrays.copyOf(arr, newLen);

    }
}
