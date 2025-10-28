//153. Find Minimum in Rotated Sorted Array

class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]) left = mid + 1;
            else right = mid;
        }
        return nums[left];
    }
}

// class Solution {
//     public int findMin(int[] nums) {
//         int min = nums[0];
//         for(int i=0;i<nums.length;i++){
//             min = Math.min(min, nums[i]);
//         }
//         return min;
//     }
// }