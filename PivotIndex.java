//724. Find Pivot Index

class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0, total = 0;
        for(int num : nums){
            total += num;
        }
        for(int i=0;i<nums.length;i++){
            total -= nums[i];
            if(total == leftSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}