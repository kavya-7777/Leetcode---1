//26. Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int n = nums.length, count = 0;
//         TreeSet<Integer> set = new TreeSet<>();
//         for(int i=0;i<n;i++){
//             set.add(nums[i]);
//         }
//         int j=0;
//         for(int x : set){
//             nums[j++] = x;
//         }

//         return set.size();
//     }
// }