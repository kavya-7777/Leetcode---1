<<<<<<< HEAD
//383. Ransom Note

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];
        for(char c : magazine.toCharArray()){
            letters[c-'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            if(letters[c-'a']==0) return false;
            letters[c-'a']--;
        }
        return true;
    }
=======
//383. Ransom Note

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];
        for(char c : magazine.toCharArray()){
            letters[c-'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            if(letters[c-'a']==0) return false;
            letters[c-'a']--;
        }
        return true;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}