class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        int zero = 0;
        for(int num : nums){
            if(num==0){
                zero++;
                
            }else{
            pro*=num;}

        }
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(zero>1){
                ans[i]=0;
            } else if(zero==1){
                if(nums[i]==0){
                    ans[i]=pro;
                }else{ ans[i]=0;}
            } else{
                ans[i]=pro/nums[i];
            }
        }
        return ans;
    }
}