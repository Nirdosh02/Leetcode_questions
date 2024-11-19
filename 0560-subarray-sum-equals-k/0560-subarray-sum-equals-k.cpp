class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        map<int, int> mpp;
        mpp[0]=1;
        int sum = 0, c=0;
        for(int i=0; i<nums.size(); i++){
            sum+=nums[i];
            int remove = sum -k;
            c += mpp[remove];
            mpp[sum]+=1;

        }

        return c;
    }
        
};