//405. Convert a Number to Hexadecimal

class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";

        char[] value = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder hex = new StringBuilder();
        long n = num & 0xFFFFFFFFL;

        while(n > 0){
            int rem = (int)(n % 16);
            hex.append(value[rem]);
            n /= 16;
        }

        return hex.reverse().toString();

    }
}