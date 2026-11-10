class Solution {
    public int climbStairs(int n, int[] costs) {
        int x = 0 , y = 0,z = 0;
        for(int i = 0 ; i < n; i++){
            int next =Math.min(Math.min(x + 9, y + 4), z+1) + costs[i];
            x = y;
            y = z;
            z = next;
        }
        return z;
        
    }
}