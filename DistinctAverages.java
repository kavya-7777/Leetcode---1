//2465. Number of Distinct Averages

class Solution {
    public int distinctAverages(int[] nums) {
        int n = nums.length;
        Set<Double> averages = new HashSet<>();
        Arrays.sort(nums);
        int i = 0, j = n-1;
        while(i<j){
             Double avg = (nums[i] + nums[j]) / 2.0;
             averages.add(avg);
             i++;
             j--;
        }
        return averages.size();
    }
}