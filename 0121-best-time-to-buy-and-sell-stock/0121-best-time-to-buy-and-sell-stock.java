class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0], sell=0, max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] < buy)
                buy=prices[i];
            if(prices[i]-buy > 0){
                if(prices[i]-buy > max)
                    max = prices[i] - buy;
            }
        }
        
        return max;
    }
}