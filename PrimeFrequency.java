//3591. Check if Any Element Has Prime Frequency

class Solution {
    public boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public boolean checkPrimeFrequency(int[] nums) {
        int[] freq = new int[nums.length];
        Arrays.fill(freq,1);
        int len = nums.length-1;
        for(int i=0;i<=len;i++){
            for(int j=i+1;j<=len;j++){
                if(freq[i]>=0){
                    if(nums[i]==nums[j]){
                        freq[i]++;
                        freq[j]=-1;
                    }
                }
            }
            if(isPrime(freq[i])){
                return true;
            }
        }
        return false;
    }
}