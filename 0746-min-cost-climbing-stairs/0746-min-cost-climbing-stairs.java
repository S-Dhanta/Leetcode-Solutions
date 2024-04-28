import java.util.Arrays;

class Solution {
    int solve(int[] cost,int[] dp, int i){
        //base case
        if(i>=cost.length)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
                
        int a = cost[i]+solve(cost,dp,i+1);
        int b = cost[i]+solve(cost,dp,i+2);
        
        dp[i]=Math.min(a,b);
        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        Arrays.fill(dp, -1);
        
        int ans1 = solve(cost,dp,0);
        int ans2 = solve(cost,dp,1);
        
        return Math.min(ans1,ans2);
    }
}