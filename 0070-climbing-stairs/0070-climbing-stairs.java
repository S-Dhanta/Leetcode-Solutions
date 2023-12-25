class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        return climbStairs(n,dp,2);
    }
    private int climbStairs(int n,int[] dp,int i){
        if(n<=3)
            return n;
        
        if(i>n)
            return n;
        
        dp[i]=dp[i-1]+dp[i-2];
        climbStairs(n,dp,i+1);
        
        return dp[n];
    }
}