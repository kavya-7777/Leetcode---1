//2843. Count Symmetric Integers

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        
        for(int i=low;i<=high;i++){
            String num = Integer.toString(i);
            int len = num.length();
            
            if(len % 2 != 0) continue;

            else{
                int sum1 = 0, sum2 = 0;
                for (int j = 0; j < len / 2; j++) {
                    sum1 += num.charAt(j) - '0';
                }
                for (int j = len / 2; j < len; j++) {
                    sum2 += num.charAt(j) - '0';
                }
                if (sum1 == sum2) count++;
            }
        }
        return count;
    }
}