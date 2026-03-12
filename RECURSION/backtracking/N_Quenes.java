public class N_Quenes {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        solve(board,n,0);
        
    }

    public static void solve(boolean[][] board, int tq, int row){
        if(tq == 0){
            Display(board);
            return;
        }

        for(int col=0; col<board[0].length; col++){
            if(isSafe(board,col,row)){
                board[row][col]=true;
                solve(board,tq-1, row+1);
                board[row][col]=false;
            }
        }
    }

    public static boolean isSafe(boolean[][] board, int col, int row){
        // right diagonal
        int r = row;
        int c = col;
        while(r>=0 && c<board[0].length){
            if(board[r][c] == true){
                return false;
            }
            r--;
            c++;
        }
        
        // left diagonal
        r = row;
        c = col;
        while(r>=0 && c>=0){
            if(board[r][c] == true){
                return false;
            }
            r--;
            c--;
        }

        // upp
        r = row;
        while(r>=0){
            if(board[r][col] == true){
                return false;
            }
            r--;
        }
        return true;

    }

    public static void Display(boolean[][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
