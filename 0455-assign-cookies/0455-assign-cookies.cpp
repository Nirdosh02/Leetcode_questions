class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        int n=g.size(), m=s.size();
        int a=0,b=0;
        sort(g.begin(), g.end());
        sort(s.begin(), s.end());
        while(a<n && b<m){
            if(g[a]<=s[b]){
                a++;
                b++;
            } else{ b++; }
        }
        return a;
    }
};