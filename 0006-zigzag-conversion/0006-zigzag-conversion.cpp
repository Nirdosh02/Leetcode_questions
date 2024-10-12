class Solution {
public:
    string convert(string s, int numRows) {
        if(numRows==1) return s;
        vector<string> ans(numRows);
        for(int i=0; i<numRows; i++){
            ans[i]="";
        }
        int i=0, n=s.length();
        while(i<n){
            for(int in = 0; in<numRows && i<n;in++){
                ans[in]+=s[i++];
            }
            for(int in = numRows-2; in>=1 && i<n; in--){
                ans[in]+=s[i++];
            }
        }
        string res = "";
        for(string str : ans){
            res+=str;
        }
        return res;

    }
};