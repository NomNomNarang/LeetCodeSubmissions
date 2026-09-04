class Solution {
    public int firstStableIndex(int[] nums, int k) {
        //return the array whose max - min <=k 
        //repetitively find min and max 
        // curr= nums[0] and next index will be suffix=nums[i+1];
        //curr++ and suffix++; and
        ArrayList<Integer> curr= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int max=Integer.MIN_VALUE;
            ArrayList<Integer> suffix=new ArrayList<>();
            curr.add(nums[i]);
            for(int num:curr){
                if(num>max) max=num;
            }
            suffix.clear();
            for(int j= i;j<nums.length;j++){
                suffix.add(nums[j]);
            }
            //find min
            int min=suffix.get(0);
            for(int num:suffix){
                if(num <min) min=num;
            }
            if(max-min<=k) return i;
        }
        return -1;
    }
}