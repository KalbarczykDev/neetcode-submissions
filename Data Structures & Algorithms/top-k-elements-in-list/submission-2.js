class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        var map = new Map();
        for (const num of nums) {
            map.set(num, (map.get(num) || 0) + 1);
        }
        const sortedEntries = Array.from(map.entries()).sort((a, b) => b[1] - a[1]);

        const result = [];
        for (let i = 0; i < k; i++) {
            result.push(sortedEntries[i][0]);
        }
        return result;
    }
}
