class Solution {
    public boolean checkPerfectNumber(int num) {
        //ArrayList<Integer> ad = new ArrayList<>();
        int sum = 1;
        int n = num;

        if(n<=1){
            return false;
        }

        for( int i = 2 ; i <=n/2 ; i++){
            if(num % i ==0){
                sum +=i;
            }
            
        }
        if(sum != num){
                return false;
            }
            return true;
        
    }
}