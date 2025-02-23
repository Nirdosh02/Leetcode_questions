class Solution {
    public int largestRectangleArea(int[] heights) {
        // int[] nse = nse(heights);
        // int[] pse = pse(heights);
        // int maxi = 0;
        // for(int i=0; i<heights.length; i++){
        //     maxi = Math.max(maxi, heights[i]*(nse[i]-pse[i]-1));
        // }
        // return maxi;

        Stack < Integer > st = new Stack < > ();
        int maxA = 0;
        int n = heights.length;
        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || heights[st.peek()] >= heights[i])) {
                int height = heights[st.peek()];
                st.pop();
                int width;
                if (st.empty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;
    }

    private int[] nse(int[] arr){
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i= arr.length-1; i>=0; i--){
            while(!st.isEmpty()&& arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=arr.length;
            }else{ nse[i]=st.peek();}
            st.push(i);
        }
        return nse;
    }

    private int[] pse(int[] arr){
        int[] pse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i =0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }else{ pse[i]=st.peek();}
            st.push(i);
        }
        return pse;
    }
}