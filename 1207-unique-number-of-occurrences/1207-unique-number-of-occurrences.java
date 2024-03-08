class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        List<Integer> value = new ArrayList<>();
        List<Integer> occ = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!value.contains(arr[i])){
                value.add(arr[i]);
                int count=0;
                for(int j=i;j<arr.length;j++){
                    if(arr[j] == arr[i])
                        count++;
                }
                if(occ.contains(count))
                    return false;
                occ.add(count);
            }
            else{
                continue;
            }
        }
        
        return true;
    }
}