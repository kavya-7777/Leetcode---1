<<<<<<< HEAD
//2485. Find the Pivot Integer

class Solution {
    public int pivotInteger(int n) {
        int total = 0;
        for(int i=1;i<=n;i++){
            total += i;
        }
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
            if(sum == total - sum + i) return i;
        }
        return -1;
    }
=======
//2485. Find the Pivot Integer

class Solution {
    public int pivotInteger(int n) {
        int total = 0;
        for(int i=1;i<=n;i++){
            total += i;
        }
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
            if(sum == total - sum + i) return i;
        }
        return -1;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}