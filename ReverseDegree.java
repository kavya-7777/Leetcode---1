//3498. Reverse Degree of a String

class Solution {
    public int reverseDegree(String s) {
        int sum = 0, index = 1;
        for(int i=0;i<s.length();i++){
            int reversedIndex = Math.abs((s.charAt(i) - 'a') - 26);
            sum += (reversedIndex * index);
            index++;
        }
        return sum;
    }
}