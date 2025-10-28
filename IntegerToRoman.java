<<<<<<< HEAD
//12. Integer to Roman

class Solution {
    public String intToRoman(int num) {
        int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        
        for(int i=0;i<13 && num>0;i++){
            while(num >= value[i]){
                roman.append(symbol[i]);
                num -= value[i];
            }
        }

        return roman.toString();
    }
=======
//12. Integer to Roman

class Solution {
    public String intToRoman(int num) {
        int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        
        for(int i=0;i<13 && num>0;i++){
            while(num >= value[i]){
                roman.append(symbol[i]);
                num -= value[i];
            }
        }

        return roman.toString();
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}