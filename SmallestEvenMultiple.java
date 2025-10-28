//2413. Smallest Even Multiple

class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2!=0) n*=2;
        return n;
    }
}