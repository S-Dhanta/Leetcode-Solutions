class Solution {
    public boolean rotateString(String s, String goal) {
        String temp="";
        char c;
        for(int i=0;i<s.length();i++){
            for(int j=1;j<s.length();j++){
                temp=temp+Character.toString(s.charAt(j));
            }
            temp=temp+Character.toString(s.charAt(0));
            s=temp;
            temp="";
            if(s.equals(goal)){
                return true;
            }
        }
        
        return false;
    }
}