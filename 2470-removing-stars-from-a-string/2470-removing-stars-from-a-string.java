class Solution {
    public String removeStars(String s) {
        // Stack<Character> st = new Stack<>();
        // for(char c : s.toCharArray()){
        //     if(!st.empty() && c == '*' ){
        //         st.pop();
        //     }else{
        //         st.push(c);
        //     }
        // }
        // String ans = "";
        // while(!st.empty()){
        //     ans = st.peek() + ans;
        //     st.pop();
        // }
        // return ans;

        char[] cha = s.toCharArray();
        int ind = 0;
        for(char c: cha){
            if(c=='*'){
                ind--;
            }else{
                cha[ind++]=c;
            }
        }
        if(ind == -1){ return "";}
        return new String(cha, 0, ind);
    }
}