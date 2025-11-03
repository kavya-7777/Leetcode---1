//3340. Check Balanced String

class Solution {
    public boolean isBalanced(String num) {
        int sum = 0;
        for(int i=0;i<num.length();i++){
            if(i % 2 == 0) sum += num.charAt(i) - '0';
            else sum -= num.charAt(i) -'0';
        }
        return sum == 0;
    }
}

// class Solution {
//     public boolean isBalanced(String num) {
//         int evenSum = 0, oddSum = 0;
//         for(int i=0;i<num.length();i++){
//             int n = num.charAt(i) - '0';
//             if(i%2 == 0) evenSum += n;
//             else oddSum += n;
//         }
//         return evenSum == oddSum;
//     }
// }