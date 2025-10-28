<<<<<<< HEAD
//1365. How Many Numbers Are Smaller Than the Current Number

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];
        for(int num : nums) freq[num]++;
        for(int i=1;i<101;i++){
            freq[i] += freq[i-1];
        }
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = (nums[i] == 0) ? 0 : freq[nums[i] - 1];
        }
        return res;
    }
}

// class Solution {
//     public int[] smallerNumbersThanCurrent(int[] nums) {
//         int[] res = new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             int count = 0;
//             for(int j=0;j<nums.length;j++){
//                 if(i!=j && nums[j] < nums[i]) count++;
//             }
//             res[i] = count;
//         }
//         return res;
//     }
=======
//1365. How Many Numbers Are Smaller Than the Current Number

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];
        for(int num : nums) freq[num]++;
        for(int i=1;i<101;i++){
            freq[i] += freq[i-1];
        }
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = (nums[i] == 0) ? 0 : freq[nums[i] - 1];
        }
        return res;
    }
}

// class Solution {
//     public int[] smallerNumbersThanCurrent(int[] nums) {
//         int[] res = new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             int count = 0;
//             for(int j=0;j<nums.length;j++){
//                 if(i!=j && nums[j] < nums[i]) count++;
//             }
//             res[i] = count;
//         }
//         return res;
//     }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
// }