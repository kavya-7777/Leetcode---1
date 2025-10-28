<<<<<<< HEAD
//268. Missing Number

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;

        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        return total - sum;
    }
=======
//268. Missing Number

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;

        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        return total - sum;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}