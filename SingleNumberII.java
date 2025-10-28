//137. Single Number II

class Solution {
    public int singleNumber(int[] nums) {
        int ones  = 0, twos = 0;
        for(int num : nums){
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
}

// class Solution {
//     public int singleNumber(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
//         }
//         for(Integer freq : map.keySet()){
//             if(map.get(freq) == 1) return freq;
//         }
//         return 0;
//     }
// }