<<<<<<< HEAD
//231. Power of Two

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==0) return false; 
        while(n%2==0){
            n/=2;
        }
        return n==1;
    }
=======
//231. Power of Two

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==0) return false; 
        while(n%2==0){
            n/=2;
        }
        return n==1;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}