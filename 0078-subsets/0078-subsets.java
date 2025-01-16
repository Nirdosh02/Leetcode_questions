class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        int sub = 1<<nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<sub;i++){
            List<Integer> n  = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))!=0){ n.add(nums[j]);}
            }
            ans.add(n);
        }
        return ans;
    }
}