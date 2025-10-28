<<<<<<< HEAD
//1304. Find N Unique Integers Sum up to Zero

class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int index = 0;
        for(int i=1;i<=n/2;i++){
            res[index++] = i;
            res[index++] = -i;
        }
        return res;
    }
=======
//1304. Find N Unique Integers Sum up to Zero

class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int index = 0;
        for(int i=1;i<=n/2;i++){
            res[index++] = i;
            res[index++] = -i;
        }
        return res;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}