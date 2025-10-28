<<<<<<< HEAD
//50. Pow(x, n)

class Solution {
    public double myPow(double x, int n) {
        long exp = n;
        if(exp < 0){
            x = 1/x;
            exp = -exp;
        }

        double res=1;
        while(exp>0){
            if(exp%2 == 1){
                res*=x;
            }
            x *= x;
            exp /= 2;
        }

        return res;
    }
=======
//50. Pow(x, n)

class Solution {
    public double myPow(double x, int n) {
        long exp = n;
        if(exp < 0){
            x = 1/x;
            exp = -exp;
        }

        double res=1;
        while(exp>0){
            if(exp%2 == 1){
                res*=x;
            }
            x *= x;
            exp /= 2;
        }

        return res;
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}