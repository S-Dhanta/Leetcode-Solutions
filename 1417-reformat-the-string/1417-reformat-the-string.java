class Solution {
    public String reformat(String s) {
        StringBuffer c = new StringBuffer();
        StringBuffer d = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                c.append(s.charAt(i));
            }else{
                d.append(s.charAt(i));
            }
        }
        String res = "";
        int i=c.length();int j=d.length();
        if(i==j || i-1==j){
            return f(c,d);
        }else if(i == j-1){
            return f(d,c);
        }
        return "";
    }
    String f(StringBuffer c,StringBuffer d){
        int i= 0;
        int j= 0;
        StringBuffer res = new StringBuffer();
        while(i<c.length() && j<d.length()){
            res.append(c.charAt(i++));
            res.append(d.charAt(j++));
        }
        if(i<c.length()){
            res.append(c.substring(i));
        }
        if(j<d.length()){
            res.append(d.substring(j));
        }
        return res.toString();
    }
}