//389. Find the Difference

class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];
        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            count[ch - 'a']--;
            if(count[ch - 'a'] < 0) return ch;
        }
        return ' ';
    }
}

// class Solution {
//     public char findTheDifference(String s, String t) {
//         int[] count = new int[26];
//         for(int i=0;i<t.length();i++){
//             count[t.charAt(i) - 'a']++;
//         }
//         for(int i=0;i<s.length();i++){
//             count[s.charAt(i) - 'a']--;
//         }
//         for(int i=0;i<26;i++){
//             if(count[i] == 1) return (char)(97 + i);
//         }
//         return ' ';
//     }
// }