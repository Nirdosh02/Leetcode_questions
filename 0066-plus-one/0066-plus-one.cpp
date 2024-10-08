class Solution {
public:
    vector<int> plusOne(vector<int>& v) {
        int n = v.size();
        for (int i = n - 1; i >= 0; i--) {
            if (v[i] == 9) {
                v[i] = 0;
            } else {
                v[i]++;
                return v;
            }
        }
        // If all digits are 9, add a new digit 1 at the beginning
        v.insert(v.begin(), 1);
        return v;
    }
};