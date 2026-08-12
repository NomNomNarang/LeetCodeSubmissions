class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //
        int sum=0;
        boolean ans=false;
        for(int i=0;i<flowerbed.length;i++){
        int left=(i==0)?0:flowerbed[i-1];
        int right=(i==flowerbed.length-1)?0:flowerbed[i+1];
          if(n==0) return true;
          if((flowerbed[i]==0 && left==0 && right==0)){
            flowerbed[i]=1;
            sum++;
            if(sum==n) ans=true;
          }
        }
        return ans;
    }
}