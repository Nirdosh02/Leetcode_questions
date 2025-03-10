class Solution {
    #define ll long long
public:

     bool isVowel(char c){
        return (c=='a' or c=='e' or c=='i' or c=='o' or c=='u');
    }
    void findNextConsonant(string& word,vector<int>& next_consonant){
        int n=word.size();
        int next=n;
        for(int i=n-1;i>=0;--i){
            next_consonant[i]=next;
            if(!isVowel(word[i]))
                next=i;
        }
    }

    long long countOfSubstrings(string word, int k) {
        int n = word.size();
        vector<int> next_con(n);
        findNextConsonant(word,next_con);
        ll cnt =0;
        int conso = 0;
        unordered_map<char,int> vowel_freq;
        int left=0, right=0, prev=-1;
        while(right<n){
            if(prev!=right){
                if(isVowel(word[right])) vowel_freq[word[right]]++;
                else conso++;
                prev=right;
            }
            if(right>=(5+k-1)){
                if(vowel_freq.size()==5 and conso==k){
                    cnt+=next_con[right]-right;
                }
                if((vowel_freq.size()==5 and conso==k) or (conso>k)){
                    if(isVowel(word[left])){
                        vowel_freq[word[left]]--;
                        if(vowel_freq[word[left]]==0)
                            vowel_freq.erase(word[left]);
                    }else{ conso--;}
                    left++;
                }else
                    right++;
            }else
                right++;
        }
        return cnt;
    }
};