class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                st.push(s.charAt(i));
            }else{ 
                if(!st.isEmpty()){ st.pop();}
            }
        }

        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.insert(0, st.pop()); 
        }
        
        return result.toString();
    }
}