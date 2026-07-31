class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];

        int l = 0;
        int r = 0;

        int maxFreq = 0;
        int maxLen = 0;

        while (r < s.length()) {
            char rChar = s.charAt(r);
            arr[rChar - 'A']++;
            maxFreq = Math.max(maxFreq, arr[rChar - 'A']);

            int windowLen = r - l + 1;
            int replacementsNeeded = windowLen - maxFreq;

            if (replacementsNeeded > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}
