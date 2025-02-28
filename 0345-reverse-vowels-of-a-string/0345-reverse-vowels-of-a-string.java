class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int l =0;
        int r = s.length()-1;
        while(r>=l){
            if(!vowel(s.charAt(l))){
                l++;
            }else if(!vowel(s.charAt(r))){
                r--;
            }else{
                swap(ch, l, r);
                l++;
                r--;
            }
        }
        return new String(ch);
    }
    public boolean vowel(char c){
        if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U'){
            return true;
        }
        return false;
    }
    public void swap(char[] ch, int a, int b){
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
    }
}