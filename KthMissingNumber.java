<<<<<<< HEAD
//1539. Kth Missing Positive Number

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int i = 0, missingCount = 0, num = 1;
        while(true){
            if(i < n && arr[i] == num) i++;
            else{
                missingCount++;
                if(missingCount == k) return num;
            }
            num++;
        }
    }
=======
//1539. Kth Missing Positive Number

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int i = 0, missingCount = 0, num = 1;
        while(true){
            if(i < n && arr[i] == num) i++;
            else{
                missingCount++;
                if(missingCount == k) return num;
            }
            num++;
        }
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}