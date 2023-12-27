class Solution {
    public int alternateDigitSum(int n) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int temp=n,sum=0;
        while(temp>0){
            list.add(temp%10);
            temp/=10;
        }
        for(int t=list.size()-1;t>=0;t--){
            list2.add(list.get(t));
        }
        for(int i=0;i<list2.size();i++){
            if(i%2==0)
                sum+=list2.get(i);
            else
                sum-=list2.get(i);
        }
        
        return sum;
    }
}