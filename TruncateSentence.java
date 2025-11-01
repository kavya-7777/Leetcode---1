//1816. Truncate Sentence

class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        String res = "";
        for(int i=0;i<k;i++){
            res += arr[i];
            if(i < k - 1)res += " ";
        }
        return res;
    }
}

// class Solution {
//     public String truncateSentence(String s, int k) {
//         String res = "";
//         int count = 0;
//         for(char ch : s.toCharArray()){
//             if(ch == ' '){
//                 count++;
//                 if(count == k) return res;
//             }
//             res += ch;
//         }
//         return res;
//     }
// }