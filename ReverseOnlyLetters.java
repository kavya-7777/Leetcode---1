//917. Reverse Only Letters

class Solution {
    public String reverseOnlyLetters(String s) {
        char[] str = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if(!Character.isAlphabetic(str[i])) {
                i++;
            } else if(!Character.isAlphabetic(str[j])) {
                j--;
            } else {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
        }
        return new String(str);
    }
}
