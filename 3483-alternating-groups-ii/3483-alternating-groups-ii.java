class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int cnt =0;
        int left=0, right=n+k-1;
        while(left<n){
            int r = left+1;
            while(r<right && colors[(r-1)%n]!=colors[r%n]){
                r++;
            }
            if(r-left >= k){
                cnt+=(r-left)-k+1;
            }
            left=r;
        }
        return cnt;
    }
}