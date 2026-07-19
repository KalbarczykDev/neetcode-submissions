class Solution {
    /**
     * @param {number} x
     * @param {number} n
     * @return {number}
     */
    myPow(x, n) {
        if(x === 0) return 0;
        if(n === 0) return 1;

        if(n < 0){
            x = 1 / x;
            n = -n;
        }

        if(n % 2 === 0){
            return this.myPow(x * x, n /2);
        }

        return x * this.myPow(x * x, Math.floor(n / 2));

    }
}
