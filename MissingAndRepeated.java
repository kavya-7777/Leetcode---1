//2965. Find Missing and Repeated Values

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid[0].length;
        int size = n * n;
        int[] count = new int[size + 1];
        for(int[] row : grid){
            for(int num : row){
                count[num]++;
            }
        }
        int duplicate = 0, missing = 0;
        for(int i=1;i<=size;i++){
            if(count[i] == 2) duplicate = i;
            else if(count[i] == 0) missing = i;
        }

        return new int[]{duplicate, missing};
    }
}

// class Solution {
//     public int[] findMissingAndRepeatedValues(int[][] grid) {
//         TreeSet<Integer> set = new TreeSet<>();
//         int repeat = 0;
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[i].length;j++){
//                 if (set.contains(grid[i][j])) repeat = grid[i][j];
//                 set.add(grid[i][j]);
//             }
//         }
//         int sum = 0;
//         int n = grid[0].length * grid[0].length;
//         int total = n * (n + 1) / 2;
//         for(int num : set){
//             sum += num;
//         }

//         return new int[]{repeat, total - sum};
//     }
// }