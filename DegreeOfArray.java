//697. Degree of an Array

class Solution {
    public int findShortestSubArray(int[] nums) {
        int max = 0;
        for(int num : nums){
            max = Math.max(max, num);
        }
        int[] count = new int[max + 1];
        int[] firstIndex = new int[max + 1];
        int[] lastIndex = new int[max + 1];
        for(int i=0;i<firstIndex.length;i++){
            firstIndex[i] = -1;
        }
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
            if(firstIndex[nums[i]] == -1) firstIndex[nums[i]] = i;
            lastIndex[nums[i]] = i;
        }
        int degree = 0;
        for(int freq : count){
            degree = Math.max(degree, freq);
        }
        int minLen = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count[nums[i]] == degree) minLen = Math.min(minLen, lastIndex[nums[i]] - firstIndex[nums[i]] + 1);
        }
        return minLen;
    }
}

// class Solution {
//     public int findShortestSubArray(int[] nums) {
//         int n = nums.length;
//         HashMap<Integer, int[]> map = new HashMap<>();
//         int degree = 0;
//         for(int i=0;i<n;i++){
//             if(!map.containsKey(nums[i])) map.put(nums[i], new int[]{1, i, i});
//             else{
//                 map.get(nums[i])[0]++;
//                 map.get(nums[i])[2] = i;
//             }
//             degree = Math.max(degree, map.get(nums[i])[0]);
//         }
//         int minLen = nums.length;
//         for(int[] info : map.values()){
//             if(info[0] == degree) minLen = Math.min(minLen, info[2] - info[1] + 1);
//         }
//         return minLen;
//     }
// }