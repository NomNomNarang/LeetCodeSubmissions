class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1) sum=sum+nums[i];
            else break;
        }
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        
        for(int i=0;i<arr.size();i++){
        // if(!arr.contains(sum)) return sum;
        if(sum<=100 && arr.contains(sum)){
            sum++;
          }
        }
        
        return sum;
    }
}