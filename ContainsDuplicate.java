<<<<<<< HEAD
//217. Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]) return true;
        }
        return false;
    }
}

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int num : nums){
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }
//         for(int freq : map.values()){
//             if(freq > 1) return true;
//         }
//         return false;
//     }
=======
//217. Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]) return true;
        }
        return false;
    }
}

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int num : nums){
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }
//         for(int freq : map.values()){
//             if(freq > 1) return true;
//         }
//         return false;
//     }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
// }