<<<<<<< HEAD
//342. Power of Four

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
        while(n%4==0){
            n/=4;
        }
        return n==1;
    }
=======
//342. Power of Four

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
        while(n%4==0){
            n/=4;
        }
        return n==1;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}