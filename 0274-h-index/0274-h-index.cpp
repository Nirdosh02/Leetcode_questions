class Solution {
public:
    int hIndex(vector<int>& citations) {
        sort(citations.begin(), citations.end());
        int i=0, n = citations.size();
        
        for( i = 0; i<n; ++i){
            if(citations[i]>=n-i){
                return n-i;
            }  
        }
        return 0;
    }
};