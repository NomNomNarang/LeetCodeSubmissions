class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];
        }

        ArrayList<Integer> result= new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if(nums[i]==min){
                i++;
                min++;
            }
            else if(nums[i]>min) {
                result.add(min);
                min++;
            }
        }
        return result;
    }
}