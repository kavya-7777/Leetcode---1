<<<<<<< HEAD
//2068. Check Whether Two Strings are Almost Equivalent

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        for(int i=0;i<word1.length();i++){
            freq1[word1.charAt(i) - 'a']++;
            freq2[word2.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(Math.abs(freq1[i] - freq2[i]) > 3) return false;
        }
        return true;
    }
=======
//2068. Check Whether Two Strings are Almost Equivalent

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        for(int i=0;i<word1.length();i++){
            freq1[word1.charAt(i) - 'a']++;
            freq2[word2.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(Math.abs(freq1[i] - freq2[i]) > 3) return false;
        }
        return true;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}