class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ptr =0, cnt = 0;
        int[] ans = new int[nums.length];
        List<Integer> gr = new ArrayList<>();
        for(int i : nums){
            if(i<pivot){
                ans[ptr++]=i;
            }
            else if(i==pivot){
                cnt++;
            }
            else{
                gr.add(i);
            }
        }
        while(cnt>0){
            ans[ptr++]=pivot;
            cnt--;
        }
        for(int i=0; i<gr.size(); i++){
            ans[ptr++]=gr.get(i);
        }
        return ans;
    }
}