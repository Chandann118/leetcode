class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] best = new int[n];
        Arrays.fill(best, Integer.MAX_VALUE);
        int sum = 0 ;
        int left = 0 ;
        int ans = Integer.MAX_VALUE;
        for( int i = 0; i < n; i ++){
            sum +=arr[i];

            while( sum > target){
                sum -=arr[left++];
            }
            if(sum == target){
                int currLength = i - left + 1;

                if( left > 0 && best[left - 1] != Integer.MAX_VALUE){
                    ans = Math.min( ans, currLength + best[left - 1] );
                }
                if( i == 0){
                    best[i] = currLength;
                }else{
                    best[i] = Math.min(best[i -1], currLength);
                }
            }else{
                if( i > 0){
                    best[i] = best[i -1];
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;

        
    }
}