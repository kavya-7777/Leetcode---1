<<<<<<< HEAD
//1512. Number of Good Pairs

//TC: O(n), SC: O(1)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[102];
        for(int num : nums){
            freq[num]++;
        }
        int pairs = 0;
        for(int count : freq){
            pairs += (count * (count - 1) /2);
        }
        return pairs;
    }
}

//TC: O(n), SC: O(n)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        int pairs = 0;
        for(Integer n : map.keySet()){
            int val = map.get(n);
            pairs += (val * (val - 1) / 2);
        }
        return pairs;
    }
}

//TC: O(n^2), SC: O(1)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]) count++;
            }
        }
        return count;
    }
=======
//1512. Number of Good Pairs

//TC: O(n), SC: O(1)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[102];
        for(int num : nums){
            freq[num]++;
        }
        int pairs = 0;
        for(int count : freq){
            pairs += (count * (count - 1) /2);
        }
        return pairs;
    }
}

//TC: O(n), SC: O(n)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        int pairs = 0;
        for(Integer n : map.keySet()){
            int val = map.get(n);
            pairs += (val * (val - 1) / 2);
        }
        return pairs;
    }
}

//TC: O(n^2), SC: O(1)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]) count++;
            }
        }
        return count;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}