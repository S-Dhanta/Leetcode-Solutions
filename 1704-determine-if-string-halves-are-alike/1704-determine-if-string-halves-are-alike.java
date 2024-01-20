class Solution {
    public boolean halvesAreAlike(String s) {
        List<Character> list =  new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');
        int count1=0,count2=0;
        for(int i=0;i<s.length()/2;i++){
            if(list.contains(s.charAt(i)))
                count1++;
            if(list.contains(s.charAt(i+(s.length()/2))))
                count2++;
            
            if(((count1-count2)>(((s.length()/2)-1)-i)) || ((count2-count1)>(((s.length()/2)-1)-i)))
                return false;
        }
        if(count1 == count2)
            return true;
        return false;
    }
}