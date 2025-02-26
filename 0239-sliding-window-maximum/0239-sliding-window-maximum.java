class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0; i<nums.length; i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(i>=k-1){
                ans.add(nums[dq.peekFirst()]);
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}