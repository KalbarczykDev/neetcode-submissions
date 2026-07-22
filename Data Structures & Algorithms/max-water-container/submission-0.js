class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights) {
        let maxSize = -Infinity;

        for(let i = 0; i < heights.length; i++){
            for(let j = i + 1; j < heights.length; j++){
                let left = heights[i];
                let right = heights[j];

                let length = j - i;
                let height = Math.min(left,right);

                maxSize = Math.max(maxSize,length * height);
            }
        }

        return maxSize;
    }
}
