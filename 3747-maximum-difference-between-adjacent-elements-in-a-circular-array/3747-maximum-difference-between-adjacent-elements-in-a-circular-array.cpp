class Solution {
public:
    int maxAdjacentDistance(vector<int>& nums) {
        int dif = 0;
        for(int i=1;i<nums.size();i++){
            int a = abs(nums[i-1]-nums[i]);
            dif = max(a, dif);
        }
        int b = abs(nums[0]-nums[nums.size()-1]);
        dif=max(b,dif);
        return dif;
    }
};