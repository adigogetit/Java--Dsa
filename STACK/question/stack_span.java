import java.util.Stack;

public class stack_span {
    public static void main(String[] args) {
        int[] stack = {100,80,60,70,60,85,100};
        int n = stack.length;

        int[] span = new int[n];
        Stack<Integer> s = new Stack<>();

        span[0]=1;
        s.push(0);

        for(int i=1;i<n;i++){
            while(!s.empty() && stack[i] >= stack[s.peek()]){
                s.pop();
            }

            if(s.empty()){
                span[i]=i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i- prevHigh;
            }
            s.push(i);
        }

        for(int i=0;i<n;i++){
            System.out.println(span[i]+" ");
        }
    }
}
