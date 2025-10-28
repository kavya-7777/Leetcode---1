<<<<<<< HEAD
//504. Base 7
class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        StringBuilder base7 = new StringBuilder();
        int n = Math.abs(num);
        while(n > 0){
            base7.append(n % 7);
            n /= 7;
        }
        if(num < 0) base7.append("-");
        return base7.reverse().toString();
    }
}

/*
class Solution {
    public String convertToBase7(int num) {
        return Integer.toString(num,7);
    }
}
=======
//504. Base 7
class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        StringBuilder base7 = new StringBuilder();
        int n = Math.abs(num);
        while(n > 0){
            base7.append(n % 7);
            n /= 7;
        }
        if(num < 0) base7.append("-");
        return base7.reverse().toString();
    }
}

/*
class Solution {
    public String convertToBase7(int num) {
        return Integer.toString(num,7);
    }
}
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
*/