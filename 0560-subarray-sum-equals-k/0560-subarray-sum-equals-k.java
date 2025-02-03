class Solution {
    public int subarraySum(int[] nums, int k) {
        // int sum =0;
        // int i=0, j=0;
        // int ans = 0;
        // if(nums.length==1 && nums[0]>k){ return 0;}
        // while(j<nums.length){
        //     sum+=nums[j];
        //     while(sum>k && i<=j){
        //         sum-=nums[i];
        //         i++;
        //     }
        //     if(sum==k){
        //         ans++;
        //     }
        //     j++;
        // }
        // return ans;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        int sum =0;
        int ans=0;
        for(int n : nums){
            sum+=n;
            if(mp.containsKey(sum-k)){
                ans+=mp.get(sum-k);
            }
            mp.put(sum, mp.getOrDefault(sum, 0)+1);
        }
        return ans;
        
    }
}