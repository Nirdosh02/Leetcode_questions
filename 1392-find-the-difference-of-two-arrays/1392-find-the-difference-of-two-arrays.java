class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        Set<Integer> mp1 = new HashSet<>();
        Set<Integer> mp2 = new HashSet<>();
        for(int i: nums1){
            mp1.add(i);
        }
        for(int i: nums2){
            mp2.add(i);
        }
        for(int i : mp2){
            if(!mp1.contains(i)){
                ans.get(1).add(i);
            }
        }
        for(int i : mp1){
            if(!mp2.contains(i)){
                ans.get(0).add(i);
            }
        }
        return ans;
    }
}