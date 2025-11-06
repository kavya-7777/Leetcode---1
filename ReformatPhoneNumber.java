//1694. Reformat Phone Number

class Solution {
    public String reformatNumber(String number) {
        String num = "";
        for(char n : number.toCharArray()){
            if(Character.isDigit(n)) num += n;
        }
        int n = num.length(), i = 0;
        StringBuilder res = new StringBuilder();
        while(n-i > 4){
            res.append(num.substring(i, i + 3)).append("-");
            i += 3;
        }
        if(n-i == 4) res.append(num.substring(i, i + 2)).append("-").append(num.substring(i + 2));
        else res.append(num.substring(i));
        return res.toString();
    }
}