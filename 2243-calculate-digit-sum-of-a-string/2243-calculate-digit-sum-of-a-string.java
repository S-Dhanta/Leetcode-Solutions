class Solution {
    public String helper(String s, int k){
        if(s.length()<=k)
            return s;
        
        String ans="";
        int sum=0;
        int count=1;
        for(int i=0;i<s.length();i++){
            sum+=Character.getNumericValue(s.charAt(i));
            count++;
            if(count>k || i==s.length()-1){
                ans+=Integer.toString(sum);
                sum=0;
                count=1;
            }
        }
        
        return helper(ans,k);
    }
    public String digitSum(String s, int k) {
        return helper(s,k);
    }
}