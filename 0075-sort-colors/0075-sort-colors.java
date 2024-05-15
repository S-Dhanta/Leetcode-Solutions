class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==2){
                // int temp = nums[mid];
                // nums[mid]=nums[high];
                // nums[high]=temp;
        //         high-=1;
        //     }
        //     if(nums[i]==1){
        //         low=i;
        //         mid=i+1;
        //     }
        //     if(nums[i]==0){
        //         int temp = nums[low];
        //         nums[low]=nums[mid];
        //         nums[mid]=temp;
        //         mid+=1;
        //         low+=1;
        //     }
        // }
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid+=1;
                low+=1;
            }
            else if(nums[mid]==1){
                mid+=1;
            }
            else if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high-=1;
            }
        }
        
        return;
    }
}