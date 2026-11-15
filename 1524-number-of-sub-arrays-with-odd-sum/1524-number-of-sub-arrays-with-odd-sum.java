class Solution {
   // public int[] subArray(int[]  arr){
     //  
       //  return sum;
    //}
    public int numOfSubarrays(int[] arr) {
      /*  int MOD = 1_000_000_007;
         int n = arr.length, index = 0;
        int totSub = n * ( n + 1)/2;
        long[] sum = new long[totSub];
         for( int i = 0; i< n ; i++){
            long currSum = 0;
            for(int j = i ; j < n ; j++){
                currSum +=arr[j];
                sum[index++] = currSum;
            }
         }

        int ans = 0;
        for( int i = 0; i < sum.length; i ++){
            if(sum[i] % 2 !=0){
                ans = (ans + 1) % MOD;
            }
        }
        return ans;

        */

        int MOD = 1_000_000_007;
        int oddCount = 0;
        int evenCount = 1; // Accounts for the initial prefix sum of 0 (which is even)
        int prefixSum = 0;
        int ans = 0;

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum % 2 == 0) {
                // Even prefix sum minus any previous odd prefix sum gives an odd subarray sum
                ans = (ans + oddCount) % MOD;
                evenCount++;
            } else {
                // Odd prefix sum minus any previous even prefix sum gives an odd subarray sum
                ans = (ans + evenCount) % MOD;
                oddCount++;
            }
        }

        return ans;
    }

     
    
}