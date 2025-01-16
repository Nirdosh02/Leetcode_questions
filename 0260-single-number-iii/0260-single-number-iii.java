class Solution {
    public int[] singleNumber(int[] nums) {
        // Map<Integer, Integer> mp =new HashMap<>();
        
        int[] l = new int[2];
        // int i=0;
        // for(int a : nums){
        //     mp.put(a, mp.getOrDefault(a,0)+1);
        // }
        //  for (Map.Entry<Integer,Integer> e : mp.entrySet()) {
        //    if(e.getValue()==1){
        //     l[i++]=e.getKey();
        //    }
        // }
        // return l;

        long xorr=0;
        for(int n:nums){ xorr^=n;}
        long r=xorr&-xorr;
        int b1=0;
        int b2=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&r)!=0){ b1=b1^nums[i];}
            else{ b2=b2^nums[i];}
        }
        l[0]=b1;
        l[1]=b2;
        return l;

    }
}