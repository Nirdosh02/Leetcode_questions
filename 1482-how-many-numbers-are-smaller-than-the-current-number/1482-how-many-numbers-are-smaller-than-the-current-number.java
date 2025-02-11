class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[101];
        for(int a : nums){
            arr[a]+=1;
        }
        for(int i=0; i<nums.length; i++){
            int sum=0;
            for(int j=0; j<nums[i]; j++){
                sum+=arr[j];
            }
            nums[i]=sum;
        }
        return nums;
    }
}