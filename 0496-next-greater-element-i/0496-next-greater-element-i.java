class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int[] arr = nge(nums2);
        int i=0;
        for(int n : nums1){
            int j = search(nums2, n);
            ans[i++]=arr[j];
        }
        return ans;
    }
    public int search(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key) return i;
        }
        return 0;
    }
    public int[] nge(int[] nums2){
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[nums2.length];
        for(int i = nums2.length-1; i>=0; i--){
            while(!st.empty() && st.peek()<=nums2[i]){ st.pop();}
            if(st.empty()){ nge[i]=-1;}
            else{ nge[i]=st.peek();}
            st.push(nums2[i]);
        }
        return nge;
    }
}