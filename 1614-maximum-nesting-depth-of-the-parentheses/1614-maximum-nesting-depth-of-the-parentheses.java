class Solution {
    public int maxDepth(String s) {
        int counter=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(')
                counter+=1;
            if(s.charAt(i) == ')')
                counter-=1;
            
            if(counter>max)
                max=counter;
        }
        
        return max;
    }
}