class Solution {
    public int scoreOfParentheses(String s) {
        int result = 0;
        int num = 0;
        for(int i = 0; i< s.length();i++){
            if(s.charAt(i)=='('){
                num ++;
                
            }else{
                num --;
                if(s.charAt(i -1) =='('){
                    result += 1 << num;
                }
            }
        }
        return result;
    }
}