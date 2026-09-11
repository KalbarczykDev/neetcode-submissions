class NumArray {
    List<Integer> prefix;

    public NumArray(int[] nums) {
        prefix = new ArrayList<>();
        int total = 0;
        for (int n : nums) {
            total += n;
            prefix.add(total);
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefix.get(right);
        }
        return prefix.get(right) - prefix.get(left - 1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */