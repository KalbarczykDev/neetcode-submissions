class Solution {
    public boolean hasDuplicate(int[] nums) {
        var set = new HashSet();

        for(var num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }

        return false;

    }
}