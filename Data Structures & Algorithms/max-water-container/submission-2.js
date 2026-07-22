class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights) {
        let maxSize = 0;
        let l = 0;
        let r = heights.length - 1;

        while(l < r){
            let width = r - l;
            let height = Math.min(heights[l],heights[r]);
            let curSize = width * height;
            maxSize = Math.max(maxSize,curSize);

            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxSize;
    }
}
