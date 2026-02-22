public class LinkedList1 {

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
    public static int size;

    // add at beginning (o(1))
    public void addFirst(int data) {
        // crate new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
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

        tail.next = newNode;
        tail = newNode;
    }
 
    // add at middle (0-based index)  (O(n))
    public void addMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        // if index is greater than length, add at end
        if (temp == null || temp.next == null) {
            addLast(data);
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }    

    // remove from first (O(n))
    public int removeFirst(){
        // if no element in list
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
        // if only one element is there
        if(size == 1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        // otherwise this 
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove from last (O(n))
    public int removeLast(){
        // if no element in list
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
        // if only one element is there
        if(size == 1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        
        // otherwise this 
        Node prev = head;
        for(int i=0; i<size-2;i++){
            prev=prev.next;
        }

        int val = prev.next.data; // tail data
        prev.next = null;
        size--;
        return val;       
    }

    // print list - (o(n)) linear tc
    public void printList() {

        if(head == null){
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
        LinkedList1 list = new LinkedList1();

        list.addFirst(10);
        list.addFirst(20);

        list.addLast(30);
        list.addLast(40);

        list.addMiddle(2,100);

        list.printList();
        System.out.println(list.size);

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.printList();
    }
}
