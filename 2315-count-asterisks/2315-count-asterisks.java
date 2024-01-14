class Solution {
    public int countAsterisks(String s) {
        int check=1,count=0;
        for(int i=0;i<s.length();i++){
            if(check==1){
                if(s.charAt(i) == '*')
                    count++;
            }
            if(s.charAt(i) == '|'){
                if(check==1)
                    check=0;
                else
                    check=1;
            }
        }
        
        return count;
    }
}