class Solution {
public:
    bool isSubsequence(string s, string t) {
        int p1=0, p2=0;
        int n=s.length(), m= t.length();
        int i=0;
        while(i<max(n, m)){
            if(s[p1]==t[p2]){
                p1++;
                p2++;
            } else{ p2++;}
            i++;
        }
        return p1==(n);
    }
};