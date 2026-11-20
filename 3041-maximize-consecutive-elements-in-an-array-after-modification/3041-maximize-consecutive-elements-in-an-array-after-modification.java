class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        int pr = 0 , dp =0 , dpp = 0, result = 0;
        for(int num : nums){
            int diff = num - pr;
            if(diff == 0){
                dpp = dp +1;
            }else if(diff ==1){
                dp=dp +1;
                dpp = dpp + 1;
            }else if(diff ==2){
                dp = dpp + 1;
                dpp =1;
            }else{
                dp = 1;
                dpp =1;
            }

            result = Math.max(result , Math.max(dp , dpp));
            pr = num;
        }
        
        return result ;
        
    }
}