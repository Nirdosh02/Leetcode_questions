class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++){
            int sqr = i*i;
            if(solve(sqr, i)){
                sum += sqr;
            }
        } 
        return sum;
    }
    public boolean solve(int num, int target){
        if(target<0 || num<target){ return false;}
        if(num==target){ return true;}
        return (
            solve(num/10, target-num%10) ||
            solve(num/100, target-num%100) ||
            solve(num/1000, target-num%1000)
        );
    }
}