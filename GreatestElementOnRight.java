//1299. Replace Elements with Greatest Element on Right Side

class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length, max = -1;
        for(int i=n-1;i>=0;i--){
            int temp = arr[i];
            arr[i] = max;
            if(temp > max) max = temp;
        }
        return arr;
    }
}

// class Solution {
//     public int[] replaceElements(int[] arr) {
//         int n = arr.length, i = 0;
//         for(i=0;i<n-1;i++){
//             int max = arr[i+1];
//             for(int j=i+1;j<n;j++){
//                 if(arr[j] > max) max = arr[j];
//             }
//             arr[i] = max;
//         }
//         arr[i] = -1;
//         return arr;
//     }
// }