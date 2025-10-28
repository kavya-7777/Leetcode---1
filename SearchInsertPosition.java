<<<<<<< HEAD
//35. Search Insert Position

class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = n-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return mid;
            else if(target < nums[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return start; 
    }
}

// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int i;
//         for(i=0;i<nums.length;i++){
//             if(nums[i] == target) return i;
//             if(nums[i] > target) return i;
//         }
//         return i;
//     }
=======
//35. Search Insert Position

class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = n-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return mid;
            else if(target < nums[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return start; 
    }
}

// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int i;
//         for(i=0;i<nums.length;i++){
//             if(nums[i] == target) return i;
//             if(nums[i] > target) return i;
//         }
//         return i;
//     }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
// }