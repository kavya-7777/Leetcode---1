//2423. Remove Letter To Equalize Frequency

class Solution {
    public boolean equalFrequency(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : word.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : word.toCharArray()){
            map.put(c, map.get(c) - 1);
            if(map.get(c) == 0) map.remove(c);
            if(allEqual(map)) return true;
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return false;
    }

    public boolean allEqual(HashMap<Character, Integer> map){
        int first = -1;
        for(int freq : map.values()){
            if(first == -1) first = freq;
            else if(first != freq) return false;
        }
        return true;
    }

}