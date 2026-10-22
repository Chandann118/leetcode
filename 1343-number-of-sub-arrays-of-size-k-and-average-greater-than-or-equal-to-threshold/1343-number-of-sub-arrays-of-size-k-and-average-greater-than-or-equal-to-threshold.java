class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int  res = 0, count = 0;
        for(int i = 0 ; i < k ; i++){
            res += arr[i];
        }
        if(res/ k >= t) count++;

        for(int  i = k ; i < arr.length; i++){
            res = res- arr[i-k] +arr[i];
        
        if(res / k >= t) count ++;
        }

        
    
    
     return count;
    }
}