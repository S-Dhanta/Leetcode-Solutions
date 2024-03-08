class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> stone = new LinkedList<>(Arrays.stream(stones).boxed().toList());
        // stone=Arrays.stream(stones).boxed().toList();
        while(stone.size() > 1){
            int max=0,secMax=0;
            for(int i=0;i<stone.size();i++){
                if(stone.get(i)<=max && stone.get(i)>=secMax)
                    secMax=stone.get(i);
                if(stone.get(i)>=max){
                    secMax=max;
                    max=stone.get(i);
                }
            }
            int ind1=stone.indexOf(max);
            stone.remove(ind1);
            // if(stone.size() == 1)
            //     break;
            int ind2=stone.indexOf(secMax);
            stone.remove(ind2);
            stone.add(max-secMax);
        }
        
        return stone.get(0);
    }
}