class CircularQueue {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue (add)
    public void enqueue(int x) {
        if (size == capacity) {
            System.out.println("Queue is Full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    // Dequeue (remove)
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    // Peek (see)
    public int peek() {
        if (size == 0)return -1;
        return arr[front];
    }

    // Display (IMPORTANT for understanding)
    public void display() {
        if (size == 0) {
            System.out.println("Queue is Empty");
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

// 👇 Driver class (same pattern as before)
public class Circular_Queue_using_array {
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display(); // 10 20 30 40 50

        q.dequeue();
        q.dequeue();

        q.display(); // 30 40 50

        q.enqueue(60);
        q.enqueue(70);

        q.display(); // 30 40 50 60 70
    }
}