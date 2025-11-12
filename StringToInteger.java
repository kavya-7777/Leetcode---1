//8. String to Integer (atoi)

class Solution {
    public int myAtoi(String s) {
        int n = s.length(), i = 0, sign = 1;
        long num = 0;
        while(i<n && s.charAt(i) == ' ') i++;
        if(i<n && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            num = num * 10 + (s.charAt(i) - '0');
            if(sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)(sign * num);
    }
}