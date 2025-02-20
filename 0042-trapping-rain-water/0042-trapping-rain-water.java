class Solution {
    public int trap(int[] height) {
        int lmax=0;
        int rmax=0;
        int total=0;
        int l =0;
        int r=height.length-1;
        while(r>l){
            if(height[l]<height[r]){
                if(lmax<=height[l]){ lmax=height[l];}
                else{ total+=lmax-height[l];}
                l++;
            }else{
                if(rmax<=height[r]){ rmax=height[r];}
                else{ total+=rmax-height[r];}
                r--;
            }
        }
        return total;
    }
}