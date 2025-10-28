<<<<<<< HEAD
//2427. Number of Common Factors

class Solution {
    public int commonFactors(int a, int b) {
        
        int count=0;
        int store = Math.min(a,b);
        for(int i=1;i<=store;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }

        return count;
    }
=======
//2427. Number of Common Factors

class Solution {
    public int commonFactors(int a, int b) {
        
        int count=0;
        int store = Math.min(a,b);
        for(int i=1;i<=store;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }

        return count;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}