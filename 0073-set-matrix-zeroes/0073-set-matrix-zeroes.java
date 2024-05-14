import java.util.Arrays;
class Solution {
    public void setZeroes(int[][] matrix) {
        // int[] column = new int[matrix.length];
        // int[] row = new int[matrix[0].length];
        // Arrays.fill(column,1);
        // Arrays.fill(row,1);
        
        int col=1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0]=0;
                    if(j!=0)
                        matrix[0][j]=0;
                    else
                        col=0;
                }
            }
        }
        for(int i=matrix.length-1;i>0;i--){
            for(int j=matrix[i].length-1;j>0;j--){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }
        if(col==0){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
    }
}