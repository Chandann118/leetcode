class Solution {
    public int countServers(int[][] grid) {
        int n = grid.length , m = grid[0].length;
        int[] row = new int[n] , col = new int[m];
        for(int i = 0 ; i< n; i++){
            for( int j = 0; j < m; j++){
                row[i] +=grid[i][j];
                col[j] +=grid[i][j];
            }




        }
        int ans = 0; 
        for(int i = 0 ; i< n; i++)
            for( int j = 0; j < m; j++)
            if(grid[i][j]== 1 && row[i] + col[j] >2)
            ans ++;

            return ans;
        
    }
}