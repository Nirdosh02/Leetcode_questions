class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] prime = soe(left, right);
        int j=prime.length-1;
        int mini = right;
        int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        for(int i=0; i<j; i++){
            int diff = prime[i+1]-prime[i];
            if(diff<mini){
                mini = diff;
                ans[0]=prime[i];
                ans[1]=prime[i+1];
            }
        }
        return ans;
    }

    public static int[] soe(int left, int n)
    {
        boolean prime[] = new boolean[n + 1];
        if(left<2) left=2;
        
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        
        int cnt=0;
        for (int i = left; i <= n; i++) {
            if (prime[i] == true)
                cnt++;
        }
        int j=0;
        int[] pr = new int[cnt];
        for (int i = left; i <= n; i++) {
            if (prime[i] == true)
                pr[j++]=i;
        }
        return pr;
    }
}