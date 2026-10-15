class Solution {
    public int sumCounts(List<Integer> nums) {
        int n =nums.size();
        int ans = 0;
        for(int i = 0; i< n; i++){
            boolean[] arr= new boolean[101];
            int count = 0;
            for(int j = i; j<n; j++){
                if(!arr[nums.get(j)]){
                    arr[nums.get(j)]= true;
                    count ++;
                }
                ans +=count* count;
            }
        }
        return ans;
    }
}