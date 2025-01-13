class Solution {
    public int titleToNumber(String t) {
         int res =0;
        for(int i=0;i<t.length();i++){
            res = res*26 + (t.charAt(i)-'A'+1);
        }
        return res;
    }
}