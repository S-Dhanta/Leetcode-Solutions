class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0], sell=0, max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] < buy)
                buy=prices[i];
            if(prices[i]-buy > 0){
                max=Math.max(prices[i]-buy, max);
            }
        }
        
        return max;
    }
}