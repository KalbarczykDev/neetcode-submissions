class Solution {
    public int reverseBits(int n) {
        int res = 0;

        for (int i = 0; i < 32; i++) {
            int cur = ((n >> i) & 1);

            if ((cur & 1) == 1) {
                res = (res | (1 << (31 - i)));
            }
        }
        return res;
    }
}
