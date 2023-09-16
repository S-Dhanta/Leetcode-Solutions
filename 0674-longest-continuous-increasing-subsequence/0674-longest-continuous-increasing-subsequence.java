class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1,max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] < nums[i]){
                count++;
            }
            else
                count=1;
            if(count > max)
                max = count;
        }

        return max;
    }
}