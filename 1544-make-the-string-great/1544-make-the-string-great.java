class Solution {
    public String makeGood(String s) {
        StringBuilder ans = new StringBuilder(s);
        for(int i=0;i<ans.length()-1;){
            if(ans.charAt(i) == (char)(ans.charAt(i+1)-32) || ans.charAt(i) == (char)(ans.charAt(i+1)+32)){
                ans.delete(i,i+2);
                i=0;
            }
            else
                i++;
        }
        
        return ans.toString();
    }
}