<<<<<<< HEAD
//171. Excel Sheet Column Number

class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for(int i=0;i<columnTitle.length();i++){
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
=======
//171. Excel Sheet Column Number

class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for(int i=0;i<columnTitle.length();i++){
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}