<<<<<<< HEAD
//867. Transpose Matrix

class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
=======
//867. Transpose Matrix

class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}