<<<<<<< HEAD
//747. Largest Number At Least Twice of Others

class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0, index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        for(int num : nums){
            if(num == max) continue;
            if(max < 2*num) return -1;
        }
        return index;
    }
=======
//747. Largest Number At Least Twice of Others

class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0, index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        for(int num : nums){
            if(num == max) continue;
            if(max < 2*num) return -1;
        }
        return index;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}