class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mp = new HashMap<>();
        // Map<Character, Integer> mp2 = new HashMap<>();
        for(char c : magazine.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (mp.getOrDefault(c, 0) == 0) {
                return false;  
            }
            mp.put(c, mp.get(c) - 1);  
        }
        return true;
         
    }
}