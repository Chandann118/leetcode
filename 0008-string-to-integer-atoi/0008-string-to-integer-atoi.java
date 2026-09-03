class Solution {
    public int myAtoi(String s) {
        int len = s.length();
        int index = 0;
        boolean isNegative = false;

        while(index < len && s.charAt(index) ==' '){
            ++ index;
        }

        if( index < len){
            if(s.charAt(index) =='-'){
                isNegative = true;
                ++index;
            }else if(s.charAt(index) =='+'){
                ++index;
            }
        }

        int result=0 ;
         while (index < len && isDigit(s.charAt(index))){
             int digit = s.charAt(index) - '0';

              if (result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && digit > 7)){
          return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
      
         }
         result =(result * 10) + digit;
         ++ index;
         
         } 
         return isNegative ? -result : result;
    }
    private boolean isDigit(char ch) {
    return ch >= '0' && ch <= '9';

    }
}