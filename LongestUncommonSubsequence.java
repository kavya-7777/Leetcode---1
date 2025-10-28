<<<<<<< HEAD
//521. Longest Uncommon Subsequence I

class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        return (a.length() > b.length())? a.length() : b.length();
    }
=======
//521. Longest Uncommon Subsequence I

class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        return (a.length() > b.length())? a.length() : b.length();
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}