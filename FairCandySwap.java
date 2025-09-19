//888. Fair Candy Swap

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0, bobSum = 0;
        Set<Integer> set = new HashSet<>();
        for(int n : aliceSizes) aliceSum += n;
        for(int n : bobSizes){
            set.add(n);
            bobSum += n;
        }
        int diff = (aliceSum - bobSum) / 2;
        for(int a : aliceSizes){
            int b = a - diff;
            if(set.contains(b)) return new int[]{a, b};
        }
        return new int[]{};
    }
}