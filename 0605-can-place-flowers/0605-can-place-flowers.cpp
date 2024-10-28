class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        int c=0;
        int l = flowerbed.size();
        
        if(l==1 && flowerbed[0]==0 && n==1 ) return true;
        if(l>1 && flowerbed[0]==0){
            if(flowerbed[1]==0){
                flowerbed[0]=1;
                c++;
            }
        }
        for(int i=1; i<flowerbed.size()-1; i++){
            if(flowerbed[i] == 0){
                if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    c++;
                }
            }
        } 

        if(l>1 && flowerbed[l-1]==0){
            if(flowerbed[l-2] == 0){
                flowerbed[l-1]=1;
                c++;
            }
        }
        
        return c>=n;
    }
};