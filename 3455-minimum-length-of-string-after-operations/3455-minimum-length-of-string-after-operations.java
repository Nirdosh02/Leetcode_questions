class Solution {
    public int minimumLength(String s) {
       int[] f = new int[26];
       int res = 0;
       int n = s.length();
       for(int i=0;i<n;i++){
        f[s.charAt(i)-'a']+=1;
        if(f[s.charAt(i)-'a']==3){
            f[s.charAt(i)-'a']-=2;
            res +=2;
        }
       }
       return n-res;
    }
}