class Solution {
    public int maxProductDifference(int[] nums) {
        int max=0,secmax=0;
        int low=Integer.MAX_VALUE, seclow=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= max){
                secmax=max;
                max = nums[i];
            }
            if(nums[i] > secmax && nums[i] < max)
                secmax = nums[i];
        }
        // System.out.println(max + " " + secmax);
        for(int i=0;i<nums.length;i++){
            if(nums[i] <= low){
                seclow=low;
                low = nums[i];
            }
            if(nums[i] < seclow && nums[i] > low)
                seclow = nums[i];
        }
        // System.out.println(low + " " + seclow);

        return (max*secmax) - (low*seclow);
    }
}