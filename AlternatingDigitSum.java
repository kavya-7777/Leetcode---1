<<<<<<< HEAD
//2544. Alternating Digit Sum

class Solution {
    public int alternateDigitSum(int n) {
        String num = Integer.toString(n);
        int len = num.length();
        int sum=0;
        for(int i=0;i<len;i++){
            int dig = num.charAt(i) - '0';
            if(i%2!=0) dig = -(dig);
            sum += dig;
        }
        return sum;
    }
}
=======
//2544. Alternating Digit Sum

class Solution {
    public int alternateDigitSum(int n) {
        String num = Integer.toString(n);
        int len = num.length();
        int sum=0;
        for(int i=0;i<len;i++){
            int dig = num.charAt(i) - '0';
            if(i%2!=0) dig = -(dig);
            sum += dig;
        }
        return sum;
    }
}
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
