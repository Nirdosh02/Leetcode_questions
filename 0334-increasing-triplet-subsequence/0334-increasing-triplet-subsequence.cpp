class Solution {
public:
    bool increasingTriplet(vector<int>& nums) {
        // bool ans = false;
        // for(int i=0; i<nums.size()-2; i++){
        //     for(int j=i+1; j<nums.size(); j++){
        //         int k = j+1;
        //         while(k<nums.size()){
        //             if(nums[i]<nums[j] && nums[j]<nums[k]){ return true;}
        //             k++;
        //         }
        //     }
        // }
        // return false;
        if(nums.size()<3) return false;
        int m1 = INT_MAX;
        int m2 = INT_MAX;
        for(int i : nums){
            if(i<=m1){ m1=i;}
            else if(i<=m2){m2=i;}
            else{ return true;}
        }
        return false;
    }
};