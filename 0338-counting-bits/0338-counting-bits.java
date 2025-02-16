class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0; i<=n; i++){
            ans[i]=cnt(i);
        }
        return ans;
    }
    public int cnt(int n) {
        int count =0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}