class Solution {
    public boolean canConstruct(String s, int k) {
        if (k > s.length()) return false;
        int bitmask = 0;
        for(char c:s.toCharArray()){
            bitmask ^= (1 << (c-'a'));
        }
        int cnt = Integer.bitCount(bitmask);
        return cnt <= k;
    }
}