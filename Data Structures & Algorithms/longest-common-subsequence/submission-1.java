class Solution {
    private String text1;
    private String text2;
    private Integer[][] memo;

    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.equals(text2))
            return text1.length();

        this.text1 = text1;
        this.text2 = text2;
        this.memo = new Integer[text1.length()][text2.length()];

        Integer res = dfs(0, 0);

        return res;
    }

    private Integer dfs(int i, int j) {
        if (i == text1.length() || j == text2.length())
            return 0;

        if (memo[i][j] != null)
            return memo[i][j];

        if (text1.charAt(i) == text2.charAt(j)) {
            memo[i][j] = 1 + dfs(i + 1, j + 1);
        } else {
            memo[i][j] = Math.max(dfs(i + 1, j), dfs(i, j + 1));
        }
        return memo[i][j];
    }
}
