<<<<<<< HEAD
//27. Remove Element

class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
=======
//27. Remove Element

class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}