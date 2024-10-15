class Solution {
public:
    bool isHappy(int n) {
        int slow = n;
        int fast = n;
        while (fast != 1) {
            slow = getSum(slow);
            fast = getSum(getSum(fast));
            if (slow == fast && fast != 1) {
                return false;
            }
        }
        return true;
    }
    
    int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
};