class Solution {
public:
    int mySqrt(int x) {
        int low = 1, high = x, ans = 0;
        while (low <= high) {
            long long temp = (long long)low + high;  // Cast to long long
            long long mid = temp / 2;
            if (mid * mid <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
};