class Solution {
    public int[] constructRectangle(int area) {
        int[] ans = new int[2];
        
        for(int i = 1; i*i<=area; i++){
           
            if(area%i==0){
                ans[0]=area/i;
                ans[1]=i;
            }
        }
        return ans;
    }
}