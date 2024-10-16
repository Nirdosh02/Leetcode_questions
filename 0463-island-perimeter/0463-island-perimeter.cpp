class Solution {
public:
    int islandPerimeter(vector<vector<int>>& grid) {
        int per = 0;
        int m = grid.size();
        int n = grid[0].size();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) { 
                    if (i == 0 || grid[i-1][j] == 0) 
                        per++;
                    if (i == m - 1 || grid[i+1][j] == 0) 
                        per++;
                    if (j == 0 || grid[i][j-1] == 0)
                        per++;
                    if (j == n - 1 || grid[i][j+1] == 0) 
                        per++;
                }
            }
        }
        
        return per;
    }
};