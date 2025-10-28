<<<<<<< HEAD
//1351. Count Negative Numbers in a Sorted Matrix

class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=grid[i].length - 1;j>=0;j--){
                if(grid[i][j] >= 0) break;
                count++;
            }
        }
        return count;
    }
=======
//1351. Count Negative Numbers in a Sorted Matrix

class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=grid[i].length - 1;j>=0;j--){
                if(grid[i][j] >= 0) break;
                count++;
            }
        }
        return count;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}