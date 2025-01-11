class Solution {
    public String removeOuterParentheses(String s) {
        // Stack<Character> st = new Stack<>();
        // StringBuilder res = new StringBuilder();
        // for(char c:s.toCharArray()){
        //     if(c=='('){
        //         if (!st.isEmpty()) {
        //             res.append(c);
        //         }
        //         st.push(c);

        //     }
        //     else if(c==')'){
        //         st.pop();
        //         if (!st.isEmpty()) {
        //             res.append(c);
        //         }
        //     }
        // }
        // return res.toString();

        StringBuilder res = new StringBuilder();
        int bal = 0;
        for(char c: s.toCharArray()){
            if(c=='('){
                if(bal>0){ res.append(c);}
                bal++;
            }
            else if(c==')'){
                bal--;
                if(bal>0){
                     res.append(c);
                }
            }
        }
        return res.toString();
    }
}