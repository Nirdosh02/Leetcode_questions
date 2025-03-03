class Solution {
public:
    vector<int> successfulPairs(vector<int>& spells, vector<int>& potions, long long success) {
        sort(potions.begin(), potions.end());
        
        vector<int> ans;
        for(int i=0; i<spells.size(); i++){
            long long p = spells[i];
            int cnt =0;
            int low = 0;
            int high = potions.size()-1;
            while(high>=low){
                int mid = low + (high-low)/2;
                if((long long)potions[mid]*p>=success){
                    cnt = potions.size()-mid;
                    high = mid -1;
                }
                else{ low = mid+1;}

            }
            ans.push_back(cnt);
        }
        return ans;
    }
};