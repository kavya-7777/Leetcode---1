<<<<<<< HEAD
//1342. Number of Steps to Reduce a Number to Zero

class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            if(num%2==0){
                num/=2;
                count++;
            } 
            else{
                num-=1;
                count++;
            } 
        }
        return count;
    }
=======
//1342. Number of Steps to Reduce a Number to Zero

class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            if(num%2==0){
                num/=2;
                count++;
            } 
            else{
                num-=1;
                count++;
            } 
        }
        return count;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}