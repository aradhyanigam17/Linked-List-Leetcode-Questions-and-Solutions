class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length ;

        boolean[] rows = new boolean[r] ;
        boolean[] cols = new boolean[c] ;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true ;
                }
            }
        }

        for (int i = 0 ; i < r ; i++){
            if(rows[i]){
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 0 ; j < c ; j++){
            if(cols[j]){
                for (int i = 0; i < r; i++) {
                    matrix[i][j] = 0;
                }
            }
        }   
    }
}