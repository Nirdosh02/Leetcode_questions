class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nse = nse(arr);
        int[] pse = pse(arr);
        int mod = 1000000007;
        long count = 0;
        for(int i =0; i<arr.length; i++){
            int first = i - pse[i];
            int second = nse[i] - i;
            long pro = (first*second)%mod;
            pro = (pro*arr[i])%mod;
            count = (count%mod + pro)%mod;
        }
        return (int)(count);
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