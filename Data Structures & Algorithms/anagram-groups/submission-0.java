class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var resMap = new HashMap<String, List<String>>();
        for (var s : strs) {
            var count = new int[26];
            for (var c : s.toCharArray()) {
                count[c - 'a']++;
            }

            var key = Arrays.toString(count);
            resMap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(resMap.values());
    }
}