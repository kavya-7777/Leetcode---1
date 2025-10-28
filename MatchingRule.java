//1773. Count Items Matching a Rule

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0, pos = 0;
        if(ruleKey.equals("type")) pos = 0;
        else if(ruleKey.equals("color")) pos = 1;
        else pos = 2;
        for(int i=0;i<items.size();i++){
            if((items.get(i).get(pos)).equals(ruleValue)) count++;
        }
        return count;
    }
}

// class Solution {
//     public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//         int count = 0;
//         for(int i=0;i<items.size();i++){
//             if(
//                 ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0)) ||
//                 ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1)) ||
//                 ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2))
//             )
//                     count++;
//         }
//         return count;
//     }
// }