class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left =0;
        int right =0;
        int min = Integer.MAX_VALUE;
        int whites =0;
        while(right<blocks.length()){
            char curr = blocks.charAt(right);
            if(curr=='W'){
                whites++;
            }
            while(right-left+1>k){
                char leftchar = blocks.charAt(left);
                if(leftchar=='W'){
                    whites--;
                }
                left++;
            }
            if(right-left+1==k){
                min = Math.min(min, whites);
            }
            right++;
        }
        return min;
    }
}