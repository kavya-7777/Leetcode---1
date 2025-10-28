<<<<<<< HEAD
//1672. Richest Customer Wealth

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>max) max=sum;
        }
        return max;
    }
=======
//1672. Richest Customer Wealth

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>max) max=sum;
        }
        return max;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}