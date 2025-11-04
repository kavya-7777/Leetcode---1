//2129. Capitalize the Title

class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        int n = words.length;
        title = "";
        for(int i=0;i<n;i++){
            if(words[i].length() <= 2) words[i] = words[i].toLowerCase();
            else{
                words[i] = words[i].toLowerCase();
                words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
            }
            title += words[i];
            if(i < n-1) title += " ";
        }
        return title;
    }
}