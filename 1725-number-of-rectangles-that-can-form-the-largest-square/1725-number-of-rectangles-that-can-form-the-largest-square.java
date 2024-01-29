class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen=0;
        int[] arr = new int[rectangles.length];
        for(int i=0;i<rectangles.length;i++){
            arr[i]=Math.min(rectangles[i][0],rectangles[i][1]);
            if(arr[i]>maxLen)
                maxLen=arr[i];
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == maxLen)
                ans++;
        }
        
        return ans;
    }
}