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
