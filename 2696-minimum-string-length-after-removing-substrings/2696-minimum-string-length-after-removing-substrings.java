class Solution {
    public int minLength(String s) {
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)=='A'&&list.get(i+1)=='B' || list.get(i)=='C'&&list.get(i+1)=='D'){
                list.remove(i+1);
                list.remove(i);
                i=-1;
                continue;
                
            }
        }
        
        return list.size();
    }
}