<<<<<<< HEAD
//929. Unique Email Addresses

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email : emails){
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];
            if(local.contains("+")) local = local.substring(0,local.indexOf("+"));
            local = local.replace(".","");
            String valid = local + "@" + domain;
            set.add(valid);
        }
        return set.size();
    }
=======
//929. Unique Email Addresses

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email : emails){
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];
            if(local.contains("+")) local = local.substring(0,local.indexOf("+"));
            local = local.replace(".","");
            String valid = local + "@" + domain;
            set.add(valid);
        }
        return set.size();
    }
>>>>>>> be6ce0b427078b1421d5dd74adb2300dc02daeec
}