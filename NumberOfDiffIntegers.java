//1805. Number of Different Integers in a String

class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        int n = word.length();
        for(int i=0;i<n;i++){
            if(Character.isDigit(word.charAt(i))){
                while(i<n && word.charAt(i) == '0') ++i;
                int startIndex = i;
                while(startIndex<n && Character.isDigit(word.charAt(startIndex))) ++startIndex;
                set.add(word.substring(i,startIndex));
                i = startIndex;
            }
        }
        return set.size();
    }
}

// class Solution {
//     public int numDifferentIntegers(String word) {
//         String num = "";
//         Set<String> set = new HashSet<>();
//         for(int i=0;i<word.length();i++){
//             if(Character.isDigit(word.charAt(i))) num += word.charAt(i);
//             else{
//                 if(num.length() > 0) set.add(num.replaceFirst("^0+", ""));
//                 num = "";
//             }
//         }
//         if(num.length() > 0) set.add(num.replaceFirst("^0+", ""));
//         return set.size();
//     }
// }