<<<<<<< HEAD
//441. Arranging Coins

class Solution {
    public int arrangeCoins(int n) {
        if(n<=0) return 0;
        if(n==1) return 1;
        int count = 0;
        for(int i=1;i<=n;i++){
            count++;
            n-=i;
        }
        return count;
    }
=======
//441. Arranging Coins

class Solution {
    public int arrangeCoins(int n) {
        if(n<=0) return 0;
        if(n==1) return 1;
        int count = 0;
        for(int i=1;i<=n;i++){
            count++;
            n-=i;
        }
        return count;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}