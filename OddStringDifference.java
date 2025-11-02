//2451. Odd String Difference

class Solution {
    public String oddString(String[] words) {
        int[] diff0 = getDiff(words[0]);
        int[] diff1 = getDiff(words[1]);
        int[] diff2 = getDiff(words[2]);
        int[] common = (Arrays.equals(diff0, diff1) || Arrays.equals(diff0, diff2)) ? diff0 : diff1;
        for(String word : words){
            if(!Arrays.equals(common, getDiff(word))) return word;
        }
        return null;
    }

    public int[] getDiff(String word){
        int n = word.length();
        int[] diff = new int[n - 1];
        for(int i=0;i<n-1;i++){
            diff[i] = word.charAt(i + 1) - word.charAt(i);
        }
        return diff;
    }
}