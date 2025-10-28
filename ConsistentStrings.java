<<<<<<< HEAD
//1684. Count the Number of Consistent Strings

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] isAllowed = new boolean[26];
        for(char c : allowed.toCharArray()){
            isAllowed[c - 'a'] = true;
        }

        int count = 0;
        for(String word : words){
            boolean flag = true;
            for(char c : word.toCharArray()){
                if(!isAllowed[c - 'a']){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
=======
//1684. Count the Number of Consistent Strings

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] isAllowed = new boolean[26];
        for(char c : allowed.toCharArray()){
            isAllowed[c - 'a'] = true;
        }

        int count = 0;
        for(String word : words){
            boolean flag = true;
            for(char c : word.toCharArray()){
                if(!isAllowed[c - 'a']){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}