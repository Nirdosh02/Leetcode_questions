class Solution {
    public long coloredCells(int n) {
        long ans = n*(n+1)*(2*n+1)/6;
        return (long) n * n + (long) (n - 1) * (n - 1);
    }
}