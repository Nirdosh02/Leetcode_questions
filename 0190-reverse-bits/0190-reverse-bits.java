public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for(int i=1; i<=32; i++){
            int lsb = n & 1;
            int reverse = lsb<<(32-i);
            ans = ans | reverse;
            n=n>>1;
        }
        return ans;
    }
   
}