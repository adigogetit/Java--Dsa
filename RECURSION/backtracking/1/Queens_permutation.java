public class Queens_permutation {
    public static void main(String[] args) {
        
        int n=4;
        boolean []board=new boolean[n];
        int tq=2;

        queen(board, tq, "", 0);
    }
    public static void queen(boolean[]board,int tq,String ans,int q){
        if(q==tq){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i]==false){
                board[i]=true;  
                queen(board, tq, ans+" b"+i+"q"+q ,q+1); 
                board[i]=false; // when we remove something after recursion hard codedly then it is called backtracting 
            }
        }
    }

}