import java.util.*;

class Deque {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    public Deque(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // insert at front
    public void insertFront(int x) {
        if (size == capacity) {
            System.out.println("Deque is Full");
            return;
        }

        front = (front - 1 + capacity) % capacity;
        arr[front] = x;
        size++;
    }

    // insert at rear
    public void insertRear(int x) {
        if (size == capacity) {
            System.out.println("Deque is Full");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    // delete from front
    public int deleteFront() {
        if (size == 0) {
            System.out.println("Deque is Empty");
            return -1;
        }

        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    // delete from rear
    public int deleteRear() {
        if (size == 0) {
            System.out.println("Deque is Empty");
            return -1;
        }

        int val = arr[rear];
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return val;
    }

    // get front
    public int getFront() {
        if (size == 0) return -1;
        return arr[front];
    }

    // get rear
    public int getRear() {
        if (size == 0) return -1;
        return arr[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    // display
    public void display() {
        if (size == 0) {
            System.out.println("Empty");
            return;
        }

        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
}


// 👇 MAIN CLASS (IMPORTANT)
public class Main {
    public static void main(String[] args) {

        // here we are not using java's built in Deque, we are creating our own Deque class and using it here
        Deque dq = new Deque(5);

        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertRear(30);

        dq.display(); // 10 20 30

        dq.insertFront(5);
        dq.insertFront(2);

        dq.display(); // 2 5 10 20 30

        dq.deleteFront();
        dq.deleteRear();

        dq.display(); // 5 10 20

        System.out.println("Front: " + dq.getFront()); // 5
        System.out.println("Rear: " + dq.getRear());   // 20
    }
}