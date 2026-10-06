class Solution {
    public int scoreOfParentheses(String s) {
        int[] arr = new int[s.length()];
        int top = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                top++;
                arr[top] = 0;   // new depth, start fresh
            } 
            else {
                if (s.charAt(i - 1) == '(') {
                    // ()
                    arr[top - 1] += 1;
                } 
                else {
                    // (A)
                    arr[top - 1] += 2 * arr[top];
                }

                top--;
            }
        }

        return arr[0];
    }
}