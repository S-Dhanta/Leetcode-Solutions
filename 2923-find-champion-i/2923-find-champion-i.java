class Solution {
    public int findChampion(int[][] grid) {
        int winner=-1;
        List<Integer> losers = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[i][j] == 1 && losers.isEmpty()){
                    winner=i;
                    losers.add(j);
                }
                else if(grid[i][j] == 1){
                    if(i==winner){
                        if(!losers.contains(j))
                            losers.add(j);
                    }
                    if(j == winner){
                        losers.add(winner);
                        winner=i;
                    }
                    if(i!=winner && j!=winner){
                        if(!losers.contains(i))
                            losers.add(i);
                        if(!losers.contains(j))
                            losers.add(j);
                    }
                    
                    // if(j == winner){
                    //     losers.add(winner);
                    //     winner=j;
                    // }
                    // else if(i!=winner){
                    //         if(!losers.contains(i)){
                    //         losers.add(i);
                    //         if(!losers.contains(j))
                    //             losers.add(j);
                    //     }
                    // }
                        
                }
            }
        }
        
        return winner;
    }
}