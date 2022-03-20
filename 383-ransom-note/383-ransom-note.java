class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(magazine.length() < ransomNote.length()) return false ;
        
        
        int[] hash = new int[26];
        
        for (int i = 0; i < magazine.length(); i++) {
            hash[magazine.charAt(i) - 97]++;
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--hash[ransomNote.charAt(i) - 97] < 0) {
                return false;
            }
        }
        return true;
 
}
}