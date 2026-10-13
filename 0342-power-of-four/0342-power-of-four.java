class Solution {
    public boolean isPowerOfFour(int n) {
        if( n <= 0 || (n&(n-1)) != 0)
            return false;
            int sq = 0;
            while(n  > 1){
                n >>= 1;
                sq++;
            }
          return sq % 2 ==0;
        
    }
}