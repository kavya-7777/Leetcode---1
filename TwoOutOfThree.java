//2032. Two Out of Three

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] nums1Freq = new int[101];
        int[] nums2Freq = new int[101];
        int[] nums3Freq = new int[101];
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            nums1Freq[nums1[i]] = 1;
        }
        for(int j=0;j<nums2.length;j++){
            nums2Freq[nums2[j]] = 1;
        }
        for(int k=0;k<nums3.length;k++){
            nums3Freq[nums3[k]] = 1;
        }
        for(int i=0;i<101;i++){
            if(nums1Freq[i] + nums2Freq[i] + nums3Freq[i] >= 2) res.add(i);
        }
        return res;
    }
}

// class Solution {
//     public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
//         Map<Integer, Integer> freq = new HashMap<>();
//         addFreq(nums1, freq);
//         addFreq(nums2, freq);
//         addFreq(nums3, freq);
//         List<Integer> res = new ArrayList<>();
//         for(int n : freq.keySet()){
//             if(freq.get(n) >= 2) res.add(n);
//         }
//         return res;
//     }

//     private void addFreq(int[] nums, Map<Integer, Integer> freq){
//         Set<Integer> uniqueNums = new HashSet<>();
//         for(int n : nums){
//             uniqueNums.add(n);
//         }
//         for(int n : uniqueNums){
//             freq.put(n, freq.getOrDefault(n, 0) + 1);
//         }
//     }
// }