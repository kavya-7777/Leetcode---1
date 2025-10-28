<<<<<<< HEAD
//202. Happy Number

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += (digit * digit);
                n /= 10;
            }
            n = sum;
        }

        return n == 1;
    }
}
=======
//202. Happy Number

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += (digit * digit);
                n /= 10;
            }
            n = sum;
        }

        return n == 1;
    }
}
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
