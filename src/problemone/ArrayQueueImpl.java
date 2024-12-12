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
        if (size() == 1) { // if only one element in queue then decrease front to -1 to show empty queue after removal
            front = -1;
        }
        arr = Arrays.copyOfRange(arr, 1, arr.length); // make a new copy of the array with same length starting from position 1
        rear--; // decrease rear so it points to the new value
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
