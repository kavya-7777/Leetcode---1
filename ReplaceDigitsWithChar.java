//1844. Replace All Digits with Characters

class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        for(int i=1;i<s.length();i+=2){
            arr[i] = (char)(arr[i - 1] + (arr[i] - '0'));
        }
        return new String(arr);
    }
}

// class Solution {
//     public String replaceDigits(String s) {
//         StringBuilder sb = new StringBuilder();
//         for(int i=0;i<s.length();i++){
//             if(Character.isDigit(s.charAt(i))){
//                 int ch = s.charAt(i) - '0' + (int)s.charAt(i - 1);
//                 sb.append((char)ch);
//             }else sb.append(s.charAt(i));
//         }
//         return sb.toString();
//     }
// }