<<<<<<< HEAD
//1051. Height Checker

class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] expected = new int[n];
        for(int i=0;i<n;i++){
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        int diff = 0;
        for(int i=0;i<n;i++){
            if(heights[i] != expected[i]) diff++;
        }
        return diff;
    }
=======
//1051. Height Checker

class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] expected = new int[n];
        for(int i=0;i<n;i++){
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        int diff = 0;
        for(int i=0;i<n;i++){
            if(heights[i] != expected[i]) diff++;
        }
        return diff;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}