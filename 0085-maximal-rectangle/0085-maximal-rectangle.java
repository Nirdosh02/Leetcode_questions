class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix[0].length;
        int m = matrix.length;
        int[][] psum = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]=='1'){
                    psum[i][j]=(i==0)?1:psum[i-1][j]+1;
                }else{
                    psum[i][j]=0;
                }
            }
        }
        int maxi =0;
        for(int i=0; i<m; i++){
            maxi=Math.max(maxi, func(psum[i]));
        }
        return maxi;
    }

    public int func(int[] heights){
        Stack < Integer > st = new Stack < > ();
        int maxA = 0;
        int n = heights.length;
        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || heights[st.peek()] >= heights[i])) {
                int height = heights[st.peek()];
                st.pop();
                int width;
                if (st.empty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;
    }
}