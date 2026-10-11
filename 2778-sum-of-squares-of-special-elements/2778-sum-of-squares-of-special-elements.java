class Solution {
    public int sumOfSquares(int[] s) {
        int n = s.length;
        int result = 0;
        for( int i = 1; i <=n; i++){
            if(n % i== 0){
                result +=  s[i -1] * s[i -1];
            }
        }
        return result;
        
    }
}