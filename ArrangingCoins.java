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
}