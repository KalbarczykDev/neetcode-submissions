class Solution {
    public int climbStairs(int n) {
        int[] cache = new int[n + 1];
        return help(0, n, cache);
    }

    private int help(int i, int n, int[] cache) {

        if(i == n){
            return 1;
        }

        if(i > n){
            return 0;
        }

        if (cache[i] != 0) {
            return cache[i];
        }

        int res = help(i + 1, n, cache) + help(i + 2, n,cache);
        cache[i] = res;
        return res;

    }
}
