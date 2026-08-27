class Solution {
    public int missingMultiple(int[] nums, int k) {
        //smallest positive
        //k ka multiple chaiye 
         HashMap<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
         }
         ArrayList<Integer> arr= new ArrayList<>();
         for(int key:map.keySet()){
            if(key%k==0){
                arr.add(key);
            }
         }
         int mul=k;
         while(arr.contains(mul)){
            mul=mul+k;
         }
         return mul;
    }
}