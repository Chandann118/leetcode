class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long minSum =0;
          int[] diff = new int[100_001];
          long totalDiff = 0;

          long k = k1 + k2;
          int curr; 
          int maxDiff = 0;
          for( int i  = 0 ; i< n; i++){
            curr = Math.abs(nums1[i] - nums2[i]);
            if(curr > 0){
                totalDiff +=curr;
                diff[curr]++;
                maxDiff = Math.max(maxDiff, curr);
            }
          }
          if(totalDiff <= k){
            return 0;
          }
          for( int i = maxDiff ; i > 0 && k > 0; i--){
            if(diff[i]> 0){
                if(diff[i] >= k){
                    diff[i] -= k;
                    diff[i -1] += k;
                    k = 0;
                }else{

                    diff[i -1] += diff[i];
                    k -=diff[i];
                    diff[i]=0;
                }
            }
          }

          for( int i = 0;  i <= maxDiff;i++){
            if(diff[i]>0){
                minSum +=(long) (Math.pow((long)i,2)) * diff[i];
            }
          }
          return minSum;
    }
}