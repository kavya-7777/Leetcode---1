//2180. Count Integers With Even Digit Sum

class Solution {
    public boolean digitSum(int n){
        int sum = 0;
        while(n>0){
            sum += (n%10);
            n/=10;
        }
        return sum%2 == 0;
    }
    public int countEven(int num) {
        if(num==0) return 0;
        int count = 0;
        for(int i=1;i<=num;i++){
            if(digitSum(i)) count ++; 
        }
        return count;
    }
}