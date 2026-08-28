class Solution {
    public int rob(int[] nums) {
        int[] memo = new int[nums.length + 1];
        Arrays.fill(memo, -1);
        return dfs(0, nums, memo);
    }

    private int dfs(int i, int[] nums, int[] memo) {
        if (i >= nums.length) {
            return 0;
        }

        if (memo[i] != -1) {
            return memo[i];
        }

        int right = nums[i] + dfs(i + 2, nums, memo);
        int left = dfs(i + 1, nums, memo);

        memo[i] = Math.max(right, left);

        return memo[i];
    }
}
