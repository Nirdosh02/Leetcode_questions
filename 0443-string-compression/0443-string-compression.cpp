class Solution {
public:
    int compress(vector<char>& chars) {
        int ans =0;
        int i=0, j=0, n=chars.size();
        
        while(i<n){
            char curr = chars[i];
            int cnt = 0;
            while(i<n && chars[i]==curr){
                i++;cnt++;
            }
            chars[j++]=curr;
            if(cnt>1){for(char c : to_string(cnt)){
                chars[j++]=c;
            }}
        }
        return j;
    }
};