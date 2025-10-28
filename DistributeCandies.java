<<<<<<< HEAD
//575. Distribute Candies

class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int n : candyType){
            set.add(n);
            if(set.size() == candyType.length / 2) break;
        }
        return set.size();
    }
}

// class Solution {
//     public int distributeCandies(int[] candyType) {
//         Set<Integer> set = new HashSet<>();
//         for(int num : candyType){
//             set.add(num);
//         }
//         int type = set.size();
//         int limit = candyType.length / 2;
//         return Math.min(type, limit);
//     }
=======
//575. Distribute Candies

class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int n : candyType){
            set.add(n);
            if(set.size() == candyType.length / 2) break;
        }
        return set.size();
    }
}

// class Solution {
//     public int distributeCandies(int[] candyType) {
//         Set<Integer> set = new HashSet<>();
//         for(int num : candyType){
//             set.add(num);
//         }
//         int type = set.size();
//         int limit = candyType.length / 2;
//         return Math.min(type, limit);
//     }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
// }