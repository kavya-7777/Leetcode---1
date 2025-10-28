<<<<<<< HEAD
//1480. Running Sum of 1d Array

class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=0;j<=i;j++){
                sum=sum+nums[j];
            }
            runningSum[i]=sum;
        }
        return runningSum;
    }
=======
//1480. Running Sum of 1d Array

class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=0;j<=i;j++){
                sum=sum+nums[j];
            }
            runningSum[i]=sum;
        }
        return runningSum;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}