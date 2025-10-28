//2942. Find Words Containing Character

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x) != -1) res.add(i);
        }
        return res;
    }
}

// class Solution {
//     public List<Integer> findWordsContaining(String[] words, char x) {
//         List<Integer> res = new ArrayList<>();
//         for(int i=0;i<words.length;i++){
//             for(int j=0;j<words[i].length();j++){
//                 char ch = words[i].charAt(j);
//                 if(ch == x){
//                     res.add(i);
//                     break;
//                 }
//             }
//         }
//         return res;
//     }
// }