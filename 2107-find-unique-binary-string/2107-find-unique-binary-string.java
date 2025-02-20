class Solution {
    public String solve(Set<String> set, int n, StringBuilder sb){
        if(sb.length()==n){
            return set.contains(sb.toString())? null : sb.toString();
        }
        sb.append('0');
        String res1 = solve(set, n, sb);
        if(res1!=null){
            return res1;
        }

        sb.setCharAt(sb.length()-1, '1');
        String res2 = solve(set, n, sb);
        if(res2!=null){
            return res2;
        }
        return null;
    }
    public String findDifferentBinaryString(String[] nums) {
        // Set<String> set = new HashSet<>(Arrays.asList(nums));
        // return solve(set, nums[0].length(), new StringBuilder());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<nums.length; i++){
            sb.append(nums[i].charAt(i)=='0' ? '1' : '0');
        }
        return sb.toString();
    }
}