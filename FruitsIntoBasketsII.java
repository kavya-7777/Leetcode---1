//3477. Fruits Into Baskets II

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int alloted = 0;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(fruits[i] <= baskets[j]){
                    alloted++;
                    baskets[j] = -1;
                    break;
                }
            }
        }
        return fruits.length - alloted;
    }
}

// class Solution {
//     public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
//         boolean[] used = new boolean[fruits.length];
//         int count = 0;
//         for(int fruit : fruits){
//             boolean placed = false;
//             for(int i=0;i<baskets.length;i++){
//                 if(!used[i] && fruit <= baskets[i]){
//                     placed = true;
//                     used[i] = true;
//                     break;
//                 }
//             }
//             if(!placed) count++;
//         }
//         return count;
//     }
// }