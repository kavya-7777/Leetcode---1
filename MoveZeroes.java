<<<<<<< HEAD
//283. Move Zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length, index = 0;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i] != 0)
                res[index++] = nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i] = res[i];
        }
    }
=======
//283. Move Zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length, index = 0;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i] != 0)
                res[index++] = nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i] = res[i];
        }
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}