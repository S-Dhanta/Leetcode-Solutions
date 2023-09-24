class Solution {
    public int maxSum(int[] nums) {
        int max=-1;
        for(int i=0;i<nums.length-1;i++){
            int it=nums[i];
            int imax=0;
            while(it > 0){
                if(it % 10 > imax)
                    imax = it % 10;
                it = it / 10;
            }
            for(int j=i+1;j<nums.length;j++){
                int jt=nums[j];
                int jmax=0;
                while(jt > 0){
                    if(jt % 10 > jmax)
                        jmax = jt % 10;
                    jt = jt / 10;
                }
                if(jmax == imax){
                    if(nums[i]+nums[j] > max)
                        max = nums[i]+nums[j];
                }
            }
        }
        
        return max;
    }
}