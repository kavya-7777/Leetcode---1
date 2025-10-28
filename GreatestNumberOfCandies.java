<<<<<<< HEAD
//1431. Kids With the Greatest Number of Candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int num : candies) max = Math.max(max, num);
        for(int i=0;i<candies.length;i++){
            if(candies[i] + extraCandies >= max) list.add(true);
            else list.add(false);
        }
        return list;
    }
=======
//1431. Kids With the Greatest Number of Candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int num : candies) max = Math.max(max, num);
        for(int i=0;i<candies.length;i++){
            if(candies[i] + extraCandies >= max) list.add(true);
            else list.add(false);
        }
        return list;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}