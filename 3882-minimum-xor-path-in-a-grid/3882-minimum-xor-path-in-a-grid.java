class Solution {
    public int minCost(int[][] grid) {
        int n = grid[0].length;
        boolean[][] dp = new boolean[n][1024];
        dp[0][0] = true;
        for(int[] row : grid)
            for(int j = 0; j<n; j++){
                boolean[] nxt = new boolean[1024];
                for(int i = 0; i<1024;i++)
                if(dp[j][i] || j > 0 && dp[j -1][i]) nxt[i ^ row[j]] = true;
                dp[j]=nxt;
            }
        
        int i = 0;
        while(!dp[n -1][i]) i++;
        return i;
        
    }
}