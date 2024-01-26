class Solution {
    public int buyChoco(int[] prices, int money) {
        int lowest=Integer.MAX_VALUE, lowest2=Integer.MAX_VALUE,c=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<lowest){
                lowest=prices[i];
                c=i;
            }
        }
        for(int i=0;i<prices.length;i++){
            if(prices[i]<lowest2 && prices[i]>=lowest && i!=c)
                lowest2=prices[i];
        }
        if(money-lowest-lowest2 < 0)
            return money;
        return money-lowest-lowest2;
    }
}