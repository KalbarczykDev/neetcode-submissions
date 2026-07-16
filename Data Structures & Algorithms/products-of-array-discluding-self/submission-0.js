class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums) {

        var result = []

        for(var i = 0; i < nums.length; i++){

            var product = 1;

            for(var j = 0; j < nums.length; j++){
                if(j === i){
                    continue;
                }

                product = product * nums[j];
            }

            result[i] = product;
        }

        return result;
    }
}
