class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int L = 2;
        for (int R = 2; R < nums.length; R++) {
            if (nums[R] != nums[L - 2]) {
                nums[L] = nums[R];
                L++;
            }

        }

        return L;
    }
}