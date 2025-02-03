class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int maxi = 1;
        int ans1 = 1;
        for(int i=1; i<n; i++){
            if(nums[i]>nums[i-1]){
                ans1++;
                // maxi=Math.max(maxi, ans);
            }else{
                ans1=1;
            }
            maxi=Math.max(maxi, ans1);
        }
        int maxd =1;
        int ans2 =1;
        for(int i=1; i<n; i++){
            if(nums[i]<nums[i-1]){
                ans2++;
                // maxd=Math.max(maxd, ans);
            }else{
                ans2=1;
            }
            maxd=Math.max(maxd, ans2);
        }
        return Math.max(maxi, maxd);
    }
}