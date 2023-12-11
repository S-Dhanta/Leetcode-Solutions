class Solution {
    public int findSpecialInteger(int[] arr) {
        int counter=1;
        int ind=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] == arr[i])
                counter++;
            else
                counter=1;
            
            if(counter>arr.length/4){
                ind=i;
                break;
            }
        }
        return arr[ind];
    }
}