<<<<<<< HEAD
//263. Ugly Number

class Solution {
    public boolean isUgly(int n) {
        if(n <= 0) return false;

        while(n % 2 == 0) n /= 2;
        while(n % 3 == 0) n /= 3;
        while(n % 5 == 0) n /= 5;

        return n==1;
    }
=======
//263. Ugly Number

class Solution {
    public boolean isUgly(int n) {
        if(n <= 0) return false;

        while(n % 2 == 0) n /= 2;
        while(n % 3 == 0) n /= 3;
        while(n % 5 == 0) n /= 5;

        return n==1;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}