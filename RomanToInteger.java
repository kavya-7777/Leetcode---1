//13. Roman to Integer

class Solution {
    public int romanToInt(String s) {
        int[] value = new int[256];
        value['I'] = 1;
        value['V'] = 5;
        value['X'] = 10;
        value['L'] = 50;
        value['C'] = 100;
        value['D'] = 500;
        value['M'] = 1000;

        int res=0;
        for(int i=0;i<s.length();i++){
            if( (i+1 < s.length()) && (value[s.charAt(i)] < value[s.charAt(i+1)]) ) 
                res -= value[s.charAt(i)];
            else 
                res += value[s.charAt(i)];  
        }

        return res;
    }
}