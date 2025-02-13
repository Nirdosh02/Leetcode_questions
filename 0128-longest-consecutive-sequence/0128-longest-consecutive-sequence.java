class Solution {
    public int longestConsecutive(int[] nums) {
        // int cnt = 1;
        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int mx = 0;
        for(int i : set){
            if(!set.contains(i-1)){
                int cnt =1;
                int x = i;
                while(set.contains(x+1)){
                    cnt++;
                    x++;
                }
                mx = Math.max(mx, cnt);
            }
        }
        return mx;
    }
}