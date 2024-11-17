class Solution {
public:
    double myPow(double x, int n) {
        double ans = 1;
        long ng = n;
        if(ng<0){
            ng = -1 * ng;
        }
        while(ng>0){
            if(ng%2==1){
                ans = ans * x;
                ng = ng - 1;
            }
            else{
                x=x*x;
                ng = ng/2;
            }
        }
        if(n<0) ans = (double)(1.0)/(double)(ans);
        return ans;
    }
};