class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n<=0){ return false;}
        // while(n!=1){
        //     if(n%2==1){
        //         return false;
        //     }
        //     else{ n=n/2;}
        // }
        // return true;

        return (n>0) && (n & (n-1))==0;
    }
}