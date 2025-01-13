class Solution {
public:
    string convertToTitle(int num) {
        
         string s = "";
	    while(num>0){
	        num=num-1;
	        char c = (num%26)+'A';
	        s=c+s;
	       num=num/26;
	    }
        return s;
    }
};