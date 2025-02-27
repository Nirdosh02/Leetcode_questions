class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int presum =0;
        int cnt = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int j : nums){
            presum += j;
            if(mp.containsKey(presum-goal)){
                cnt += mp.get(presum-goal);
            }
            mp.put(presum, mp.getOrDefault(presum, 0)+1);
        }
        return cnt;
    }
}