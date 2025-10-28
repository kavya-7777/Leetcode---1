//168. Excel Sheet Column Title

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            char ch = (char)((columnNumber % 26) + 'A');
            result.append(ch);
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }
}