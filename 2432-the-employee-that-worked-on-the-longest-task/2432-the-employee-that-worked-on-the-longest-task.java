class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int ans=logs[0][0],diff=logs[0][1],maxDiff=0;
        int last=0;
        for(int i=0;i<logs.length;i++){
            diff=logs[i][1]-last;
            if(maxDiff < diff){
                maxDiff=diff;
                ans=logs[i][0];
            }
            if(maxDiff == diff){
                ans=Math.min(ans,logs[i][0]);
            }
            
            last=logs[i][1];
        }
        
        return ans;
    }
}