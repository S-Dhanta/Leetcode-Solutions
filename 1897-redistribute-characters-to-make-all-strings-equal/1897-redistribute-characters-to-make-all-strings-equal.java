class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length == 1)
            return true;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(!map.containsKey(words[i].charAt(j)))
                    map.put(words[i].charAt(j),1);
                else{
                    int temp = map.get(words[i].charAt(j));
                    temp+=1;
                    map.put(words[i].charAt(j),temp);
                }
            }
        }
        List<Integer> list = new ArrayList<Integer>(map.values());
        for(int i:list){
            // System.out.println(i);
            if(i%words.length!=0)
                return false;
        }
        
        return true;
    }
}