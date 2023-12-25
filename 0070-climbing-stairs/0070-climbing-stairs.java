class Solution {
    public int climbStairs(int n) {
        if(n==1)
            return 1;
        else if(n==2)
            return 2;
        else if(n==3)
            return 3;
        else{
            int i=4, last1=2, last2=3;
            while(i<=n){
                int temp=last2;
                last2=last1+last2;
                last1=temp;
                i++;
            }
            return last2;
        }
    }
}