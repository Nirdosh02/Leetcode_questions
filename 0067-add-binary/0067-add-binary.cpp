class Solution {
public:
    string addBinary(string a, string b) {
        string ans = "";
        int carry = 0, i = a.length() - 1, j = b.length() - 1;
        
        while (i >= 0 || j >= 0 || carry) {
            int sum = carry;
            if (i >= 0) {
                if (a[i--] == '1') {
                    sum += 1;
                }
            }
            if (j >= 0) {
                if (b[j--] == '1') {
                    sum += 1;
                }
            }
            ans = to_string(sum % 2) + ans;
            carry = sum / 2;
        }
        return ans;
    }
};