class Solution {
    private int ROWS;
    private int COLS;

    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        ROWS = m;
        COLS = n;

        int result = dfs(0, 0,memo);

        return result;
    }

    private int dfs(int r, int c, int[][] memo) {
        if (r == ROWS || c == COLS) {
            return 0;
        }

        if (r == ROWS - 1 && c == COLS - 1) {
            return 1;
        }

        if (memo[r][c] != -1) {
            return memo[r][c];
        }

        int down = dfs(r + 1, c, memo);
        int right = dfs(r, c + 1, memo);

        memo[r][c] = down + right;

        return down + right;
    }
}
