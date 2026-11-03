class Solution {
    public int minMoves(int[] nums) {
        int max = 0 , sum = 0;
        int n = nums.length;
        for( int x : nums){
            max = Math.max(x,max);
            sum +=x;
        }
        return max * n - sum;
        
    }
}