class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int first = 0 ;
        for( char c : s.toCharArray()){
            if(c =='('){
                if(first > 0)
                ans.append(c);
            first ++;
            }else{
                first --;
                if(first > 0)
                ans.append(c);
        }
        }
        return ans.toString();
        
    }
}