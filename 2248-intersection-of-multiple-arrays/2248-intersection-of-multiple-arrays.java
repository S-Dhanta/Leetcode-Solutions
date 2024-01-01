class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums[0].length;i++){
            list1.add(nums[0][i]);
        }
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(list1.contains(nums[i][j])){
                    list2.add(nums[i][j]);
                }
            }
            list1.clear();
            list1.addAll(list2);
            list2.clear();
        }
        
        Collections.sort(list1);
        return list1;
    }
}
