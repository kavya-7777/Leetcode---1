//709. To Lower Case

//StringBuilder is more optimized than String
class Solution {
    public String toLowerCase(String s) {
        StringBuilder lower = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch>='A' && ch<='Z') lower.append((char)(ch + 32));
            else lower.append(ch);
        }
        return lower.toString();
    }
}

// class Solution {
//     public String toLowerCase(String s) {
//         String lower = "";
//         for(char ch : s.toCharArray()){
//             if(ch>='A' && ch<='Z'){
//                 lower += (char)(ch + 32);
//             }
//             else lower += ch;
//         }
//         return lower;
//     }
// }