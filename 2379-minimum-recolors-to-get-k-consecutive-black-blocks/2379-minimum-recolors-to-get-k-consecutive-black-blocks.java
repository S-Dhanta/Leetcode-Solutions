class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<blocks.length();i++){
            int count=0,b_count=0;
            if(i==(blocks.length()-k+1))
                break;
            for(int j=i;j<blocks.length();j++){
                if(blocks.charAt(j) == 'B'){
                    b_count++;
                }
                else{
                    b_count++;
                    count++;
                }
                if(b_count == k){
                    ans=Math.min(ans,count);
                    break;
                }
            }
        }
        
        return ans;
    }
}