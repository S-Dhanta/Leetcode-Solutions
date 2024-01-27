class Solution {
    public String replaceDigits(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                ans+=Character.toString(s.charAt(i));
            }
            else{
                char temp=(char)(s.charAt(i-1)+(s.charAt(i)-48));
                ans+=Character.toString(temp);
            }
        }
        
        return ans;
    }
}