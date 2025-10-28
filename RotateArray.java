//189. Rotate Array

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end--;
        }
    }
}

// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         k = k % n;
//         int[] temp = new int[n];

//         for(int i=0;i<n;i++){
//             temp[(i + k) % n] = nums[i];
//         }
//         for(int i=0;i<n;i++){
//             nums[i] = temp[i];
//         }
//     }
// }

// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         for(int i=0;i<k;i++){
//             for(int j=n-2;j>=0;j--){
//                 int temp = nums[j];
//                 nums[j] = nums[j+1];
//                 nums[j+1] = temp;
//             }
//         }
//     }
// }