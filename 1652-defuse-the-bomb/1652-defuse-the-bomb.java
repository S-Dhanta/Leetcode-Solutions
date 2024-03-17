class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];
        if(k==0){
            for(int i=0;i<code.length;i++){
                ans[i]=0;
            }
        }
        else if(k>0){
            for(int j=0;j<code.length;j++){
                int count=0,i=j+1,sum=0;
                while(true){
                    if(count==k)
                        break;
                    if(i==code.length)
                        i=0;
                    sum+=code[i];
                    i++;
                    count++;
                }
                ans[j]=sum;
            }
        }
        else{
            k*=-1;
            for(int j=0;j<code.length;j++){
                int count=0,i=j-1,sum=0;
                while(true){
                    if(count==k)
                        break;
                    if(i==-1)
                        i=code.length-1;
                    sum+=code[i];
                    i--;
                    count++;
                }
                ans[j]=sum;
            }
        }
        
        return ans;
    }
}