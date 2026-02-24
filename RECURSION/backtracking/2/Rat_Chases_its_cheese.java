import java.util.Scanner;

public class Rat_Chases_its_cheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] maze = new char[n][m];
        for (int i = 0; i < maze.length; i++) {
            String s = sc.next();
            for (int j = 0; j < maze[0].length; j++) {
                maze[i][j] = s.charAt(j);
            }
        }

        int[][] ans = new int[n][m];
        Print(maze, 0, 0, ans);

        if (val == 0)
            System.out.println("NO PATH FOUND");
    }

    static int val = 0;

    public static void Print(char[][] maze, int cr, int cc, int[][] ans) {

        if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X')
            return;

        if (cr == maze.length - 1 && cc == maze[0].length - 1) {
            ans[cr][cc] = 1;
            val = 1;
            Display(ans);
            return;
        }

        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;

        Print(maze, cr - 1, cc, ans); // up
        Print(maze, cr, cc - 1, ans); // left
        Print(maze, cr + 1, cc, ans); // down
        Print(maze, cr, cc + 1, ans); // right

        ans[cr][cc] = 0;
        maze[cr][cc] = 'O';
    }

    public static void Display(int[][] ans) {

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
