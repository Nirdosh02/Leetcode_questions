class Solution {
    public int minBitFlips(int start, int goal) {
        if(start==goal) return 0;
        int ans = start^goal;

        int cnt=1;
        while(ans!=1){
            if(ans%2==1){ cnt++;}
            ans=ans/2;
        }
        return cnt;
    }
}