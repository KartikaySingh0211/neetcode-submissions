class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int L = 0;
        int R = ROWS * COLS - 1;

        while(L <= R){
            int M = L + (R - L) / 2;
            int ROW = M / COLS;
            int COL = M % COLS;

            if(matrix[ROW][COL] > target)
                R = M - 1;
            else if(matrix[ROW][COL] < target)
                L = M + 1;
            else
                return true;
        }

        return false;

    }
}
