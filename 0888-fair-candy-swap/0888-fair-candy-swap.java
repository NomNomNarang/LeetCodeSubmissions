class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
         int[] result= new int[2];
        // total number of candies alice has
        // total number of candies bob has
        // motive to make the sumequal;
        int sum=0;
        for(int i=0;i<aliceSizes.length;i++){
            sum=sum+aliceSizes[i];
        }
        int sum1=0;
         for(int i=0;i<bobSizes.length;i++){
            sum1=sum1+bobSizes[i];
        }
         for(int i=0;i<aliceSizes.length;i++){
            for(int j=0;j<bobSizes.length;j++){
                if(sum-aliceSizes[i]+bobSizes[j]==sum1-bobSizes[j]+aliceSizes[i]){
                    result[0]=aliceSizes[i];
                    result[1]=bobSizes[j];
                }
           }
        }
        return result;
    }
}