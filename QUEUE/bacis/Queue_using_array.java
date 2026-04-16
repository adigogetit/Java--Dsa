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

    public boolean isEmpty() { // O(1)
        return rear == -1;
    }

    public void enqueue(int x) { // add O(1)
        if (rear == capacity - 1) {
            System.out.println("Queue is Full");
            return;
        }
        rear = rear + 1;
        arr[rear] = x;
    }

    public int dequeue() { // remove O(1)
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int val = arr[front];
        front = front + 1;
        return val;
    }

    public int peek() { // see O(1)
        if (front > rear) return -1;
        return arr[front];
    }

    public void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Separate class
public class Queue_using_array {
    public static void main(String[] args) {

        SimpleQueue q = new SimpleQueue(5);

        System.out.println(q.isEmpty());
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.isEmpty());

        System.out.println(q.dequeue()); // 10
        System.out.println(q.peek()); // 20

        q.display();
        
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.dequeue());

        q.display();
        
    }
}