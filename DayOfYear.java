//1154. Day of the Year

class Solution {
    public int months(int year, int month){
        int day = 0;
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            day = 31;
        else if(month==4 || month==6 ||month==9 ||month==11)
            day = 30;
        else if(month==2){
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) day = 29;
            else day = 28;
        }
        return day;
    }
    public int dayOfYear(String date) {
        int year = Integer.valueOf(date.substring(0,4));
        int month = Integer.valueOf(date.substring(5,7));
        int day = Integer.valueOf(date.substring(8,10));
        int days = 0;
        for(int i=0;i<month;i++){
            days += months(year,i);
        }
        
        return days + day;
        
    }
}