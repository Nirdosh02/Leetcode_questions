class Solution {
    public long subArrayRanges(int[] nums) {
        return sumSubarrayMaxs(nums) - sumSubarrayMins(nums);
    }

    public long sumSubarrayMaxs(int[] arr) {
        int[] nse = nge(arr);
        int[] pse = pge(arr);
        
        long count = 0;
        for(int i =0; i<arr.length; i++){
            int first = i - pse[i];
            int second = nse[i] - i;
            long pro = (first*second);
            pro = (pro*arr[i]);
            count = count+ pro;
        }
        return count;
    }

     public long sumSubarrayMins(int[] arr) {
        int[] nse = nse(arr);
        int[] pse = pse(arr);
       
        long count = 0;
        for(int i =0; i<arr.length; i++){
            int first = i - pse[i];
            int second = nse[i] - i;
            long pro = (first*second);
            pro = (pro*arr[i]);
            count = (count + pro);
        }
        return count;
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


    private int[] nge(int[] arr){
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i= arr.length-1; i>=0; i--){
            while(!st.isEmpty()&& arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=arr.length;
            }else{ nse[i]=st.peek();}
            st.push(i);
        }
        return nse;
    }

    private int[] pge(int[] arr){
        int[] pse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i =0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
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