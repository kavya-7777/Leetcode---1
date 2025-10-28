<<<<<<< HEAD
//1394. Find Lucky Integer in an Array

class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        int[] freq = new int[502];
        for(int num : arr){
            freq[num]++;
        }
        for(int i=501;i>=1;i--){
            if(freq[i] == i){
                return i;
            }
        }
        return -1;
    }
}

/*
class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count ++;
                    freq[j] = -1;
                }
            }
            if(freq[i] != -1){
                freq[i] = count;
            } 
        }
        int max = -1;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==arr[i] && arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
=======
//1394. Find Lucky Integer in an Array

class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        int[] freq = new int[502];
        for(int num : arr){
            freq[num]++;
        }
        for(int i=501;i>=1;i--){
            if(freq[i] == i){
                return i;
            }
        }
        return -1;
    }
}

/*
class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count ++;
                    freq[j] = -1;
                }
            }
            if(freq[i] != -1){
                freq[i] = count;
            } 
        }
        int max = -1;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==arr[i] && arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
*/