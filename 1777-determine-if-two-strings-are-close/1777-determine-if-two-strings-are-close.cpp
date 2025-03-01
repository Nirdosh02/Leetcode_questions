class Solution {
public:
    bool closeStrings(string word1, string word2) {
        vector<int> freq1(26,0), freq2(26,0), ch1(26,0), ch2(26,0);
        for(auto x : word1){
            freq1[x-'a']+=1;
            ch1[x-'a']=1;
        }
        for(auto x : word2){
            freq2[x-'a']+=1;
            ch2[x-'a']=1;
        }
        sort(freq1.begin(), freq1.end());
        sort(freq2.begin(), freq2.end());
        return freq1==freq2 && ch1==ch2;

    }
};