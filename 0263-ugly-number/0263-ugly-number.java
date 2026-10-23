class Solution {
    public boolean isUgly(int n) {
        if(n <= 0){
            return false;
        }
        int[] num = {2,3,5};

        for(  int fac: num){

        while( n %  fac == 0){
             n /=fac;
        }
        }
        return ( n==1);
        
    }
}