class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int sum = 0;
        vector<int> result;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                sum = nums[i]+ nums[j];
                if(target == sum){
                    result={i,j};
                }
            }
        }
        return result;
    }
};