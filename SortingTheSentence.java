//1859. Sorting the Sentence

class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] res = new String[words.length];
        for(int i=0;i<words.length;i++){
            int index = (int)(words[i].charAt(words[i].length() - 1) - '0');
            res[index - 1] = words[i].substring(0, words[i].length() - 1);
        }
        return String.join(" ", res);
    }
}