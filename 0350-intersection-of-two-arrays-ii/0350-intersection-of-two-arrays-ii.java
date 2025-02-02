class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Map<Integer, Integer> mp = new HashMap<>();

       for(int a : nums1){
        mp.put(a, mp.getOrDefault(a,0)+1);
       }
       List<Integer> arr = new ArrayList<>();
       for(int a : nums2){
        if(mp.containsKey(a) && mp.get(a)>0){
            arr.add(a);
            mp.put(a, mp.get(a)-1);
        }
       } 
       int[] ans  = new int[arr.size()];
       for(int i=0; i<arr.size(); i++){
        ans[i]=arr.get(i);
       }
       return ans;
    }
}