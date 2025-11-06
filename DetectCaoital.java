//520. Detect Capital

class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
        for(char ch : word.toCharArray()){
            if(ch>='A' && ch<='Z') upperCount++;
        }
        int n = word.length();
        if(upperCount == n) return true;
        if(upperCount == 0) return true;
        if(upperCount == 1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;
    }
}