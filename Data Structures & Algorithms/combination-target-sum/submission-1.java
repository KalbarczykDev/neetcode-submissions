class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, new ArrayList<>(), target, res, nums);
        return res;
    }

    private void dfs(int i, List<Integer> cur, int remaining, List<List<Integer>> res, int[] nums) {
        if (remaining == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (i >= nums.length || remaining < 0) {
            return;
        }
        cur.add(nums[i]);
        dfs(i, cur, remaining - nums[i], res, nums);
        cur.remove(cur.size() - 1);
        dfs(i + 1, cur, remaining, res, nums);
    }
}
