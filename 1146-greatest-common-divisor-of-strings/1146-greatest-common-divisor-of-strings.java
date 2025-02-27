class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if((str1+str2).equals(str2+str1)){
            int gcd = gcd(str1.length(), str2.length());
            return str1.substring(0, gcd);
        }
        return "";
    }
    public int gcd(int a, int b){
        if(a==0) return b;
        if(b==0) return a;
        if(a>b){ return gcd(a-b, b);}
        return gcd(a, b-a);
    }
}