<<<<<<< HEAD
//219. Contains Duplicate II

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(window.contains(nums[i])) return true;
            window.add(nums[i]);
            if(window.size() > k) window.remove(nums[i - k]);
        }
        return false;
    }
=======
//219. Contains Duplicate II

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(window.contains(nums[i])) return true;
            window.add(nums[i]);
            if(window.size() > k) window.remove(nums[i - k]);
        }
        return false;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}