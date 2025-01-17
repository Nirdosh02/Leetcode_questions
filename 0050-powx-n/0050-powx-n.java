class Solution {
    public double myPow(double x, int n) {
        double ans =1;
        // if(n==Integer.MIN_VALUE) return 0;
        if(n==Integer.MIN_VALUE){ 
            if(x==1 || x==-1){ return 1;}
            return 0;
        }
       
        boolean m = true;
        if(n<0){ m= false; n=-n;}
        
        while(n>0){
            if(n%2==1){
                ans=ans*x;
                n=n-1;
            }else{
                n=n/2;
                x=x*x;
            }
        }
        if(m){ return ans;}
        else{ return 1.0/ans;}

    }
}