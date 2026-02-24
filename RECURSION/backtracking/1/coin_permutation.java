public class coin_permutation {
    public static void main(String[] args) {
        int[] coins = { 2, 3, 5 };
        int target = 8;
        coinP(coins, target, "");
    }

    // no bactracking in this question
    static void coinP(int[] coins, int target, String ans) {
        if (target == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= target) {
                coinP(coins, target-coins[i], ans+coins[i]);
            }
        }
    }
}
