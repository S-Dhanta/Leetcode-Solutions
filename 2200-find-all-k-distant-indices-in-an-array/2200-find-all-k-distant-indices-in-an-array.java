class Solution {
     public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                int from = 0, till = 0;//just initialising you could do anything with it;
                from = Math.max((i - k), 0);
                till = Math.min((i + k), nums.length - 1);
                for (int j = from; j <= till; j++) set.add(j);
            }
        }
        for (int i : set) list.add(i);
        Collections.sort(list);

        return list;
    }
}