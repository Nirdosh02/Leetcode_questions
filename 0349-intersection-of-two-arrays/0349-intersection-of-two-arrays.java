class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        int n = Math.min(nums1.length,nums2.length);
        int[] res = new int[n];
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){ 
                if(k==0 || res[k-1]!=nums1[i] ){
                    res[k]=nums1[i];
                    k++;
                }
                i++; j++;
            }
            else if(nums1[i]>nums2[j]){ j++;}
            else{ i++;}
        }
        return Arrays.copyOf(res,k);
    }
}