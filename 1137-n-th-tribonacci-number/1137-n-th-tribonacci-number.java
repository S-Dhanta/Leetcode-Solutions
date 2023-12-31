class Solution {
    public int tribonacci(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        int one=0,two=1,three=1,new1=0;
        for(int i=3;i<=n;i++){
            new1=one+two+three;
            one=two;
            two=three;
            three=new1;
        }
        return new1;
    }
}