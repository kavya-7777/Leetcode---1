//2351. First Letter to Appear Twice

class Solution {
    public char repeatedCharacter(String s) {
        int[] seen = new int[26];
        for(int i=0;i<s.length();i++){
            if(seen[s.charAt(i) - 'a']==1) return s.charAt(i);
            seen[s.charAt(i) - 'a']++;
        }
        return '0';
    }
}