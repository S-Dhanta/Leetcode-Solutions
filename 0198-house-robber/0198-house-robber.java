import java.util.Arrays;

class Solution {
    int solve(int[] nums, int[] dp, int i){
        //base case
        if(i>=nums.length)
            return 0;
        if(dp[i] != -1)
            return dp[i];
        
        int a=nums[i] + solve(nums,dp,i+2);
        int b=solve(nums,dp,i+1);
        
        dp[i]=Math.max(a,b);
        return dp[i];
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        
        return Math.max(solve(nums,dp,0) , solve(nums,dp,1));
    }
}