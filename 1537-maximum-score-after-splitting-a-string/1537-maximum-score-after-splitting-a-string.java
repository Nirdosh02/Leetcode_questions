class Solution {
    public int maxScore(String s) {
        int one =0;
        int zeros = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1') one++;
        }
        int max_s = 0;
        for(int i=0;i<s.length()-1; i++){
            if(s.charAt(i)=='1') one--;
            else zeros++;
            max_s=Math.max(max_s, one+zeros);
        }
        return max_s;
        
    }
}