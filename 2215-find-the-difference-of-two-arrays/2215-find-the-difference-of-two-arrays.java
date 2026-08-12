class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        //basically compare both of them 
        List<Integer> result1=new ArrayList<>();
        List<Integer> result2=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            boolean found=true;
            for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]) {
                found=false;
                break;
            }
          }
            if(found && !result1.contains(nums1[i])) {
                result1.add(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            boolean found=true;
            for(int j=0;j<nums1.length;j++){
            if(nums2[i]==nums1[j]) {
                found=false;
                break;
            }
          }
            if(found && !result2.contains(nums2[i])) {
                result2.add(nums2[i]);
            }
        }
        List<List<Integer>> ans= new ArrayList<>();
        ans.add(result1);
        ans.add(result2);
        return ans;
    }
}