<<<<<<< HEAD
//414. Third Maximum Number

class Solution {
    public int thirdMax(int[] nums) {
        Long first, second, third;
        first = second = third = Long.MIN_VALUE;
        for(int num : nums){
            long n = num;
            if(n == first || n == second || n== third) continue;
            if(n > first){
                third = second;
                second = first;
                first = n;
            }
            else if(n > second){
                third = second;
                second = n;
            }
            else if(n > third){
                third = n;
            }
        }
        return third == Long.MIN_VALUE ? first.intValue() : third.intValue();
    }
}

// class Solution {
//     public int thirdMax(int[] nums) {
//         TreeSet<Integer> set = new TreeSet<>();
//         for(int num : nums){
//             set.add(num);
//             if(set.size() > 3) set.pollFirst();
//         }
//         return (set.size() < 3)? set.last() : set.first();
//     }
=======
//414. Third Maximum Number

class Solution {
    public int thirdMax(int[] nums) {
        Long first, second, third;
        first = second = third = Long.MIN_VALUE;
        for(int num : nums){
            long n = num;
            if(n == first || n == second || n== third) continue;
            if(n > first){
                third = second;
                second = first;
                first = n;
            }
            else if(n > second){
                third = second;
                second = n;
            }
            else if(n > third){
                third = n;
            }
        }
        return third == Long.MIN_VALUE ? first.intValue() : third.intValue();
    }
}

// class Solution {
//     public int thirdMax(int[] nums) {
//         TreeSet<Integer> set = new TreeSet<>();
//         for(int num : nums){
//             set.add(num);
//             if(set.size() > 3) set.pollFirst();
//         }
//         return (set.size() < 3)? set.last() : set.first();
//     }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
// }