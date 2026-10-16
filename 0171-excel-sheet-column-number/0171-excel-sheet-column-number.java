class Solution {
    public int titleToNumber(String clmTt) {
        int n = clmTt.length() , res = 0;
        for( int i=0 ; i< n ; i++){
            char a=clmTt.charAt(i);
            int val = a - 'A' + 1;
            res  = res* 26 + val;
        }
        return res;
    }
}