//500. Keyboard Row

class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for(String word : words){
            String lower = word.toLowerCase();
            String row = (row1.contains(lower.charAt(0) + "")) ? row1 :
                         (row2.contains(lower.charAt(0) + "")) ? row2 : row3;
            boolean isValid = true;
            for(char c : lower.toCharArray()){
                if(!row.contains(c + "")){
                    isValid = false;
                    break;
                }
            }
            if(isValid) list.add(word);
        }
        return list.toArray(new String[0]);
    }
}