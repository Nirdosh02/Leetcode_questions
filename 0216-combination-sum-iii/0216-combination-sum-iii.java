class Solution {
    public void fun(int i, int k, int n, List<Integer> curr, List<List<Integer>> ans){
        if(n==0 && k==0){
            ans.add(curr);
            return;
        }
        if(i>9) return;
        if(n<0 || k<0) return;
        
        List<Integer> temp = new ArrayList<>(curr);
        temp.add(i);
        fun(i+1, k-1, n-i, temp, ans);
        fun(i+1, k, n, curr, ans);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(1, k, n, new ArrayList<>(), ans);
        return ans;
    }
}