class Solution {
    public boolean isPrefixAndSuffix(String str1,String str2){
        if(str2.startsWith(str1) && str2.endsWith(str1)){
            return true;
        }
        else{ return false;}
    }
    public int countPrefixSuffixPairs(String[] words) {
        int cnt =0;
        for(int i=0; i<words.length;i++){
            String str = words[i];
            for(int j=i+1; j<words.length; j++){
                if(isPrefixAndSuffix(words[i],words[j])){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}