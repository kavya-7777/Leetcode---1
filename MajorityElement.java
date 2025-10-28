//169. Majority Element

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for(int num : nums){
            if(count == 0) candidate = num;
            count += (candidate == num)? 1 : -1;
        }

        return candidate;
    }
}

/*
class Solution {
    public int majorityElement(int[] nums) {
        int[] freq = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count = 1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count ++;
                    freq[j] = -1;
                }
            }
            if(freq[i] != -1){
                freq[i] = count;
                if(count > (nums.length/2)) return nums[i];
            }   
        }
        return 0;
    }
}
*/