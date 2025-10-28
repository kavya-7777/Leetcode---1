//88. Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m -1;
        int j = n-1;
        int k = m + n - 1;
        while(i>=0 && j>=0){
            if(nums1[i] < nums2[j]) nums1[k--] = nums2[j--];
            else nums1[k--] = nums1[i--];
        }

        while(j >= 0) nums1[k--] = nums2[j--];
    }
}

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         for (int i = 0; i < n; i++) {
//             nums1[m + i] = nums2[i];
//         }
//         for(int i=0;i<m+n;i++){
//             for(int j=0;j<m+n;j++){
//                 if(nums1[i] < nums1[j]){
//                     int temp = nums1[i];
//                     nums1[i] = nums1[j];
//                     nums1[j] = temp;
//                 }
//             }
//         }
//     }
// }

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         for (int i = 0; i < n; i++) {
//             nums1[m + i] = nums2[i];
//         }
//         Arrays.sort(nums1);
//     }
// }