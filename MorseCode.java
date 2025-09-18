//804. Unique Morse Code Words

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                        "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                        "..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String word : words){
            String morse = new String();
            for(char c : word.toCharArray()){
                morse = morse.concat(code[c - 'a']);
            }
            set.add(morse);
        }
        return set.size();
    }
}