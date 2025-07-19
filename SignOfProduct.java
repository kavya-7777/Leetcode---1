//1822. Sign of the Product of an Array

class Solution {
    public int signFunc(int x){
        if(x>0) return 1;
        else if(x<0) return -1;
        return 0;
    }

    public int arraySign(int[] nums) {
        int sign = 1;
        for(int num : nums){
            if(num == 0) return signFunc(num);
            else if(num < 0) sign *= -1;
        }
        return sign;
    }
}