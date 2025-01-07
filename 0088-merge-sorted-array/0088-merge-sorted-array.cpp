class Solution {
private: 
    void swapifgreater(vector<int>& nums1, vector<int>& nums2, int ind1, int ind2) {
        if (ind1 < nums1.size() && ind2 < nums2.size() && nums1[ind1] > nums2[ind2]) {
           swap(nums1[ind1], nums2[ind2]);
        }
    }
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
       
        for (int i = 0; i < n; ++i) {
            nums1[m + i] = nums2[i];
        }

        int len = m + n;
        int gap = (len + 1) / 2; 

        while (gap > 0) {
            int left = 0;
            int right = gap;

            while (right < len) {
                if (left < m && right < m) {
                    
                    if (nums1[left] > nums1[right]) {
                       swap(nums1[left], nums1[right]);
                    }
                } else if (left < m && right >= m) {
                 
                    if (nums1[left] > nums1[right]) {
                       swap(nums1[left], nums1[right]);
                    }
                } else if (left >= m) {
                    
                    if (nums1[left] > nums1[right]) {
                       swap(nums1[left], nums1[right]);
                    }
                }
                ++left;
                ++right;
            }

            if (gap == 1) break;
            gap = (gap + 1) / 2;
        }
    }
};
