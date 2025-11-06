//434. Number of Segments in a String

class Solution {
    public int countSegments(String s) {
        String[] segments = s.split(" ");
        int count = 0;
        for(String segment : segments){
            if(!segment.isEmpty()) count++;
        }
        return count;
    }
}

// class Solution {
//     public int countSegments(String s) {
//         s = s.trim();
//         if(s.length() == 0) return 0;
//         String[] segments = s.split("\\s+");
//         return segments.length;
//     }
// }