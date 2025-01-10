class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>();
        int[] tar = new int[26];
        for(String b:words2){
            int[] temp =new int[26];
            for(char c:b.toCharArray()){
                temp[c-'a']++;
                tar[c-'a']=Math.max(tar[c-'a'], temp[c-'a']);
            }
        }
        for(String a:words1){
            int[] arr=new int[26];
            for(char c:a.toCharArray()) arr[c-'a']++;
            if(isSubset(arr, tar)){
                res.add(a);
            }
        }
        return res;
    }

    private boolean isSubset(int[] arr, int[] tar) {
        for (int i = 0; i < 26; i++) {
            if (arr[i] < tar[i]) {
                return false; 
            }
        }
        return true; 
    }
}