class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        int index=-1;
        for(int i=0;i<operations.length;i++){
            String c = operations[i];
            if(c.equals("+")){
                list.add(list.get(index)+list.get(index-1));
                index++;
            }
            else if(c.equals("D")){
                list.add(list.get(index)*2);
                index++;
            }
            else if(c.equals("C")){
                list.remove(index);
                index--;
            }
            else{
                list.add(Integer.parseInt(c));
                index++;
            }
        }
        
        int ans=0;
        for(int i:list)
            ans+=i;
        return ans;
    }
}