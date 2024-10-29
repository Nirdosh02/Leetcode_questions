class Solution {
public:
    string reverseVowels(string s) {
        int first =0, last=s.length()-1;
        while(last>=first){
            if(!isVowel(s[first])){
                first++;
            }
            else if(!isVowel(s[last])){
                last--;
            }
            else{ swap(s[first], s[last]);
            first++;
            last--;
            }
        }
        return s;
    }

    bool isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        } else{ return false;}
    }
};