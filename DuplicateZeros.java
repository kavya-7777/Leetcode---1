<<<<<<< HEAD
//1089. Duplicate Zeros

class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zero = 0;
        for(int num : arr) if(num == 0) zero++;
        int i = n - 1;
        int j = n + zero - 1;
        while(i >= 0){
            if(arr[i] != 0){
                if(j < n) arr[j] = arr[i];
            }
            else{
                if(j < n) arr[j] = 0;
                j--;
                if(j < n) arr[j] = 0;
            }
            i--;
            j--;  
        }
    }
=======
//1089. Duplicate Zeros

class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zero = 0;
        for(int num : arr) if(num == 0) zero++;
        int i = n - 1;
        int j = n + zero - 1;
        while(i >= 0){
            if(arr[i] != 0){
                if(j < n) arr[j] = arr[i];
            }
            else{
                if(j < n) arr[j] = 0;
                j--;
                if(j < n) arr[j] = 0;
            }
            i--;
            j--;  
        }
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}