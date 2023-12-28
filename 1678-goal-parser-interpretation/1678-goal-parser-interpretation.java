class Solution {
    public String interpret(String command) {
        String ans="";
        int l = command.length();
        for(int i=0;i<l;i++){
            char c = command.charAt(i);
            if(i==l-1){
                if(c == 'G')
                    ans+="G";
                break;
            }
            
            char c1 = command.charAt(i+1);
            if(c == '('){
                if(c1 == ')'){
                    ans+="o";
                }
                else
                    ans+="al";
            }
            if(c == 'G')
                ans+="G";
        }
        
        return ans;
    }
}