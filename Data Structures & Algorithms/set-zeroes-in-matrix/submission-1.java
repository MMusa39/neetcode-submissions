class Solution {
    /*
     * Use the first row and column to sketch which rows and columns should be zeroes.
     * Since (0,0) overlaps for row and column, use position for column and use a boolean
     * to track if first row should be zero. Then fill out the inner matrix excluding
     * the first row and column, and then fill in the first row and column last. Must do
     * last otherwise information for inner matrix will be lost.
     */
    public void setZeroes(int[][] matrix) {
        // Create outline for 0 rows and columns.
        boolean firstRowZeroes = false;
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[0].length; col++) {
                if(matrix[row][col] == 0) {
                    matrix[0][col] = 0;
                    if(row > 0) {
                        matrix[row][0] = 0;
                    } else {
                        firstRowZeroes = true;
                    }
                }
            }
        }
        // Fill in the inner matrix.
        for(int row = 1; row < matrix.length; row++) {
            for(int col = 1; col < matrix[0].length; col++) {
                if(matrix[0][col] == 0 || matrix[row][0] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }
        // Check if first column is zeroes.
        if(matrix[0][0] == 0) {
            for(int row = 0; row < matrix.length; row++) {
                matrix[row][0] = 0;
            }
        }
        // Check if first row is zeroes.
        if(firstRowZeroes) {
            for(int col = 0; col < matrix[0].length; col++) {
                matrix[0][col] = 0;
            }
        }
    }
}
