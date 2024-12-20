package problemone;

import java.util.Arrays;

public class ArrayQueueImpl {

    private int[] arr = new int[10];
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
            rear = 0;
            arr[rear] = obj;
        } else {
            rear++;
            arr[rear] = obj;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int removedElement = arr[front];
        front = front + 1;
        if (front > rear) {
            front = -1;
            rear = 0;
        }
        return removedElement;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return (rear - front) + 1;
    }

    private void resize() {
        int len = arr.length;
        int newLen = 2 * len;
        arr = Arrays.copyOf(arr, newLen);

    }
}
