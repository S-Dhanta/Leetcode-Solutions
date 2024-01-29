class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i=0;
        int ans=0;
        while(true){
            if(i == tickets.length)
                i=0;
            
            if(tickets[i]!=0){
                tickets[i]-=1;
                ans++;
            }
            
            if(tickets[k] == 0)
                break;
            
            i++;
        }
        
        return ans;
    }
}