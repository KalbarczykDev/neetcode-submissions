class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int L = 0;
        int total = 0;
        int length = Integer.MAX_VALUE;

        for (int R = 0; R < nums.length; R++) {
            total += nums[R];
            while (total >= target) {
                int current = R - L + 1;
                length = Math.min(current, length);
                total -= nums[L];
                L++;
            }
        }

        if(Integer.MAX_VALUE == length){
            return 0;
        }

        return length;
    }
}