//66. Plus One

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        for(int i=n-1;i>=0;i--){
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
            if(carry == 0) break;
        }
        if(carry == 1){
            int[] res = new int[n+1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}

// class Solution {
//     public int[] plusOne(int[] digits) {
//         int n = digits.length;
//         for(int i=n-1;i>=0;i--){
//             if(digits[i] < 9){
//                 digits[i]++;
//                 return digits;
//             }
//             digits[i] = 0;
//         }
//         int[] res = new int[n+1];
//         res[0] = 1;
//         return res;
//     }
// }