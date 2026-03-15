import java.util.Stack;

public class Celebraity_Problem {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 1, 0},
                       {0, 0, 1, 0},
                       {0, 0, 0, 0},
                       {0, 0, 1, 0}};
        int n = arr.length;
        int celebrity = celebrity(arr, n);
        if (celebrity == -1) {
            System.out.println("No celebrity found.");
        } else {
            System.out.println("The celebrity is person " + celebrity);
        }
    }
    public static int celebrity(int[][] M, int n) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++)stack.push(i);

        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();

            if (M[a][b] == 1)stack.push(b);
            else stack.push(a);
        }

        int cand = stack.pop();
        
        for (int i = 0; i < n; i++) {
            if (i != cand) {
                if (M[cand][i] == 1 || M[i][cand] == 0) return -1;
            }
        }
        return cand;
    }
}
