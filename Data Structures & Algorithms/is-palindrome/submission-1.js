class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
        var arr = Array.from(s.toLowerCase().replace(/[^a-z0-9]/g, ''));

        var i = 0;
        var j = arr.length - 1;
        while(i < j){
            if(arr[i] !== arr[j]) return false;
            i++;
            j--;
        }

        return true;
    }
}
