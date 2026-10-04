class Solution {
    public boolean checkValidString(String s) {
        
        int first= 0 ; 
         int sec = 0;
          int n = s.length() -1 ;

          for( int i = 0 ; i<= n;i++){
            if(s.charAt(i)=='(' || s.charAt(i) == '*')
                first ++;
                else
                first --;

                if(s.charAt(n-i) ==')'|| s.charAt(n-i)=='*')
                sec ++;
                else
                sec --;

                if( first < 0 || sec < 0)
                return false;
                
            
          }
          return true;
    }
}