class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        //find minimum occurence in n 
         for(int i=0;i<k;i++){
            int min=Integer.MAX_VALUE;
            int minindex=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<min) {
                    min=nums[j];
                    minindex=j;
                }
                //we found the min element now lets move ahead, multiply min by multiplier
            }
                nums[minindex]=nums[minindex]*multiplier;
         }
         return nums;
    }
}