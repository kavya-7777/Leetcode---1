//119. Pascal's Triangle II

class Solution {
     public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        int n=rowIndex;
        long val = 1;
        for (int k = 0; k <= n; k++) {
            list.add((int)(val));
            val = val * (n - k) / (k + 1);
        }
        return list;
    }
    
}

// class Solution {
//     public List<Integer> getRow(int rowIndex) {
//         List<Integer> row = new ArrayList<>();
//         row.add(1);
//         for(int i=1;i<=rowIndex;i++){
//             for(int j=i-1;j>0;j--){
//                 row.set(j, row.get(j-1) + row.get(j));
//             }
//             row.add(1);
//         }
//         return row;
//     }
// }

// class Solution {
//     public List<Integer> getRow(int rowIndex) {
//         List<List<Integer>> triangle = new ArrayList<>();
//         for(int i=0;i<rowIndex+1;i++){
//             List<Integer> row = new ArrayList<>();
//             for(int j=0;j<=i;j++){
//                 if(j==0 || j==i) row.add(1);
//                 else{
//                     int val = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
//                     row.add(val);
//                 }
//             }
//             triangle.add(row);
//             if(i == rowIndex) return row;
//         }
//         return null;
//     }
// }