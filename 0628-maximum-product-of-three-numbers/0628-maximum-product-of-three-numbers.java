class Solution {
    public int maximumProduct(int[] nums) {
        // int pro = 1;
        // int maxpro = 1;
        // for(int i =2; i<nums.length; i++){
        //     pro = nums[i-2]*nums[i-1]*nums[i];
        //     maxpro=Math.max(maxpro, pro);
        //     if(maxpro==1){
        //         maxpro = pro;
        //     }
        // }
        // return maxpro;
        Arrays.sort(nums);
        int n = nums.length;
        int pro1 = nums[0]*nums[1]*nums[n-1];
        int pro2 = nums[n-3]*nums[n-1]*nums[n-2];
        return Math.max(pro1, pro2);
    }
}