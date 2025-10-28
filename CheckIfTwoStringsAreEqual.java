<<<<<<< HEAD
//1662. Check If Two String Arrays are Equivalent

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        for(String word : word1){
            str1 = str1 + word;
        }
        for(String word : word2){
            str2 = str2 + word;
        }
        return str1.equals(str2);
    }
=======
//1662. Check If Two String Arrays are Equivalent

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        for(String word : word1){
            str1 = str1 + word;
        }
        for(String word : word2){
            str2 = str2 + word;
        }
        return str1.equals(str2);
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}