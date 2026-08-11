class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            int j=0;
            while(nums2[j]!=nums1[i]) j++;
            //if equal hogya hai
            int max=-1;
            for(int k=j+1;k<nums2.length;k++){
                if(nums2[k]>nums1[i]) {
                    max=nums2[k];
                    break;
                }
            }
            arr.add(max);

        }
        int[] result=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            result[i]=arr.get(i);
        }
        return result;
    }
}