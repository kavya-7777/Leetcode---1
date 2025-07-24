//29. Divide Two Integers

class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long dividend1 = Math.abs((long) dividend);
        long divisor1 = Math.abs((long) divisor);
        int count = 0;

        while (dividend1 >= divisor1) {
            long temp = divisor1;
            int multiple = 1;

            while (dividend1 >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            dividend1 -= temp;
            count += multiple;
        }

        if ((dividend < 0) ^ (divisor < 0)) {
            count = -count;
        }

        return count;
    }
}
