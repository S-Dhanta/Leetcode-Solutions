class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),1);
            else{
                int a = map.get(s.charAt(i));
                map.put(s.charAt(i),++a);
            }
                
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i)) == true){
                int a = map.get(t.charAt(i));
                map.put(t.charAt(i),--a);
                if(map.get(t.charAt(i)) < 0)
                    return t.charAt(i);
            }
            else{
                return t.charAt(i);
            }
                
        }
        return t.charAt(0);
    }
}