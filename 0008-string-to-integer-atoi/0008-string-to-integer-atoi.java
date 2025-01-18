class Solution {
    public int myAtoi(String s) {
        

        if (s == null || s.length() == 0) return 0;
        s = s.trim();  
        if (s.length() == 0) return 0; 
        int i = 0;
        int sign = 1;

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        int ans = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (ans > (max - digit) / 10) {
                return sign == 1 ? max : min;  
            }
            
            ans = ans * 10 + digit;
            i++;
        }

        return sign * ans;
    }
}