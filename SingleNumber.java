<<<<<<< HEAD
//136. Single Number

class Solution {
    public int singleNumber(int[] nums) {
        int singleNum = 0;
        for(int i=0;i<nums.length;i++){
            singleNum ^= nums[i];
        }
        return singleNum;
    }
}

/** 
class Solution {
    public int singleNumber(int[] nums) {
        int[] freq = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count = 1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                    freq[j] = -1;
                }
            }
            if(freq[i] != -1) freq[i] = count;
        }

        for(int i=0;i<nums.length;i++){
            if(freq[i] == 1) return nums[i];
        }
        return -1;
    }
}
=======
//136. Single Number

class Solution {
    public int singleNumber(int[] nums) {
        int singleNum = 0;
        for(int i=0;i<nums.length;i++){
            singleNum ^= nums[i];
        }
        return singleNum;
    }
}

/** 
class Solution {
    public int singleNumber(int[] nums) {
        int[] freq = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count = 1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                    freq[j] = -1;
                }
            }
            if(freq[i] != -1) freq[i] = count;
        }

        for(int i=0;i<nums.length;i++){
            if(freq[i] == 1) return nums[i];
        }
        return -1;
    }
}
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
*/