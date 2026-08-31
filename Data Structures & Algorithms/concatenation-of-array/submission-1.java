class Solution {
    public int[] getConcatenation(int[] nums) {
        int newLength = nums.length * 2;
        int [] newArray = new int[newLength];

        for(int i = 0; i < newLength; i++){
            if(i >= nums.length){
                newArray[i] = nums[i - nums.length];
            }else{
                newArray[i] = nums[i];
            }

        }
        return newArray;
    }
}