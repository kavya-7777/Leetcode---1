//258. Add Digits

class Solution {

    public int findDigits(int n){
        int digit=0;

        if (n==0) return 1;
        while(n>0){
            digit++;
            n/=10;
        }

        return digit;
    }

    public int findSum(int n){
        int sum=0;

        int temp = n;
        while(temp>0){
            sum+=(temp%10);
            temp/=10;
        }

        return sum;
    }

    public int addDigits(int num) {
        int dig = findDigits(num),sum;
        do{
            sum = findSum(num);
            num=sum;
            dig = findDigits(sum);
        }while(dig>1);

        return sum;
    }
}

/*                                           
class Solution {                                  //Mathematical trick
    public int addDigits(int num) {
        if(num==0)
            return 0;
        else if(num%9==0)
            return 9;
        else return num%9;
        
    }
}
*/