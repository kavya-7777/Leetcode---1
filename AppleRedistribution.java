//3074. Apple Redistribution into Boxes

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total = 0, count = 0;
        for(int i=0;i<apple.length;i++){
            total += apple[i];
        }
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>=0;i--){
            total -= capacity[i];
            count++;
            if(total <= 0) return count;
        }
        return 0;
    }
}