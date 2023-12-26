class Solution {
    final int mod = (int) Math.pow(10, 9) + 7;
    
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n+1][target+1];
        for (int[] row : dp) 
            Arrays.fill(row, -1); 
        return helper(n,k,target,dp);
    }
    
    public int helper(int dice, int faces, int target, int[][] dp){
        if(target<0)
            return 0;
        if(dice==0 && target!=0)
            return 0;
        if(target==0 && dice!=0)
            return 0;
        if(dice==0 && target==0)
            return 1;
        
        if(dp[dice][target]!=-1)
            return (int) (dp[dice][target]%mod);
        
        int ans=0;
        for(int i=1;i<=faces;i++){
            ans= (ans+helper(dice-1,faces,target-i,dp))%mod;
        }
        dp[dice][target] = ans % mod;
        return dp[dice][target];
    }
}