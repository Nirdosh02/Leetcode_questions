class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Stack<Integer> st = new Stack<>();
        int[] nge = nge(temperatures);
        int[] ans = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            if(nge[i]==-1){
                ans[i]=0;
            }else{
                ans[i]=nge[i]-i;
            }
        }
        return ans;
    }
    public int[] nge(int[] nums2){
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[nums2.length];
        for (int i = 0; i < nums2.length; i++) {
            nge[i] = -1;
        }
        for(int i = nums2.length-1; i>=0; i--){
            while(!st.empty() && nums2[st.peek()]<=nums2[i]){ st.pop();}
            if(!st.empty()){ nge[i]=st.peek();}
            st.push(i);
        }
        return nge;
    }
}