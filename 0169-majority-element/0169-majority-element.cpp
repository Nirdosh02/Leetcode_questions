class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n= nums.size();
        int e=0, cnt=0;
        for(int i=0; i<n;i++){
            if(cnt == 0){
                cnt =1;
                e=nums[i];
            }
            else if(nums[i]==e){
                cnt++;
            }
            else {
                cnt--;
            }
        }
        return e;
    }
};