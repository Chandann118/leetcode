class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE , minPrice2 = Integer.MAX_VALUE;
      int  profit = 0 , profit2 =0;
    for(int currPrice : prices){
        minPrice =Math.min(currPrice , minPrice);
        profit =Math.max(profit , currPrice - minPrice);

         minPrice2 =Math.min(minPrice2 ,currPrice - profit);
        profit2 =Math.max(profit2 , currPrice - minPrice2);



    }
    return profit2;
        
    }
}