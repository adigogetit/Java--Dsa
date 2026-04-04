import java.util.Stack;
// stack use vector
public class inbuilt {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.capacity());

        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);

        // print use foreach loop
        for (int x : st) {
            System.out.print(x+" ");
        }

    }
}