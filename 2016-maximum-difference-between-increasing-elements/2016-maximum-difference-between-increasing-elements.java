class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff=-1;
        for(int j=0;j<nums.length;j++){
            for(int i=0;i<j;i++){
                if(nums[j]>nums[i]){
                    if(nums[j]-nums[i] > maxDiff)
                        maxDiff=nums[j]-nums[i];
                }
            }
        }
        
        return maxDiff;
    }
}