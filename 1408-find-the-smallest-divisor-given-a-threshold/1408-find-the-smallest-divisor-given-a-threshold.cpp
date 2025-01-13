class Solution {
public:
    int sumd(vector<int> &arr, int div){
        int sum=0;
        int n=arr.size();
        for(int i=0; i<n; i++){
            sum=sum + ceil((double)(arr[i])/(double)(div));

        }
        return sum;
    }
    int smallestDivisor(vector<int>& nums, int threshold) {
        int l=1, h=*max_element(nums.begin(),nums.end());
        // int ans = -1;
        while(l<=h){
            int mid = (l+h)/2;
            if(sumd(nums, mid)<= threshold){
                h=mid-1;
            }else{ l = mid+1;}
        }
        return l;
    }
};