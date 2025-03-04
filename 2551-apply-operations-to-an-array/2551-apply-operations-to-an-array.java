class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int i=0;
        int[] ans = new int[nums.length];
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=0){
                ans[i++]=nums[j];
            }
        }
        while(i<nums.length){
            nums[i++]=0;
        }
        return ans;
    }
}