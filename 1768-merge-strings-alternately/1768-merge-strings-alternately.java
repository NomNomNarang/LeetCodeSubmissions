class Solution {
    public String mergeAlternately(String word1, String word2) {
        // convert to array merge 1 by 1
        char[] arr1=word1.toCharArray();
        char[] arr2=word2.toCharArray();
        StringBuilder ans= new StringBuilder();
        int i=0, j=0;
        int index=0;
        while(i<arr1.length && j<arr2.length){
           if(index%2==0) {
            ans.append(arr1[i]);
            i++;
           }
           else {
            ans.append(arr2[j]);
            j++;
           }
          index++;
        }
        while (i < arr1.length) {
    ans.append(arr1[i]);
    i++;
    index++;
}

while (j < arr2.length) {
    ans.append(arr2[j]);
    j++;
    index++;
}
        return ans.toString();
    }
}