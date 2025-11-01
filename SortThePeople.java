//2418. Sort the People

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for(int i=0;i<heights.length;i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int index = 0;
        for(int i=heights.length-1;i>=0;i--){
            names[index++] = map.get(heights[i]);
        }
        return names;
    }
}

// class Solution {
//     public String[] sortPeople(String[] names, int[] heights) {
//         for(int i=0;i<heights.length;i++){
//             for(int j=i+1;j<heights.length;j++){
//                 if(heights[i] < heights[j]){
//                     int temp = heights[i];
//                     heights[i] = heights[j];
//                     heights[j] = temp;
//                     String stemp = names[i];
//                     names[i] = names[j];
//                     names[j] = stemp;
//                 }
//             }
//         }
//         return names;
//     }
// }