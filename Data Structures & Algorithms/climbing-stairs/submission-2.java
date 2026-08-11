class Solution {
    public int climbStairs(int n) {
        Integer[] memo = new Integer[n + 1];
        return ways(n, 0, memo);
    }

    private int ways(int n, int i, Integer[] memo) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] != null) {
            return memo[i];
        }
        return memo[i] = ways(n, i + 1, memo) + ways(n, i + 2, memo);
    }
}
