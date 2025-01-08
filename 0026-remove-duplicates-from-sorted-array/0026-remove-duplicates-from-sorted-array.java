class Solution {
    public int removeDuplicates(int[] nums) {
        int s=0, f=1;
        while(f<nums.length){
            if(nums[s]==nums[f]){
                f++;
            }
            else{
                nums[s+1]=nums[f];
                s++; f++;
            }
        }
        return s+1;
        
    }
}