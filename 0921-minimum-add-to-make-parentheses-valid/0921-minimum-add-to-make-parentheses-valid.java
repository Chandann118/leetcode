class Solution {
    public int minAddToMakeValid(String s) {
        int first = 0;
        int second = 0;
        for(char c : s.toCharArray()){
            if(c =='('){
                first++;

            }else{
                if( first > 0){
                    first --;
                }else{
                    second ++;
                }
            }
        }
        return  first + second;
    }
}