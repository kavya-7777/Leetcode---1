//3174. Clear Digits

class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(Character.isDigit(sb.charAt(i))){
                sb.deleteCharAt(i);
                if(i-1 >= 0){
                    sb.deleteCharAt(i - 1);
                    i--;
                }
                i--;
            }
        }
        return sb.toString();
    }
}