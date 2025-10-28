<<<<<<< HEAD
//326. Power of Three

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }
=======
//326. Power of Three

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}