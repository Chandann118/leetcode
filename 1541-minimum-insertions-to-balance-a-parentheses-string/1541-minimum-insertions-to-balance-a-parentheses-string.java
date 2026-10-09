class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int first = 0 ;
        int sec = 0;

        for( int i = 0 ;  i < n ; i++){
            char c = s.charAt(i);
            if( c =='('){
                first ++;
           } else{
                if( i + 1 < n &&  s.charAt(i +1) ==')')
                    i++;


                
                     else{

                          sec ++;

            }
                            if( first > 0)
                                first --;
                            else{
                               sec ++;
                   }
                } 

            
        }

     return sec + first * 2;   
    }
}