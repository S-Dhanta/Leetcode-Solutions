class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        ans[arr.length-1]=-1;
        for(int i=0;i<arr.length-1;i++){
            int max=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>max)
                    max=arr[j];
            }
            ans[i]=max;
        }
        
        return ans;
    }
}