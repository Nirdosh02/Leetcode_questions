class Solution {
    public int maximumSum(int[] nums) {
        // int mx=-1;
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         int sum =0;
        //         if(helper(nums[i])==helper(nums[j])){
        //             sum = nums[i]+nums[j];
        //             mx=Math.max(mx, sum);
        //         }
        //     }
        // }
        // return mx;

        int mx=-1;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int n : nums){
            int sum = helper(n);
            if(mp.containsKey(sum)){
                mx=Math.max(mx, n+mp.get(sum));
            }
            mp.put(sum, Math.max(mp.getOrDefault(sum, -1), n));
        }
        return mx;
    }
    public int helper(int a){
        int sum =0;
        while(a>0){
            sum+=a%10;
            a=a/10;
        }
        return sum;
    }
}