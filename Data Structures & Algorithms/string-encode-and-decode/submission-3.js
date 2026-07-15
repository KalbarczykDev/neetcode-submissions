class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        var result = "";

        for (var str of strs) {
            result += str.length + "#" + str;
        }

        return result;
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        var result = new Array();
        for (var i = 0; i < str.length;) {
            var j = i;
            while (str[j] !== "#") {
                j++;
            }
            var length = parseInt(str.substring(i,j));

            var start = j + 1;
            var word = str.substring(start, start + length);
            result.push(word);
            i = start + length;

        }
        return result;
    }
}
