class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int globMax = nums[0];
        int globMin = nums[0];

        int curMax = 0;
        int curMin = 0;
        int total = 0;

        for (int num : nums) {
            curMax = Math.max(curMax + num, num);
            curMin = Math.min(curMin + num, num);
            total += num;

            globMax = Math.max(globMax, curMax);
            globMin = Math.min(globMin, curMin);
        }

        if (globMax > 0) {
            return Math.max(globMax, total - globMin);
        } else {
            return globMax;
        }
    }
}