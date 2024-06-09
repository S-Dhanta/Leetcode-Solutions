class Solution { 
    public int majorityElement(int[] nums) {
       
        HashMap<Integer, Integer> map = new HashMap<>();
        if(nums.length==1)
            return nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else{
                int temp=map.get(nums[i]);
                temp+=1;
                if(temp>(nums.length/2))
                    return nums[i];
                map.put(nums[i],temp);
            }
        }

        return -1;
    }
}