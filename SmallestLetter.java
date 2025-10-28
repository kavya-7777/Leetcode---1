<<<<<<< HEAD
//744. Find Smallest Letter Greater Than Target

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char c : letters){
            if(c > target){
                return c;
            }
        }
        return letters[0];
    }
=======
//744. Find Smallest Letter Greater Than Target

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char c : letters){
            if(c > target){
                return c;
            }
        }
        return letters[0];
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}