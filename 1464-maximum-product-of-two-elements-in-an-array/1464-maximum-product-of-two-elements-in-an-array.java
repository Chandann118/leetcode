class Solution {
    public int maxProduct(int[] nums) {
        int max =Integer.MIN_VALUE;
        int secondMax =Integer.MIN_VALUE;

        for(int num:nums){
            if(num>=max){
                secondMax = max;
                max = num;

            }else if(num > secondMax && num != max){
                secondMax = num;
            }
        }

        int result = (max -1) * (secondMax -1);

        return result;
        
    }
}