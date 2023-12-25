class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        for(int i=1;i<=2147483647;i++){
            if(n>=i){
                count+=1;
                n-=i;
            }
            else
                break;
        }
        
        return count;
    }
}