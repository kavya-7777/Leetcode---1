<<<<<<< HEAD
//645. Set Mismatch

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1, missing = -1;
        boolean[] seen = new boolean[n + 1];
        for(int num : nums){
            if(seen[num]) duplicate = num;
            seen[num] = true;
        }
        for(int i=1;i<=n;i++){
            if(!seen[i]){
                missing = i;
                break;
            }
        }
        return new int[]{duplicate, missing};
    }
}

// class Solution {
//     public int[] findErrorNums(int[] nums) {
//         int n = nums.length, duplicate = 0, sum = 0;
//         Set<Integer> set = new HashSet<>();
//         for(int num : nums){
//             if(set.contains(num)) duplicate = num;
//             set.add(num);
//         }
//         for(int num : set){
//             sum += num;
//         }
//         int total = n * (n + 1) / 2;
//         return new int[]{duplicate, total - sum};
//     }
=======
//645. Set Mismatch

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1, missing = -1;
        boolean[] seen = new boolean[n + 1];
        for(int num : nums){
            if(seen[num]) duplicate = num;
            seen[num] = true;
        }
        for(int i=1;i<=n;i++){
            if(!seen[i]){
                missing = i;
                break;
            }
        }
        return new int[]{duplicate, missing};
    }
}

// class Solution {
//     public int[] findErrorNums(int[] nums) {
//         int n = nums.length, duplicate = 0, sum = 0;
//         Set<Integer> set = new HashSet<>();
//         for(int num : nums){
//             if(set.contains(num)) duplicate = num;
//             set.add(num);
//         }
//         for(int num : set){
//             sum += num;
//         }
//         int total = n * (n + 1) / 2;
//         return new int[]{duplicate, total - sum};
//     }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
// }