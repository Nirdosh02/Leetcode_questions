class Solution {
public:
    int hIndex(vector<int>& citations) {
        int l=0, h=citations.size()-1, n = citations.size();
        while(h>=l){
            int mid = (l+h)/2;
            if(citations[mid]< n-mid){
                l=mid+1;
            }
            else{ h=mid-1;}
        }
        return n-l;
    }
};