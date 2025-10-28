<<<<<<< HEAD
//1528. Shuffle String

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
=======
//1528. Shuffle String

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}