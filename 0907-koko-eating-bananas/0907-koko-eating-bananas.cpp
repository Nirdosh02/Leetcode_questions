class Solution {
public:
    int findmax(vector<int> &v) {
        int mx = INT_MIN;
        for (int i = 0; i < v.size(); i++) {
            mx = max(v[i], mx);
        }
        return mx;
    }

    long long totalh(vector<int> &a, int hr) {
        long long totalh = 0;
        int n = a.size();
        for (int i = 0; i < n; i++) {
            // Use integer division to calculate ceiling
            totalh += (a[i] + hr - 1) / hr;
            // Early exit if total hours exceed limit
            if (totalh > INT_MAX) {
                return totalh;
            }
        }
        return totalh;
    }

    int minEatingSpeed(vector<int>& piles, int h) {
        int low = 1; // Start from 1 to avoid division by zero
        int high = findmax(piles);
        while (low <= high) {
            int mid = (low + high) / 2;
            long long total = totalh(piles, mid);
            if (total <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low; // This will be the minimum speed needed
    }
};
