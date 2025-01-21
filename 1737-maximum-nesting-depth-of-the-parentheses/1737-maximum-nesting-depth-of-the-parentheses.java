class Solution {
    public int maxDepth(String s) {
        int a = 0;
        int ans =0;
        for(char c : s.toCharArray()){
            if(c=='('){ a++;
            ans=Math.max(ans, a);}
            else if(c==')'){ a--;}
        }
        return ans;
    }
}