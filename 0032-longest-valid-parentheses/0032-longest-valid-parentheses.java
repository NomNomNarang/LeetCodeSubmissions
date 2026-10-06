class Solution {
    public int longestValidParentheses(String s) {
        int counter=0;
        int max=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') counter++;
            else{
                counter--;
            }

            if(counter==0) max = Math.max(max,i-start + 1);
            if(counter<0){
                counter=0;
                start=i+1;
            }
        }
        counter = 0;
        start = s.length() - 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')') {
                counter++;
            } else {
                counter--;
            }
            if (counter == 0) {
                max = Math.max(max, start - i + 1);
            }
            if (counter < 0) {
                counter = 0;
                start = i - 1;
            }
        }
        return max;
    }
}