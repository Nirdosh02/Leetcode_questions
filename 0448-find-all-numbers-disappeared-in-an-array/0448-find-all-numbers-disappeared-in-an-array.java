class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for(int i=0; i<nums.length; i++){
            arr[nums[i]]+=1;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1; i<=nums.length; i++){
            if(arr[i]==0){
                res.add(i);
            }
        }

        return res;


    }
}