<<<<<<< HEAD
//69. Sqrt(x)

class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;

        long r = x;
        while (r * r > x) {
            r = (r + x / r) / 2;
        }

        return (int) r;
    }
=======
//69. Sqrt(x)

class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;

        long r = x;
        while (r * r > x) {
            r = (r + x / r) / 2;
        }

        return (int) r;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}