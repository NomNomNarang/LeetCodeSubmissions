class Solution {
    public int longestSubsequence(int[] nums) {
        int result=0;
        int val=0;
        for(int i=0;i<nums.length;i++){
             val=nums[i]^val;
        }
        
        if(val!=0){
               result=nums.length;
        }
        else {
          for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) {
                result=nums.length-1;
                break;
          }
         }
        }
        return result;
    }
}