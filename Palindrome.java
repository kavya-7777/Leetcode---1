//9. Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,temp=x;
        if(x==0) return true;
        else if(x%10==0) return false;
        
        if(x<0) return false;

        while(temp>0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp/=10;
        }
        return x==rev;
    }
}