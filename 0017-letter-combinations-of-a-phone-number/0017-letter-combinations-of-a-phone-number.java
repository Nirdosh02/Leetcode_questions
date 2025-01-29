class Solution {
    public void solve(int i, String digits, String s, List<String> ans, Map<Character, String> mp){
        if(i==digits.length()){
            ans.add(s);
            return;
        }

        for(char c : mp.get(digits.charAt(i)).toCharArray()){
            String temp = new String(s);
            temp+=c;
            solve(i+1,digits, temp,ans,mp);
        }
    }
    public List<String> letterCombinations(String digits) {
        Map<Character, String> mp = getMap();
        List<String> ans= new ArrayList<>();
        if(digits.length()==0) return ans;
        solve(0,digits, "",ans, mp);
        return ans;

    }
    private Map<Character, String> getMap(){
        Map<Character, String> mp = new HashMap<>();
        mp.put('2', "abc");
        mp.put('3', "def");
        mp.put('4', "ghi");
        mp.put('5', "jkl");
        mp.put('6', "mno");
        mp.put('7', "pqrs");
        mp.put('8', "tuv");
        mp.put('9', "wxyz");
        return mp;
    }
}