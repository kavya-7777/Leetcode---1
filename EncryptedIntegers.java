//3079. Find the Sum of Encrypted Integers

class Solution {
    public int encrypt(int n){
        int max = 0, len = 0;
        String num = new String();
        while(n>0){
            if(n % 10 > max) max = n%10;
            n/=10;
            len++;
        }
        for(int i=0;i<len;i++){
            num = num + max;
        }
        return Integer.parseInt(num);
    }
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += encrypt(num);
        }
        return sum;
    }
}