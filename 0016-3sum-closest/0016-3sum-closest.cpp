class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        // vector<vector<int>> ans;
        // sort(nums.begin(), nums.end());
        // int n = nums.size();
        // int r =0;
        // for(int i=0; i<n-2;i++){
        //     if(i>0 && nums[i]==nums[i-1]) continue;
        //     int j=i+1;
        //     int k = n-1;
        //     while(j<k){
        //         int sum = nums[i]+nums[j]+nums[k];
        //         int diff = sum - target;

        //         if(sum <target){
        //             j++;
        //         }
        //         else if(sum>target){
        //             k--;
        //         }else{
        //             vector<int> temp = {nums[i],nums[j],nums[k]};
        //             ans.push_back(temp);
        //             j++;
        //             k--;
        //             while(j<k && nums[j]==nums[j-1]) j++;
        //             while(j<k && nums[k]==nums[k+1]) k--;
        //         }
        //     }
        // }
        // return ans;

        int ans =0, diff = INT_MAX, n = nums.size();
        sort(nums.begin(), nums.end());
        for(int i=0; i<n-1;i++){
            int first = nums[i];
            int j = i+1;
            int k=n-1;
            while(k>j){
                // int sum = first+nums[j]+nums[k];
                if(first+nums[j]+nums[k] == target) return target;
                else if(abs(first+nums[j]+nums[k]-target)<diff){
                    diff = abs(first+nums[j]+nums[k]-target);
                    ans = first+nums[j]+nums[k];
                    
                }
                if(first+nums[j]+nums[k]>target) k--;
                else{ j++;}
                
            }
        }
        return ans;
    }
};