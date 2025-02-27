class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int min_len = Math.min(word1.length(), word2.length());
        for(int i =0; i<min_len; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(word1.length()>min_len){
            sb.append(word1.substring(min_len));
        }
        if(word2.length()>min_len){
            sb.append(word2.substring(min_len));
        }
        return sb.toString();
    }
}