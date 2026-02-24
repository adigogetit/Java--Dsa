public class coin_combination {
    public static void main(String[] args) {
        int[] coins = { 2, 3, 6, 7 };
        int target = 7;
        coinP(coins, target, "" , 0);
    }

    // no bactracking in this question/
    static void coinP(int[] coins, int target, String ans, int idx) {
        if (target == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = idx; i < coins.length; i++) {
            if (coins[i] <= target) {
                coinP(coins, target-coins[i], ans+coins[i] , i) ;
            }
        }
    }
}
