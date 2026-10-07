class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        remove(s,ans,0,0, new char[]{'(', ')'});
        return ans;

        
    }
    public void remove(String s , List<String> ans, int li, int lj, char[] par){
        for(int stack =  0,  i = li; i < s.length(); ++i){
            if(s.charAt(i)==par[0] )
            stack ++;
            if(s.charAt(i) ==par[1])
            stack --;
            
            if(stack >= 0)
            continue;
            for( int j = lj ; j<= i ; j++){
                if(s.charAt(j)==par[1] && (j == lj || s.charAt(j -1)!=par[1])){
                    remove(s.substring(0,j) + s.substring(j + 1),ans,i , j, par);
                }
            }
            return;
        }
        String reversed = new StringBuilder(s).reverse().toString();
        if(par[0]=='('){
        remove(reversed , ans, 0, 0, new char[]{')','('});
        }else{
            ans.add(reversed);
        }


    }
}