class Solution {
    public int minMoves2(int[] nums) {
     Arrays.sort(nums);
        int cg = nums[nums.length /2] , ans = 0;
        for( int num : nums) ans +=Math.abs(cg -num);

        return ans;
        
    }
}