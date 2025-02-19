class Solution {
    public String getHappyString(int n, int k) {
        char[] hs = new char[3];
        hs[0]='a';
        hs[1]='b';
        hs[2]='c';
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        solve(n, ans, sb, hs);
        if(ans.size()<k){
            return "";
        }
        return ans.get(k-1);
    }
    public void solve(int n, ArrayList<String> ans, StringBuilder sb, char[] hs){
        if(sb.length()==n){
            ans.add(sb.toString());
            return;
        }

        for(int i=0; i<3; i++){
            if(sb.length()==0 || sb.charAt(sb.length()-1)!=hs[i] ){
                sb.append(hs[i]);
                solve(n, ans, sb, hs);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }

}