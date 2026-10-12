class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] bt = new int[30];
        long result = 0 , MOD = 1000000007;
        for( int x : nums){
            for(int i = 0; i < 30 ; i++){
                if((x & (1<<i)) !=0){
                    bt[i]++;
                }
            }
        }
        for( int i = 0; i<k;i++){
            long   curr = 0;
            for( int j = 29; j>=0; j--){
                if(bt[j]>0){
                    curr |= 1L << j;
                    bt[j]--;
                }
            }
            result = (result + curr * curr) % MOD;
        }
        return (int) result ;
        
    }
}