class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int l = 0;
        int r = 1;
        int res = 1;
        char prev = '=';

        while (r < arr.length) {
            if (arr[r - 1] > arr[r] && prev != '>') {
                res = Math.max(res, r - l + 1);
                r += 1;
                prev = '>';
            } else if (arr[r - 1] < arr[r] && prev != '<') {
                res = Math.max(res, r - l + 1);
                r += 1;
                prev = '<';
            } else {
                if (arr[r] == arr[r - 1]) {
                    r = r + 1;
                }
                l = r - 1;
                prev = '=';
            }
        }
        return res;
    }
}