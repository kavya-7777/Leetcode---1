//387. First Unique Character in a String

class Solution {
    public int firstUniqChar(String s) {
        int[] len = new int[26];
        for(int i=0;i<s.length();i++){
            len[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(len[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}

/*
class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            boolean isUnique = true;
            int count = 1;
            for(int j=0;j<s.length();j++){
                if(i != j && s.charAt(i) == s.charAt(j)){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) return i;
        }
        return -1;
    }
}
*/