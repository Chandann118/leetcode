class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        df(0,0,"", n, res);
        return res;
        
    }
    private void df( int left , int right , String s , int n , List<String > res){
        if(s.length()== n *2){
            res.add(s);
            return;
        }
        if(left < n){
            df(left +1 , right, s + "(",n, res);
        }
        if(right < left){
            df(left , right + 1, s + ")", n, res);
        }
    }
}

