class Solution {
    public int[] nextGreaterElements(int[] nums) {
        //circular search
        //core concept is nums[nums.length-1]= nums[0] and if they are equal get the next element
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=element(nums,i,i+1);
        }
        return result;
        
    }
    static int element(int[] nums, int current,int i){
        if(i==nums.length) i=0;
        if(i==current) return -1;
        if(nums[i]>nums[current]) return nums[i];
        return element(nums,current,i+1);
    }
}