class Solution {
    public int minMoves(int[] nums) {
        int res = 0 ;
        int n = nums.length;
        int min  = Integer.MAX_VALUE;
        
        for( int i = 0; i< n ; i++){
            res +=nums[i];
            min =Math.min(min , nums[i]);
        }

        return res - n*min;
        
    }
}