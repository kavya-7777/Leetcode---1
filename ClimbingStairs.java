<<<<<<< HEAD
//70. Climbing Stairs

class Solution {
    public int climbStairs(int n) {
        int a = 0, b = 1, c = 0;
        for(int i=0;i<n;i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
=======
//70. Climbing Stairs

class Solution {
    public int climbStairs(int n) {
        int a = 0, b = 1, c = 0;
        for(int i=0;i<n;i++){
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}