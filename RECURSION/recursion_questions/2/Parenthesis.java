public class Parenthesis {
    public static void main(String[] args) {
        par(3, 0, 0, "");
    }

    public static void par(int n, int open, int closed, String ans) {
        if (open == n && closed == n) {
            System.out.println(ans);
            return;
        }

        if (open > n || closed > open)
            return;

        // open add
        par(n, open + 1, closed, ans + "(");
        // closed add
        par(n, open, closed + 1, ans + ")");
    }


    // Using ArrayList

    // public static void main(String[] args) {
    //     List<String> res = new ArrayList<>();
    //     par(3, 0, 0, "", res);
    //     System.out.println(res);
    // }

    // public static void par(int n, int open, int closed, String ans, List<String> res) {
    //     if (open == n && closed == n) {
    //         // System.out.println(ans);
    //         res.add(ans);
    //         return;
    //     }

    //     if (open > n || closed > open)
    //         return;

    //     // open add
    //     par(n, open + 1, closed, ans + "(", res);
    //     // closed add
    //     par(n, open, closed + 1, ans + ")", res);
    // }
}
