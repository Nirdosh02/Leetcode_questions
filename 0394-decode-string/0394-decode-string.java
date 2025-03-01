class Solution {
    public String decodeString(String s) {
        Stack<Object> st = new Stack<>();
        StringBuilder curs = new StringBuilder();
        int curno = 0;
        for(char c : s.toCharArray()){
            if(c=='['){
                st.push(curs.toString());
                st.push(curno);
                curs = new StringBuilder();
                curno = 0;
            }else if(c==']'){
                int prevno = (int) st.pop();
                String prevs =(String) st.pop();
                // curs.insert(0, prevs);
                String sub = curs.toString();
                curs = new StringBuilder();
                for(int i=0; i<prevno; i++){
                    curs.append(sub);
                }
                curs.insert(0, prevs);
                
            }else if(Character.isDigit(c)){
                curno = curno*10 + (c-'0');
            }else{
                curs = curs.append(c);
            }
        }
        return curs.toString();
    }
}