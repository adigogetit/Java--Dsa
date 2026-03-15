public class LinkedList2 {

    // Node class
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

    // add at end
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // ITERATIVE SEARCH
    public int iterativeSearch(int key) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    // RECURSIVE SEARCH (helper)
    public int recursiveSearchHelper(Node node, int key, int index) {
        if (node == null) {
            return -1;
        }

        if (node.data == key) {
            return index;
        }

        return recursiveSearchHelper(node.next, key, index + 1);
    }

    // RECURSIVE SEARCH (main)
    public int recursiveSearch(int key) {
        return recursiveSearchHelper(head, key, 0);
    }

    // print list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.printList();

        int key1 = 30;
        System.out.println(list.iterativeSearch(key1));
    
        int key2 = 40;
        System.out.println(list.recursiveSearch(key2));
    }

}
