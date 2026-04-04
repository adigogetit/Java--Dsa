class SimpleQueue {
    int[] arr;
    int front;
    int rear;
    int capacity;

    public SimpleQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }

    public void enqueue(int x) {
        if (rear == capacity - 1) {
            System.out.println("Queue is Full");
            return;
        }
        arr[++rear] = x;
    }

    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front++];
    }

    public int peek() {
        if (front > rear) return -1;
        return arr[front];
    }
}

// Separate class 
public class Queue_using_array {
    public static void main(String[] args) {

        SimpleQueue q = new SimpleQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.peek());    // 20

        q.enqueue(40);
        q.enqueue(50);
    }
}