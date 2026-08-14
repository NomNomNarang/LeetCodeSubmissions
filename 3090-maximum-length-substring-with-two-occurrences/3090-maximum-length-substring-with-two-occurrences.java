class Solution {
    public int maximumLengthSubstring(String s) {
        //conevrt to array 
        char[] arr= s.toCharArray();
        int[] result= new int[26];
        int left=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            result[arr[i]-'a']++;
            while (result[arr[i]-'a']>2) {
                result[arr[left]-'a']--;
                left++;
            }
            max=Math.max(max, i-left+1);
        }
        return max;
    }
}