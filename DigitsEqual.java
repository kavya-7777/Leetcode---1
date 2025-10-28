//3461. Check If Digits Are Equal in String After Operations I

class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length() > 2){
            StringBuilder temp = new StringBuilder();
            for(int i=1;i<s.length();i++){
                int a = s.charAt(i) - '0';
                int b = s.charAt(i-1) - '0';
                int sum = (a+b) % 10;
                temp.append(sum);
            }
            s = temp.toString();
        }
        return s.charAt(0)==s.charAt(1);
    }
}