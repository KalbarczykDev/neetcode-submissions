class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    largestRectangleArea(heights) {
        let maxArea = 0;
        let stack = [];

        for (let i = 0; i < heights.length; i++) {
            const h = heights[i];
            let start = i;

            while (stack.length > 0 && stack[stack.length - 1][1] > h) {
                const [popIdx, popH] = stack.pop();
                maxArea = Math.max(maxArea, popH * (i - popIdx));
                start = popIdx;
            }
            stack.push([start, h]);
        }

        while (stack.length > 0) {
            const [popIdx, popH] = stack.pop();
            const width = heights.length - popIdx;
            maxArea = Math.max(maxArea, popH * width);
        }

        return maxArea;
    }
}
