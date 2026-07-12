class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int value = x;
        int y = 0 ; 
        while(x != 0){
            int z =x%10;
            y =  y * 10 + z;
            x /=10;
        }
        if(value!=y){
            return false;
        }else{
            return true;
        }
        
    }
}
