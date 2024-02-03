class Solution {
    public int minimumSum(int num) {
        int[] n = new int[4];
        int i=0;
        while(num>0){
            n[i] = num%10;
            num/=10;
            i++;
        }
        Arrays.sort(n);
        int a = n[0]*10;
        int b = n[1]*10;
        a+=n[2];
        b+=n[3];
        
        return a+b;
    }
}