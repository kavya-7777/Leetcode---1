<<<<<<< HEAD
//1952. Three Divisors

class Solution {
    public boolean isThree(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
            if(count == 3 ){
                for(int j=i+1;j<=n;j++){
                    if(n%j==0) return false;
                }
                return true;
            }
        }
        return false;
        
    }
=======
//1952. Three Divisors

class Solution {
    public boolean isThree(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
            if(count == 3 ){
                for(int j=i+1;j<=n;j++){
                    if(n%j==0) return false;
                }
                return true;
            }
        }
        return false;
        
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}