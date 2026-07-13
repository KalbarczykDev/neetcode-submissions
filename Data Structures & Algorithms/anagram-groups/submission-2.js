class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        var map = new Map();

        strs.forEach((str) => {
            var sorted = str.split('').sort().join();
            if(!map.has(sorted)){
                map.set(sorted,[])
            }
            map.get(sorted).push(str);
        });

        return Array.from(map.values());
    }
}
