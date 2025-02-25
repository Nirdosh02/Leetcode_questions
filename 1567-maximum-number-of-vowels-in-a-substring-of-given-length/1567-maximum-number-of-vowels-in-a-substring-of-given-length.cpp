class Solution {
public:
    int maxVowels(string s, int k) {
        int ans = 0, vo=0;
        for(int j=0; j<k;j++){
            if(s[j]=='a' || s[j]=='e' || s[j]=='i' || s[j]=='o' || s[j]=='u'){
                vo++;
            }
        }
        ans = vo;
        for(int j=k; j<s.length(); j++){
            if(s[j]=='a' || s[j]=='e' || s[j]=='i' || s[j]=='o' || s[j]=='u'){
                vo++;
            }
            if(s[j-k]=='a' || s[j-k]=='e' || s[j-k]=='i' || s[j-k]=='o' || s[j-k]=='u'){
                vo--;
            }
            ans=max(ans, vo);
        }
        return ans;
    }
};