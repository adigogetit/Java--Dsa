class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueLL {
    Node front;
    Node rear;
    // add
    public void enqueue(int x) {
        Node newNode = new Node(x);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // remove
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int val = front.data;
        front = front.next;

        if(front == null)rear = null;

        return val;
    }

    // see
    public int peek() {
        if (front == null) return -1;
        return front.data;
    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


// ✅ Only ONE public class
public class Queue_using_LL {
    public static void main(String[] args) {

        QueueLL q = new QueueLL();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display(); // 10 20 30

        System.out.println(q.dequeue()); // 10

        q.display(); // 20 30

        System.out.println(q.peek()); // 20
    }
}