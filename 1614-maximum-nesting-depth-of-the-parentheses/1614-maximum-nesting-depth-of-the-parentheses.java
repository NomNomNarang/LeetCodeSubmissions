class Solution {
    public int maxDepth(String s) {
        //using two pointers
        int counter=0;
        int maxcounter=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') counter++;
            if(s.charAt(i)==')') counter--;
            maxcounter=Math.max(maxcounter,counter);
        }
        return maxcounter;
    }

}