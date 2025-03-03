class Solution {
    public int maxOperations(int[] nums, int k) {
        // HashMap<Integer, Integer> mp = new HashMap<>();
        // int ans =0;
        // for(int i : nums){
        //     mp.put(i, mp.getOrDefault(i,0)+1);
        // }
        // for(int i : mp.keySet()){
        //     if(mp.containsKey(i) && mp.containsKey(k-i)){
        //         if(i!=k-i){
        //             ans += Math.min(mp.get(i), mp.get(k-i));
        //             mp.put(i,0);
        //             mp.put(k-i, 0);
        //         }else{
        //             ans += Math.floor(mp.get(i)/2);
        //             mp.put(i,0);
        //         }
        //     }
        // }
        // return ans;

        Arrays.sort(nums);
        int high = nums.length-1;
        int low = 0;
        int ans = 0;
        while(high>low){
            int sum = nums[low] + nums[high];
            if(k==sum){
                low++;
                high--;
                ans++;
            }
            else{ 
                if(k>sum){
                low++;
                }else{ high--;}
            }
        }
        return ans;
    }
}