class Solution {
    public boolean isPrefix(String str1,String str2){
        if(str2.startsWith(str1)){
            return true;
        }
        else{ return false;}
    }
    public int prefixCount(String[] words, String pref) {
        int cnt=0;
        for(int i=0;i<words.length;i++){
            if(isPrefix(pref,words[i])){
                cnt++;
            }
        }
        return cnt;
    }
}