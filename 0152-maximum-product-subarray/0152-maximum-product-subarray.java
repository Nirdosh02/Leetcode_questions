class Solution {
    public int maxProduct(int[] nums) {
        
        // int maxi = Integer.MIN_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     int pro = 1;
        //     for(int j=i; j<nums.length; j++){
        //         pro=pro*nums[j];
        //         maxi = Math.max(maxi,pro );
        //     }
        // }
        // return maxi;

        int prefix =1;
        int suffix =1;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(prefix == 0) prefix=1;
            if(suffix == 0) suffix=1;
            prefix = prefix*nums[i];
            suffix=suffix*nums[nums.length - i -1];
            maxi=Math.max(maxi, Math.max(prefix, suffix));
        }
        return maxi;
    }
}