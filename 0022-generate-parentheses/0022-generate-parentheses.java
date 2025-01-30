class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve("", 0, 0, n, ans);
        return ans;
    }
    private void solve(String s, int open, int close, int total, List<String> ans){
        if(s.length()==2*total){
            ans.add(s);
            return;
        }
        if(open<total){
            solve(s+"(", open+1, close, total, ans);
        }
        if(close<open){
            solve(s+")", open, close+1, total, ans);
        }
    }
}