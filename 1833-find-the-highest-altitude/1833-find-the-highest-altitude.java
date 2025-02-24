class Solution {
    public int largestAltitude(int[] gain) {
        int presum =0;
        int ans = 0;
        for(int i : gain){
            presum+=i;
            ans = Math.max(ans, presum);
        }
        return ans;
    }
}