<<<<<<< HEAD
//1346. Check If N and Its Double Exist

class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i] == arr[j] * 2) return true;
            }
        }
        return false;
    }
=======
//1346. Check If N and Its Double Exist

class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i] == arr[j] * 2) return true;
            }
        }
        return false;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}