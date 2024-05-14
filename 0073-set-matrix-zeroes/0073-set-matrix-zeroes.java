import java.util.Arrays;
class Solution {
    public void setZeroes(int[][] matrix) {
        int[] column = new int[matrix.length];
        int[] row = new int[matrix[0].length];
        Arrays.fill(column,1);
        Arrays.fill(row,1);
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    column[i]=0;
                    row[j]=0;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(row[j]==0 || column[i]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }
}