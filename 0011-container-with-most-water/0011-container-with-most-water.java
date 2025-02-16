class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int right = n-1;
        int left = 0;
        int max_Area = 0;
        while(right>=left){
            int area = (right-left)*Math.min(height[right], height[left]);
            max_Area=Math.max(max_Area, area);
            if(height[left]>height[right]){ right--;}
            else{ left++;}
        }
        return max_Area;
    }
}