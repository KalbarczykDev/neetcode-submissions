class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums) {

        var runningProduct = 1;
        var prefixProducts = [];

        for (var i = 0; i < nums.length; i++) {
          prefixProducts[i] = runningProduct;
          runningProduct *= nums[i];
        }

        var suffixProduct = 1;
        var output = prefixProducts;
        for(var i = nums.length -1; i >= 0; i--){
            output[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return output;
    }
}
