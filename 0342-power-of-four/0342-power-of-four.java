class Solution {
    boolean helper(int n){
        if(n == 0)
            return false;
        if(n == 1)
            return true;
        if((n % 4 == 0 && helper(n/4))){
            return true;
        }
        else
            return false;
    }
    public boolean isPowerOfFour(int n) {
        return helper(n);
    }
}