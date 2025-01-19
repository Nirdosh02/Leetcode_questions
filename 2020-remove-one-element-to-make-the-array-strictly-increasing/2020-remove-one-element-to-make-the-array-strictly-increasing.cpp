class Solution {
public:
    bool canBeIncreasing(vector<int>& nums) {
        int ind = 0;
        int cnt = 0;
        for(int i=1; i<nums.size();i++){
            if(nums[i-1]>=nums[i]){ cnt++;
            ind = i-1;
            }

        }
        if(cnt > 1) return false;
        if(ind == 0 || ind == nums.size()-2) return true;
        else if(nums[ind+1]>nums[ind-1] || nums[ind+2]>nums[ind]){ return true;}
        return false;
    }
};