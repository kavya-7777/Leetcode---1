//628. Maximum Product of Three Numbers

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int prod1 = nums[0]*nums[1]*nums[len-1];
        int prod2 = nums[len-1]*nums[len-2]*nums[len-3];
        int prod = (prod1 > prod2)? prod1 : prod2;
        return prod; 
    }
}