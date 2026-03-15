import java.util.Scanner;

public class chessboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(0, 0, n-1, n-1, "");
        System.out.println();
        System.out.println(count);
    }

    static int count = 0;
    public static void solve(int cr, int cc, int er, int ec, String ans){
        if(cr>er || cc>ec)return;
        if(cr == er && cc == ec){
            System.out.println(ans+"{"+cr+"-"+cc+"}"+" ");
            count++;
        }

        // Knight
        solve(cr+2, cc+1, er, ec, ans+"{"+cr+"-"+cc+"}K");
        solve(cr+1, cc+2, er, ec, ans+"{"+cr+"-"+cc+"}K");

        // rook
        if(cr==0 || cc==0 || cr==er || cc==ec){

            // horizontally
            for(int i=1; i<=ec; i++){
                solve(cr, cc+i, er, ec, ans+"{"+cr+"-"+cc+"}R");
            }
            // vertically
            for(int i=1; i<=ec; i++){
                solve(cr+i, cc, er, ec, ans+"{"+cr+"-"+cc+"}R");
            }
        }

        // bishop
        if(cr==cc || cr+cc==ec){
            for(int i=1; i<=ec; i++){
                solve(cr+i, cc+i, er, ec, ans+"{"+cr+"-"+cc+"}B");
            }
        }
    }
}
