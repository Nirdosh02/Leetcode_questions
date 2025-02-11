class Solution {
    public String removeOccurrences(String s, String part) {
        // Stack<Character> st = new Stack<>();
        // int n = part.length();
        // for(int i=0; i<s.length(); i++){
        //     st.push(s.charAt(i));
        //     if(st.size()>=n && st.peek()==part.charAt(n-1)){
        //         StringBuilder sb = new StringBuilder("");
        //         for(int j=0; j<n; j++){
        //             sb.append(st.pop());
        //         }
        //         sb.reverse();
        //         if(!sb.toString().equals(part)){
        //             for(int j=0; j<n; j++){
        //                 sb.append(sb.toString().charAt(j));
        //             }
        //         }
        //     }
        // }
        // StringBuilder res = new StringBuilder();
        // while(!st.isEmpty()){
        //     res.append(st.pop());
        // }
        // return res.reverse().toString();

        while(s.contains(part)){
            s = s.replaceFirst(part, "");
        }
        return s;
    }
}