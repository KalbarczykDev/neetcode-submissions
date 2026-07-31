class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int l = 0;
        int r = 0;
        int longest = 0;

        Set<Character> set = new HashSet<>();

        while(r < s.length()){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            int length = r - l + 1;
            longest = Math.max(length,longest);
            r++;
        }

        return longest;
    }
}
