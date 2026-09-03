class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int ans= nums1[0]%2; 
        if(ans==1) return true; //odd case 
        else{
            //check for every number
            for(int i=1;i<nums1.length;i++){
                if(nums1[i]%2!=0) return false;
            }
        }
        return true;
    }
}