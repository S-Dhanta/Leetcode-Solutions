class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] ans = new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++){
            int maxLen=0;
            for(int j=0;j<grid.length;j++){
                String t = Integer.toString(grid[j][i]);
                if(t.length()>maxLen)
                    maxLen=t.length();
            }
            ans[i]=maxLen;
        }
        
        return ans;
    }
}