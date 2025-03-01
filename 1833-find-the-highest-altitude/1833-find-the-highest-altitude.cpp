class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int presum = 0;
        int ans = 0;
        for(int i : gain){
            presum += i;
            ans = max(ans, presum);
        }
        return ans;
    }
};