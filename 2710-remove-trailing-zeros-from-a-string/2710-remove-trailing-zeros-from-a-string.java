class Solution {
    public String removeTrailingZeros(String num) {
        int ind=num.length();
        boolean check=false;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i) == '0' && check==false){
                check=true;
                ind=i;
            }
            if(num.charAt(i) != '0'){
                ind=num.length();
                check=false;
            }
            if(i == num.length()-1)
                break;
        }
        
        return num.substring(0,ind);
    }
}