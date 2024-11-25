class Solution {
public:
    int maxArea(vector<int>& height) {
        int max_a = 0;
        int l=0, r=height.size()-1;
        while(r>=l){
            int area = (r-l)*min(height[l],height[r]);
            max_a = max(max_a, area);
            if(height[l]>height[r]){
                r--;
            }else{ l++; }
        }
        return max_a;
    }
};