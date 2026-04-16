public class LinkedList3 {
    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    // add at beginning (o(1))
    public void addFirst(int data) {
        // crate new node
        Node newNode = new Node(data);
        size++;

        // if no data is there
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // head ko ek step picha kar diya and newNode sabse aage aa gaya
        newNode.next = head;
        // sabse aage wale ko head bana diya
        head = newNode;
    }

    // add at end (O(1))
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // tail ke next ko new node bana diya and newNOde sabse picha hoo gaya
        tail.next = newNode;
        // sabse picha jo abhi newnode bana hai uske tail bana do
        tail = newNode;
    }

    // add at index
    public void addati(int key, int item) {
        if (key == 0)
            addFirst(item);
        else if (key == size - 1)
            addLast(item);
        else {
            Node newNode = new Node(item);
            Node prev = head;
            for (int i = 0; i < key - 1; i++) {
                prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
            size++;
        }
    }

    // remove from first (O(n))
    public int removeFirst() {
        // if no element in list
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
        // if only one element is there
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // otherwise this
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove from last (O(n))
    public int removeLast() {
        // if no element in list
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
        // if only one element is there
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // otherwise this
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail data
        prev.next = null;
        size--;
        return val;
    }

    // remove at index
    public void removeati(int key){
        if (key == 0) removeFirst();
        else if (key == size - 1) removeLast();
        else {
            Node prev = head;
            for (int i = 0; i < key - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
            size--;
        }
    }

    // print list - (o(n)) linear tc
    public void printList() {

        if (head == null) {
            System.out.println("LL is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList3 list = new LinkedList3();

        list.addFirst(10);
        list.addFirst(20);

        list.addLast(30);
        list.addLast(40);

        int key1 = 1;
        // add at index
        list.addati(key1, 70);

        // remove at index
        list.removeati(2);

        list.printList();

    }
}
