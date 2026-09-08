class Solution {
    public boolean confusingNumber(int n) {
        Map<Character, Character> invertMap = new HashMap<>();

        invertMap.put('0', '0');
        invertMap.put('1', '1');
        invertMap.put('6', '9');
        invertMap.put('8', '8');
        invertMap.put('9', '6');

        StringBuilder sb = new StringBuilder();

        for (char ch : String.valueOf(n).toCharArray()) {
            if (!invertMap.containsKey(ch)) {
                return false;
            }

            sb.append(invertMap.get(ch));
        }

        sb.reverse();

        return Integer.parseInt(sb.toString()) != n;
    }
}
