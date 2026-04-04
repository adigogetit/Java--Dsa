public class Stack {
    private int[] arr;
    private int idx = -1;

    public Stack() {
        this(5);
    }

    public Stack(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return idx == -1;
    }

    public boolean isfull() {
        return size() == arr.length;
    }

    public void push(int x) throws Exception {
        if (isfull()) {
            throw new Exception("Stack is full");
        }
        arr[++idx] = x;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return arr[idx--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return arr[idx];
    }

    public void Display() {
        for (int i = 0; i <= idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return idx + 1;
    }
}