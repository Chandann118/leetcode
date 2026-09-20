class Solution {
    public int reverseDegree(String s) {
        int result = 0 ; 
        int n = s.length();
        for( int i = 0 ; i<n ; i++){
            int value = 26 - (s.charAt(i) -'a');
            result += value * (i + 1);
        }
        return result ;
        
    }
}