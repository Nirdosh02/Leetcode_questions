class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxi = 0;
        for(int i = 0; i<prices.length; i++){
            int diff = prices[i]-mini;
            maxi = Math.max(maxi, diff);
            mini = Math.min(mini, prices[i]);
        }
        return maxi;
    }
}