class Solution {
    public int minOperations(int[] nums) {
    int n  = nums.length;
    int p = 0;
    for(int i = 0; i<n ; i++){
        if(nums[i] == 0){
             p =i;
             break;
        }
    }
    boolean  add  = true ,sub = true;
    for(int i = 0; i< n; i++){
        int nxt = nums[(i +1) %n];
        if(nxt !=(nums[i] +1) %n ) add = false;
        if(nxt !=(nums[i] -1 + n) %n) sub = false;
    }
    int ans= Integer.MAX_VALUE;
    if(add) ans = Math.min(ans, Math.min(p, n-p +2));
    if(sub) ans = Math.min(ans,Math.min(p +2, n-p));
    return ans == Integer.MAX_VALUE ? -1 : ans;
        
    }
}