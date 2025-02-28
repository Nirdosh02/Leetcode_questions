class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi = 0;
        for(int i : candies){
            maxi = Math.max(maxi, i);
        }
        List<Boolean> ans = new ArrayList<>();
        for(int i: candies){
            if(i+extraCandies>=maxi){
                ans.add(true);
            }else{
                ans.add(false);
            }

        }
        return ans;

    }
}