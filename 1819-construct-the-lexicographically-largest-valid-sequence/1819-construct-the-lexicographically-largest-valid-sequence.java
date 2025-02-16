class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] ans = new int[2*n-1];
        boolean[] vis = new boolean[n+1];
        solve(0, vis, ans, n);
        return ans;
    }
    public boolean solve(int idx, boolean vis[], int ans[], int n){
        while(idx<ans.length && ans[idx]!=0){ idx++;}
        if(idx==ans.length) return true;
        for(int i=n; i>=1; i--){
            if(vis[i]) continue;
            if(i==1){
                ans[idx]=i;
                vis[i]=true;
                if(solve(idx+1, vis, ans, n)) return true;
                ans[idx]=0;
                vis[i]=false;

            }else if(idx+i<ans.length && ans[idx+i]==0){
                ans[idx]=i;
                ans[idx+i]=i;
                vis[i]=true;
                if(solve(idx+1, vis, ans, n)) return true;
                ans[idx+i]=0;
                ans[idx]=0;
                vis[i]=false;
            }
        }
        return false;
    }
}