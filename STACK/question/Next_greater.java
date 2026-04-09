import java.util.Stack;

public class Next_greater {
    public static void main(String[] args) {
        int[] arr = {4,5,2,10,2};

        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];

        for(int i=n-1; i>=0; i--){

            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            
            if(stack.isEmpty())res[i]=-1;
            else res[i]=stack.peek();

            stack.push(arr[i]);
        }

        for(int i=0;i<n;i++){
            System.out.println(res[i]+" ");
        }
        
    }
    
}
