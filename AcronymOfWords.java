//2828. Check if a String Is an Acronym of Words

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size() != s.length()) return false;
        for(int i=0;i<s.length();i++){
            if(words.get(i).charAt(0) != s.charAt(i)) return false;
        }
        return true;
    }
}

// class Solution {
//     public boolean isAcronym(List<String> words, String s) {
//         String acronym = "";
//         for(String word : words){
//             acronym += word.charAt(0);
//         }
//         return acronym.equals(s);
//     }
// }