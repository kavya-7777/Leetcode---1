<<<<<<< HEAD
//1232. Check If It Is a Straight Line

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0], y1 = coordinates[0][1];
        int x2 = coordinates[1][0], y2 = coordinates[1][1];
        for(int i=0;i<coordinates.length;i++){
            int x = coordinates[i][0], y = coordinates[i][1];
            if((y - y2) * (x2 - x1) != (y2 - y1) * (x - x2)) return false;
        }
        return true;
    }
=======
//1232. Check If It Is a Straight Line

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0], y1 = coordinates[0][1];
        int x2 = coordinates[1][0], y2 = coordinates[1][1];
        for(int i=0;i<coordinates.length;i++){
            int x = coordinates[i][0], y = coordinates[i][1];
            if((y - y2) * (x2 - x1) != (y2 - y1) * (x - x2)) return false;
        }
        return true;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}