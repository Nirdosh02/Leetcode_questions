class Solution {
public:
    bool isIsomorphic(string s, string t) {
        
        char ms[128] = {0};
        char mt[128] = {0};
        int len = s.length();
        for(int i=0; i<len;++i){
            if(ms[s[i]]!=mt[t[i]]) return false;
            ms[s[i]]=i+1;
            mt[t[i]]=i+1;
        }
        return true;
    }
};