class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int cols = matrix[0].length;

        boolean isFirstRowZero = false;
        boolean isFirstColZero = false;

        for(int i = 0; i < row; i++){
            if(matrix[i][0] == 0) isFirstColZero = true;
        }

        for(int j = 0; j < cols; j++){
            if(matrix[0][j] == 0) isFirstRowZero = true;
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < cols; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < cols; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(isFirstRowZero){
            for(int i = 0; i < cols; i++){
                matrix[0][i] = 0;
            }
        }
        if(isFirstColZero){
            for(int j = 0; j < row; j++){
                matrix[j][0] = 0;
            }
        }
    }
}