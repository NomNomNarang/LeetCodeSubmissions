class Solution {
    public int minimumDeletions(int[] nums) {
        int max= Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int index1=-1;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) {
                max=nums[i];
                index=i;
            }
        }
         for(int i=0;i<nums.length;i++){
            if(nums[i]<min) {
                min=nums[i];
                index1=i;
            }
        }
        //now we have min and max both;
        //now we have to find the number of deletions;
        int start= Math.max(index,index1)+1;
        int end= nums.length-Math.min(index,index1);
        int both=Math.min(index,index1)+1 +nums.length-Math.max(index,index1);
        return Math.min(start,Math.min(end,both));

    }
}