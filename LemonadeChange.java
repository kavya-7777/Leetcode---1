//860. Lemonade Change

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five  = 0, ten = 0;
        for(int rs : bills){
            if(rs == 5) five ++;
            else if(rs == 10){
                if(five > 0){
                    five --;
                    ten ++;
                }
                else return false;
            }
            else{
                if(five > 0 && ten > 0){
                    five --;
                    ten --;
                }
                else if(five >=3) five -= 3;
                else return false;
            }
        }
        return true;
    }
}