class Solution {
public:
    string gcdOfStrings(string str1, string str2) {
        int n1=str1.length();
        int n2=str2.length();
        if((str1+str2) == (str2+str1)){
            int g= gcd(n1, n2);
            return str1.substr(0, g);
        } else{ return "";}
    }

    int gcd(int x, int y){
        if(x==0){ return y;}
        if(y==0){ return x;}
        if(x==y){return x;}
        if(x>y){
            return gcd(x-y, y);
        }
        return gcd(x, y-x);
    }
};