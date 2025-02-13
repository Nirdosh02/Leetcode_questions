class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> mh = new PriorityQueue<>();
        for(int num : nums){
            mh.offer((long) num);
        }
        int cnt = 0;
        while(mh.size()>=2){
            if(mh.peek()>=k){
                return cnt;
            }
            cnt++;
            long x = mh.poll();
            long y = mh.poll();
            mh.offer(x*2+y);
        }
        return cnt;
    }
}