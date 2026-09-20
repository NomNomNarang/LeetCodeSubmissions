class Solution {
    public int reverseDegree(String s) {
        //original string and reversed val
        int ans=0;
        char[] arr= s.toCharArray();
        for(int i=0;i<arr.length;i++){
            int val='z'-arr[i]+1;
            ans=ans+val*(i+1);
        }
        return ans;
    }
}