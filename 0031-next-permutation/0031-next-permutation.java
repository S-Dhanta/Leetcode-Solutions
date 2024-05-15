import java.util.Arrays;
class Solution {
    public void nextPermutation(int[] nums) {
        int point=-1, n=nums.length;
        List<Integer> list = new ArrayList<>();
        list.add(nums[n-1]);
        for(int i=n-2;i>=0;i--){
            list.add(nums[i]);
            if(nums[i]<nums[i+1]){
                point=i;
                break;
            }
        }
        if(point == -1){
            Arrays.sort(nums);
            return;
        }
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>nums[point] && list.get(i)<min){
                min=list.get(i);
            }
        }
        nums[point]=min;
        int temp=list.indexOf(min);
        list.remove(temp);
        Collections.sort(list);
        for(int i=point+1;i<n;i++){
            nums[i]=list.get(i-point-1);
        }
        
        return;
    }
}