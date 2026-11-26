class Solution {
    public boolean canAliceWin(int n) {
        
        int cp =  10, k = 0 ;
        while( n >= cp){
            n -=cp;
            cp--;
            k++;


        }
        return k%2==1;
    }
}