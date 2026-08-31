class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        int carry = 1;

        for(int i = n - 1; i >= 0; i--){
            int sum = digits[i] + carry;

            if(sum > 9){
                sum = 0;
                carry = 1;
            } else {
                carry = 0;
            }
            digits[i] = sum;
            if (carry == 0) return digits;
        }

        if(carry != 0){
            int [] newArray = new int[n + 1];
            newArray[0] = carry;
            for(int i = 0; i < n; i++){
                newArray[i + 1] = digits[i];
            }
            digits = newArray;
        }

        
        return digits;
    }
}