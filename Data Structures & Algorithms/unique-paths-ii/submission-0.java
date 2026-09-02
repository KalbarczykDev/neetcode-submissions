class Solution {
    
    private int ROWS;
    private int COLS;
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        ROWS = obstacleGrid.length;
        COLS = obstacleGrid[0].length;

        int [][] memo = new int[ROWS][COLS];

        for(int [] row : memo){
            Arrays.fill(row, -1);
        }

        return dfs(0,0,obstacleGrid,memo);
    }

    private int dfs(int r, int c, int[][] obstacleGrid, int [][] memo){

        if(r == ROWS || c == COLS){
            return 0;
        }

        if(obstacleGrid[r][c] == 1){
            return 0;
        }

        if(memo[r][c] != -1){
            return memo[r][c];
        }

        if(r == ROWS -1 && c == COLS -1){
            return 1;
        }


        int down = dfs(r + 1, c, obstacleGrid,memo);
        int right = dfs(r, c + 1, obstacleGrid, memo);


        return memo[r][c] = down + right;
    }
}